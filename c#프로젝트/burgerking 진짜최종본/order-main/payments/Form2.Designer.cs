namespace projecttest
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            button1 = new Button();
            button2 = new Button();
            label1 = new Label();
            label2 = new Label();
            Lb_Pay_Price = new Label();
            SuspendLayout();
            // 
            // button1
            // 
            button1.Font = new Font("맑은 고딕", 39.75F);
            button1.Location = new Point(48, 206);
            button1.Name = "button1";
            button1.Size = new Size(180, 150);
            button1.TabIndex = 0;
            button1.Text = "현금";
            button1.UseVisualStyleBackColor = true;
            button1.Click += button1_Click;
            // 
            // button2
            // 
            button2.Font = new Font("맑은 고딕", 39.75F);
            button2.Location = new Point(278, 206);
            button2.Name = "button2";
            button2.Size = new Size(180, 150);
            button2.TabIndex = 1;
            button2.Text = "카드";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Font = new Font("맑은 고딕", 40F, FontStyle.Regular, GraphicsUnit.Pixel);
            label1.Location = new Point(48, 125);
            label1.Name = "label1";
            label1.Size = new Size(272, 54);
            label1.TabIndex = 2;
            label1.Text = "선택해주세요.";
            // 
            // label2
            // 
            label2.AutoSize = true;
            label2.Font = new Font("맑은 고딕", 18F, FontStyle.Regular, GraphicsUnit.Point, 129);
            label2.Location = new Point(62, 48);
            label2.Name = "label2";
            label2.Size = new Size(110, 32);
            label2.TabIndex = 3;
            label2.Text = "결제금액";
            // 
            // Lb_Pay_Price
            // 
            Lb_Pay_Price.AutoSize = true;
            Lb_Pay_Price.BackColor = Color.White;
            Lb_Pay_Price.BorderStyle = BorderStyle.Fixed3D;
            Lb_Pay_Price.Font = new Font("맑은 고딕", 18F, FontStyle.Bold, GraphicsUnit.Point, 129);
            Lb_Pay_Price.Location = new Point(278, 48);
            Lb_Pay_Price.Name = "Lb_Pay_Price";
            Lb_Pay_Price.Size = new Size(152, 34);
            Lb_Pay_Price.TabIndex = 7;
            Lb_Pay_Price.Text = "                 ";
            // 
            // Form2
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(515, 408);
            Controls.Add(Lb_Pay_Price);
            Controls.Add(label2);
            Controls.Add(label1);
            Controls.Add(button2);
            Controls.Add(button1);
            Location = new Point(-106, 775);
            Name = "Form2";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Form2";
            Load += Form2_Load;
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button button1;
        private Button button2;
        private Label label1;
        private Label label2;
        private Label Lb_Pay_Price;
    }
}