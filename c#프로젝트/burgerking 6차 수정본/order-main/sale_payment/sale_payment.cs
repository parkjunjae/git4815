using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Drawing.Text;
using System.Linq;
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
            int totalCash = 0; // 현금 총합 초기화
            int totalCard = 0; // 카드 총합 초기화

            MySqlConnection conn = new MySqlConnection(Connection); //db 연결
            conn.Open();
            MySqlCommand cmd = new MySqlCommand("SELECT * FROM payment", conn); 
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read()) // sql문 실행 
            {
                ListViewItem item = new ListViewItem(reader["order_id"].ToString()); // 출력 
                item.SubItems.Add(reader["payment_method"].ToString());
                item.SubItems.Add(reader["payment_amount"].ToString());
                item.SubItems.Add(reader["payment_time"].ToString());

                if (reader["payment_method"].ToString() == "현금")
                {
                    totalCash += Convert.ToInt32(reader["payment_amount"].ToString()); // 현금값을 따로 총합해서 출력

                }
                if (reader["payment_method"].ToString() == "카드")
                {
                    totalCard += Convert.ToInt32(reader["payment_amount"].ToString());// 카드값을 따로 총합해서 출력
                }

                listView1.Items.Add(item); // list.View에 보여줘라

            }
            textBox1.Text = totalCash.ToString() + "원"; // 현금합한걸 textBox1 에 text 나타내라

            textBox2.Text = totalCard.ToString() + "원"; // 카드합한걸 textBox2 에 text 나타내라

            
            int totalPrice = 0; // 총원 초기화 

            foreach (ListViewItem item in listView1.Items)
            {

                int price = int.Parse(item.SubItems[2].Text); //가격에 대한 카드와 현금 합
                totalPrice += price; // 모두 더해라 
            }

            label1.Text = "총" + totalPrice.ToString() + "원";  //label1에 총합을 나타내라 

            reader.Close(); 
            conn.Close(); //db 연결 해제
        }
        #endregion

        #region 오늘매출 클릭 이벤트
        private void Today_Payment_Click(object sender, EventArgs e)
        {
            listView1.Items.Clear();
            int totalCash = 0;
            int totalCard = 0;

            MySqlConnection conn = new MySqlConnection(Connection);
            conn.Open();
            MySqlCommand cmd = new MySqlCommand("SELECT * FROM payment WHERE DATE(payment_time) = CURDATE()", conn); // 오늘 날짜에 대한 sql문 실행 
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

            label1.Text = "총" + totalPrice.ToString() + "원";

            reader.Close();
            conn.Close();
        }
        #endregion


        #region calender
        private void monthCalendar1_DateSelected(object sender, DateRangeEventArgs e)
        {
            DateTime selectedDate = monthCalendar1.SelectionStart.Date; // 선택한 날짜를 selectedDate에 담는다.
            listView1.Items.Clear();
            int totalCash = 0;
            int totalCard = 0;

            MySqlConnection conn = new MySqlConnection(Connection); //db 연결
            conn.Open();
            MySqlCommand cmd = new MySqlCommand("SELECT * FROM payment WHERE DATE(payment_time) = @selectedDate", conn);
            cmd.Parameters.AddWithValue("@selectedDate", selectedDate);
            MySqlDataReader reader = cmd.ExecuteReader();
            while (reader.Read()) // sql 실행 
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

            foreach (ListViewItem item in listView1.Items) // 반복문 실행 
            {
                int price = int.Parse(item.SubItems[2].Text);
                totalPrice += price;
            }

            label1.Text = "총" + totalPrice.ToString() + "원";

            reader.Close();
            conn.Close();
        }
        #endregion
        #region 주문페이지
        private void button1_Click(object sender, EventArgs e)
        {
            Main_form main_Form = new Main_form(); // 객체 생성 해주고 
            main_Form.Show(); // MainForm에 을 보여줘라 
            this.Hide(); // 지금의 폼은 없어지게 해라 
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
