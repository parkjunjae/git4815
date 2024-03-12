using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Drawing.Text;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using jjc;
using MySql.Data.MySqlClient;
using OrderForm;

namespace WindowsFormsApp3
{
    public partial class sale_payment : Form
    {
        String Connection = "datasource=192.168.0.49;port=3306;Database=burgerking;Uid=root;Pwd=1234;";
        public sale_payment()
        {
            InitializeComponent();
            listSelect();
        }

        #region 판매한 금액 list
        public void listSelect()
        {
            int totalCash = 0;
            int totalCard = 0;

            MySqlConnection conn = new MySqlConnection(Connection);
            conn.Open();
            MySqlCommand cmd = new MySqlCommand("SELECT * FROM payment", conn);
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                ListViewItem item = new ListViewItem(reader["order_id"].ToString());
                item.SubItems.Add(reader["payment_method"].ToString());
                item.SubItems.Add(reader["payment_amount"].ToString());
                item.SubItems.Add(reader["payment_time"].ToString());

                if (reader["payment_method"].ToString() == "현금")
                {

                    totalCash += Convert.ToInt32(reader["payment_amount"].ToString());

                }
                if (reader["payment_method"].ToString() == "카드")
                {
                    totalCard += Convert.ToInt32(reader["payment_amount"].ToString());
                }

                listView1.Items.Add(item);

            }
            textBox1.Text = totalCash.ToString() + "원";
            textBox2.Text = totalCard.ToString() + "원";

            // 총원 담기
            int totalPrice = 0;

            foreach (ListViewItem item in listView1.Items)
            {

                int price = int.Parse(item.SubItems[2].Text);
                totalPrice += price;
            }

            textBox3.Text = "총" + totalPrice.ToString() + "원";

            reader.Close();
            conn.Close();
        }
        #endregion

        #region 오늘매출 클릭 이벤트
        private void Today_Payment_Click(object sender, EventArgs e) // 오늘 매출을 클릭했을 때의 이벤트 
        {
            listView1.Items.Clear(); // listview 초기화
            int totalCash = 0; // 초기화
            int totalCard = 0; // 초기화 

            MySqlConnection conn = new MySqlConnection(Connection);
            conn.Open(); // db 연결 
            MySqlCommand cmd = new MySqlCommand("SELECT * FROM payment WHERE DATE(payment_time) = CURDATE()", conn); // sql문(오늘날짜의 payment를 select) 
            MySqlDataReader reader = cmd.ExecuteReader(); 
            while (reader.Read()) 
            {
                // listview 에 데이터 추가 
                ListViewItem item = new ListViewItem(reader["order_id"].ToString());
                item.SubItems.Add(reader["payment_method"].ToString());
                item.SubItems.Add(reader["payment_amount"].ToString());
                item.SubItems.Add(reader["payment_time"].ToString());

                if (reader["payment_method"].ToString() == "현금") // 현금 계산일시
                {
                    totalCash += Convert.ToInt32(reader["payment_amount"].ToString()); // int형으로 totalCash에 더하라

                }
                if (reader["payment_method"].ToString() == "카드") // 카드 계산일시
                {
                    totalCard += Convert.ToInt32(reader["payment_amount"].ToString()); // int형으로 totalCash에 더하라
                }

                listView1.Items.Add(item); // listview1에 추가해라 


            }
            

            textBox1.Text = totalCash.ToString() + "원"; // textBox1.Text에 출력하라 
            textBox2.Text = totalCard.ToString() + "원"; // textBox2.Text에 출력하라

            int totalPrice = 0; // total값을 초기화 

            foreach (ListViewItem item in listView1.Items)  // listview1.items 반복문 
            {
                int price = int.Parse(item.SubItems[2].Text); // 두번째값을 price에 넣어서
                totalPrice += price; //totalPrice에 더해줘라
            }

            textBox3.Text = "총" + totalPrice.ToString() + "원"; // 총값 나타내기

            reader.Close();
            conn.Close();
        }
        #endregion

        #region calender
        private void monthCalendar1_DateSelected(object sender, DateRangeEventArgs e)
        {
            DateTime selectedDate = monthCalendar1.SelectionStart.Date;
            listView1.Items.Clear();
            int totalCash = 0;
            int totalCard = 0;

            MySqlConnection conn = new MySqlConnection(Connection);
            conn.Open();
            MySqlCommand cmd = new MySqlCommand("SELECT * FROM payment WHERE DATE(payment_time) = @selectedDate", conn);
            cmd.Parameters.AddWithValue("@selectedDate", selectedDate);
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read())
            {
                ListViewItem item = new ListViewItem(reader["order_id"].ToString());
                item.SubItems.Add(reader["payment_method"].ToString());
                item.SubItems.Add(reader["payment_amount"].ToString());
                item.SubItems.Add(reader["payment_time"].ToString());

                if (reader["payment_method"].ToString() == "현금")
                {
                    totalCash += Convert.ToInt32(reader["payment_amount"].ToString());

                }
                if (reader["payment_method"].ToString() == "카드")
                {
                    totalCard += Convert.ToInt32(reader["payment_amount"].ToString());
                }

                listView1.Items.Add(item);


            }
            textBox1.Text = totalCash.ToString() + "원";
            textBox2.Text = totalCard.ToString() + "원";

            int totalPrice = 0;

            foreach (ListViewItem item in listView1.Items)
            {
                int price = int.Parse(item.SubItems[2].Text);
                totalPrice += price;
            }

            textBox3.Text = "총" + totalPrice.ToString() + "원";

            reader.Close();
            conn.Close();
        }
        #endregion

        #region 주문페이지
        private void button1_Click(object sender, EventArgs e)
        {
            Main_form main_Form = new Main_form();
            main_Form.Show();
            this.Hide();
        }

        #endregion

        #region 재고관리
        private void 재고관리(object sender, EventArgs e)
        {
            Inventory inventory = new Inventory();
            inventory.Show();
            this.Hide();
        }
        #endregion

        private void sale_payment_Load(object sender, EventArgs e)
        {

        }
    }
}
