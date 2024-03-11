namespace WindowsFormsApp3
{
    partial class sale_payment
    {
        /// <summary>
        /// 필수 디자이너 변수입니다.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 사용 중인 모든 리소스를 정리합니다.
        /// </summary>
        /// <param name="disposing">관리되는 리소스를 삭제해야 하면 true이고, 그렇지 않으면 false입니다.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form 디자이너에서 생성한 코드

        /// <summary>
        /// 디자이너 지원에 필요한 메서드입니다. 
        /// 이 메서드의 내용을 코드 편집기로 수정하지 마세요.
        /// </summary>
        private void InitializeComponent()
        {
            listView1 = new ListView();
            columnHeader2 = new ColumnHeader();
            columnHeader3 = new ColumnHeader();
            columnHeader4 = new ColumnHeader();
            columnHeader5 = new ColumnHeader();
            Today_payment = new Button();
            label1 = new Label();
            monthCalendar1 = new MonthCalendar();
            button2 = new Button();
            label2 = new Label();
            label3 = new Label();
            textBox2 = new TextBox();
            textBox1 = new TextBox();
            backgroundWorker1 = new System.ComponentModel.BackgroundWorker();
            groupBox1 = new GroupBox();
            groupBox2 = new GroupBox();
            button1 = new Button();
            helpProvider1 = new HelpProvider();
            groupBox1.SuspendLayout();
            groupBox2.SuspendLayout();
            SuspendLayout();
            // 
            // listView1
            // 
            listView1.Columns.AddRange(new ColumnHeader[] { columnHeader2, columnHeader3, columnHeader4, columnHeader5 });
            listView1.GridLines = true;
            listView1.Location = new Point(38, 28);
            listView1.Margin = new Padding(3, 4, 3, 4);
            listView1.Name = "listView1";
            listView1.Size = new Size(491, 296);
            listView1.TabIndex = 0;
            listView1.UseCompatibleStateImageBehavior = false;
            listView1.View = View.Details;
            // 
            // columnHeader2
            // 
            columnHeader2.Text = "주문번호";
            columnHeader2.Width = 100;
            // 
            // columnHeader3
            // 
            columnHeader3.Text = "결제방법";
            columnHeader3.Width = 100;
            // 
            // columnHeader4
            // 
            columnHeader4.Text = "결제금액";
            columnHeader4.Width = 100;
            // 
            // columnHeader5
            // 
            columnHeader5.Text = "결제시간";
            columnHeader5.Width = 200;
            // 
            // Today_payment
            // 
            Today_payment.BackColor = Color.DarkBlue;
            Today_payment.Font = new Font("맑은 고딕", 15F);
            Today_payment.ForeColor = SystemColors.ControlLightLight;
            Today_payment.Location = new Point(578, 385);
            Today_payment.Margin = new Padding(3, 4, 3, 4);
            Today_payment.Name = "Today_payment";
            Today_payment.Size = new Size(253, 106);
            Today_payment.TabIndex = 1;
            Today_payment.Text = "오늘매출";
            Today_payment.UseVisualStyleBackColor = false;
            Today_payment.Click += Today_Payment_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("굴림", 36F, FontStyle.Regular, GraphicsUnit.Point, 129);
            label1.Location = new Point(76, 333);
            label1.Name = "label1";
            label1.Size = new Size(164, 48);
            label1.TabIndex = 4;
            label1.Text = "총합계";
            // 
            // monthCalendar1
            // 
            monthCalendar1.Location = new Point(24, 176);
            monthCalendar1.Margin = new Padding(9, 11, 9, 11);
            monthCalendar1.Name = "monthCalendar1";
            monthCalendar1.TabIndex = 10;
            monthCalendar1.DateSelected += monthCalendar1_DateSelected;
            // 
            // button2
            // 
            button2.BackColor = SystemColors.Highlight;
            button2.Font = new Font("맑은 고딕", 12F);
            button2.Location = new Point(160, 29);
            button2.Margin = new Padding(3, 4, 3, 4);
            button2.Name = "button2";
            button2.Size = new Size(110, 63);
            button2.TabIndex = 13;
            button2.Text = "재고관리";
            button2.UseVisualStyleBackColor = false;
            button2.Click += 재고관리;
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("굴림", 15.75F, FontStyle.Regular, GraphicsUnit.Point, 129);
            label2.Location = new Point(81, 5);
            label2.Name = "label2";
            label2.Size = new Size(94, 21);
            label2.TabIndex = 11;
            label2.Text = "현금합계";
            // 
            // label3
            // 
            label3.AutoSize = true;
            label3.Font = new Font("굴림", 15.75F, FontStyle.Regular, GraphicsUnit.Point, 129);
            label3.Location = new Point(81, 94);
            label3.Name = "label3";
            label3.Size = new Size(94, 21);
            label3.TabIndex = 12;
            label3.Text = "카드합계";
            // 
            // textBox2
            // 
            textBox2.Location = new Point(0, 135);
            textBox2.Margin = new Padding(3, 4, 3, 4);
            textBox2.Name = "textBox2";
            textBox2.Size = new Size(253, 23);
            textBox2.TabIndex = 8;
            // 
            // textBox1
            // 
            textBox1.Location = new Point(0, 46);
            textBox1.Margin = new Padding(3, 4, 3, 4);
            textBox1.Name = "textBox1";
            textBox1.Size = new Size(256, 23);
            textBox1.TabIndex = 7;
            // 
            // groupBox1
            // 
            groupBox1.Controls.Add(monthCalendar1);
            groupBox1.Controls.Add(textBox2);
            groupBox1.Controls.Add(textBox1);
            groupBox1.Controls.Add(label2);
            groupBox1.Controls.Add(label3);
            groupBox1.Location = new Point(577, 6);
            groupBox1.Margin = new Padding(3, 4, 3, 4);
            groupBox1.Name = "groupBox1";
            groupBox1.Padding = new Padding(3, 4, 3, 4);
            groupBox1.Size = new Size(256, 370);
            groupBox1.TabIndex = 14;
            groupBox1.TabStop = false;
            // 
            // groupBox2
            // 
            groupBox2.Controls.Add(button1);
            groupBox2.Controls.Add(button2);
            groupBox2.Location = new Point(126, 385);
            groupBox2.Margin = new Padding(3, 4, 3, 4);
            groupBox2.Name = "groupBox2";
            groupBox2.Padding = new Padding(3, 4, 3, 4);
            groupBox2.Size = new Size(291, 106);
            groupBox2.TabIndex = 15;
            groupBox2.TabStop = false;
            // 
            // button1
            // 
            button1.BackColor = SystemColors.Highlight;
            button1.Font = new Font("맑은 고딕", 12F);
            button1.Location = new Point(21, 29);
            button1.Name = "button1";
            button1.Size = new Size(110, 63);
            button1.TabIndex = 16;
            button1.Text = "주문";
            button1.UseVisualStyleBackColor = false;
            button1.Click += button1_Click;
            // 
            // sale_payment
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = Color.Azure;
            ClientSize = new Size(897, 504);
            Controls.Add(groupBox2);
            Controls.Add(groupBox1);
            Controls.Add(label1);
            Controls.Add(Today_payment);
            Controls.Add(listView1);
            Margin = new Padding(3, 4, 3, 4);
            Name = "sale_payment";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Form1";
            Load += sale_payment_Load;
            groupBox1.ResumeLayout(false);
            groupBox1.PerformLayout();
            groupBox2.ResumeLayout(false);
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private System.Windows.Forms.ListView listView1;
        private System.Windows.Forms.Button Today_payment;
        private System.Windows.Forms.ColumnHeader columnHeader2;
        private System.Windows.Forms.ColumnHeader columnHeader3;
        private System.Windows.Forms.ColumnHeader columnHeader4;
        private System.Windows.Forms.ColumnHeader columnHeader5;
        
        private System.Windows.Forms.Label label1;
        
        private System.Windows.Forms.MonthCalendar monthCalendar1;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox textBox2;
        private System.Windows.Forms.TextBox textBox1;
        private System.ComponentModel.BackgroundWorker backgroundWorker1;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.GroupBox groupBox2;
        private System.Windows.Forms.HelpProvider helpProvider1;
        private Button button1;
    }
}

