namespace T1
{
    partial class Form1
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
            this.button1 = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.textBox_width = new System.Windows.Forms.TextBox();
            this.textBox_length = new System.Windows.Forms.TextBox();
            this.textBox_height = new System.Windows.Forms.TextBox();
            this.textBox_radius = new System.Windows.Forms.TextBox();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.button4 = new System.Windows.Forms.Button();
            this.label_outrect = new System.Windows.Forms.Label();
            this.label_outcircle = new System.Windows.Forms.Label();
            this.label_outcuboid = new System.Windows.Forms.Label();
            this.label_outsphere = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(28, 200);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(141, 48);
            this.button1.TabIndex = 0;
            this.button1.Text = "직사각형";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(34, 32);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(41, 12);
            this.label1.TabIndex = 1;
            this.label1.Text = "가로  :";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(34, 62);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 12);
            this.label2.TabIndex = 2;
            this.label2.Text = "세로  :";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(34, 92);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(41, 12);
            this.label3.TabIndex = 3;
            this.label3.Text = "높이  :";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(26, 137);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(49, 12);
            this.label4.TabIndex = 4;
            this.label4.Text = "반지름 :";
            // 
            // textBox_width
            // 
            this.textBox_width.Location = new System.Drawing.Point(81, 29);
            this.textBox_width.Name = "textBox_width";
            this.textBox_width.Size = new System.Drawing.Size(134, 21);
            this.textBox_width.TabIndex = 5;
            // 
            // textBox_length
            // 
            this.textBox_length.Location = new System.Drawing.Point(81, 59);
            this.textBox_length.Name = "textBox_length";
            this.textBox_length.Size = new System.Drawing.Size(134, 21);
            this.textBox_length.TabIndex = 6;
            // 
            // textBox_height
            // 
            this.textBox_height.Location = new System.Drawing.Point(81, 89);
            this.textBox_height.Name = "textBox_height";
            this.textBox_height.Size = new System.Drawing.Size(134, 21);
            this.textBox_height.TabIndex = 7;
            // 
            // textBox_radius
            // 
            this.textBox_radius.Location = new System.Drawing.Point(81, 134);
            this.textBox_radius.Name = "textBox_radius";
            this.textBox_radius.Size = new System.Drawing.Size(134, 21);
            this.textBox_radius.TabIndex = 8;
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(204, 200);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(113, 48);
            this.button2.TabIndex = 9;
            this.button2.Text = "원";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(354, 200);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(112, 48);
            this.button3.TabIndex = 10;
            this.button3.Text = "직육면체";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // button4
            // 
            this.button4.Location = new System.Drawing.Point(501, 200);
            this.button4.Name = "button4";
            this.button4.Size = new System.Drawing.Size(114, 48);
            this.button4.TabIndex = 11;
            this.button4.Text = "구";
            this.button4.UseVisualStyleBackColor = true;
            this.button4.Click += new System.EventHandler(this.button4_Click);
            // 
            // label_outrect
            // 
            this.label_outrect.AutoSize = true;
            this.label_outrect.Location = new System.Drawing.Point(37, 280);
            this.label_outrect.Name = "label_outrect";
            this.label_outrect.Size = new System.Drawing.Size(38, 12);
            this.label_outrect.TabIndex = 12;
            this.label_outrect.Text = "label5";
            // 
            // label_outcircle
            // 
            this.label_outcircle.AutoSize = true;
            this.label_outcircle.Location = new System.Drawing.Point(202, 280);
            this.label_outcircle.Name = "label_outcircle";
            this.label_outcircle.Size = new System.Drawing.Size(38, 12);
            this.label_outcircle.TabIndex = 13;
            this.label_outcircle.Text = "label6";
            // 
            // label_outcuboid
            // 
            this.label_outcuboid.AutoSize = true;
            this.label_outcuboid.Location = new System.Drawing.Point(352, 280);
            this.label_outcuboid.Name = "label_outcuboid";
            this.label_outcuboid.Size = new System.Drawing.Size(38, 12);
            this.label_outcuboid.TabIndex = 14;
            this.label_outcuboid.Text = "label7";
            // 
            // label_outsphere
            // 
            this.label_outsphere.AutoSize = true;
            this.label_outsphere.Location = new System.Drawing.Point(499, 280);
            this.label_outsphere.Name = "label_outsphere";
            this.label_outsphere.Size = new System.Drawing.Size(38, 12);
            this.label_outsphere.TabIndex = 15;
            this.label_outsphere.Text = "label8";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.label_outsphere);
            this.Controls.Add(this.label_outcuboid);
            this.Controls.Add(this.label_outcircle);
            this.Controls.Add(this.label_outrect);
            this.Controls.Add(this.button4);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.textBox_radius);
            this.Controls.Add(this.textBox_height);
            this.Controls.Add(this.textBox_length);
            this.Controls.Add(this.textBox_width);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox textBox_width;
        private System.Windows.Forms.TextBox textBox_length;
        private System.Windows.Forms.TextBox textBox_height;
        private System.Windows.Forms.TextBox textBox_radius;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
        private System.Windows.Forms.Button button4;
        private System.Windows.Forms.Label label_outrect;
        private System.Windows.Forms.Label label_outcircle;
        private System.Windows.Forms.Label label_outcuboid;
        private System.Windows.Forms.Label label_outsphere;
    }
}

