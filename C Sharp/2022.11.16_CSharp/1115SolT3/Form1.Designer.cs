﻿namespace _1115SolT3
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
            this.button_plus = new System.Windows.Forms.Button();
            this.button_minus = new System.Windows.Forms.Button();
            this.button_mul = new System.Windows.Forms.Button();
            this.button_div = new System.Windows.Forms.Button();
            this.button_mod = new System.Windows.Forms.Button();
            this.textBox_one = new System.Windows.Forms.TextBox();
            this.textBox_two = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // button_plus
            // 
            this.button_plus.Location = new System.Drawing.Point(373, 50);
            this.button_plus.Name = "button_plus";
            this.button_plus.Size = new System.Drawing.Size(75, 23);
            this.button_plus.TabIndex = 0;
            this.button_plus.Text = "+";
            this.button_plus.UseVisualStyleBackColor = true;
            this.button_plus.Click += new System.EventHandler(this.button_plus_Click);
            // 
            // button_minus
            // 
            this.button_minus.Location = new System.Drawing.Point(373, 113);
            this.button_minus.Name = "button_minus";
            this.button_minus.Size = new System.Drawing.Size(75, 23);
            this.button_minus.TabIndex = 1;
            this.button_minus.Text = "-";
            this.button_minus.UseVisualStyleBackColor = true;
            this.button_minus.Click += new System.EventHandler(this.button_minus_Click);
            // 
            // button_mul
            // 
            this.button_mul.Location = new System.Drawing.Point(373, 186);
            this.button_mul.Name = "button_mul";
            this.button_mul.Size = new System.Drawing.Size(75, 23);
            this.button_mul.TabIndex = 2;
            this.button_mul.Text = "*";
            this.button_mul.UseVisualStyleBackColor = true;
            this.button_mul.Click += new System.EventHandler(this.button_mul_Click);
            // 
            // button_div
            // 
            this.button_div.Location = new System.Drawing.Point(373, 262);
            this.button_div.Name = "button_div";
            this.button_div.Size = new System.Drawing.Size(75, 23);
            this.button_div.TabIndex = 3;
            this.button_div.Text = "/";
            this.button_div.UseVisualStyleBackColor = true;
            this.button_div.Click += new System.EventHandler(this.button_div_Click);
            // 
            // button_mod
            // 
            this.button_mod.Location = new System.Drawing.Point(373, 330);
            this.button_mod.Name = "button_mod";
            this.button_mod.Size = new System.Drawing.Size(75, 23);
            this.button_mod.TabIndex = 4;
            this.button_mod.Text = "%";
            this.button_mod.UseVisualStyleBackColor = true;
            this.button_mod.Click += new System.EventHandler(this.button_mod_Click);
            // 
            // textBox_one
            // 
            this.textBox_one.Location = new System.Drawing.Point(78, 113);
            this.textBox_one.Name = "textBox_one";
            this.textBox_one.Size = new System.Drawing.Size(100, 21);
            this.textBox_one.TabIndex = 5;
            // 
            // textBox_two
            // 
            this.textBox_two.Location = new System.Drawing.Point(78, 202);
            this.textBox_two.Name = "textBox_two";
            this.textBox_two.Size = new System.Drawing.Size(100, 21);
            this.textBox_two.TabIndex = 6;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(7F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.textBox_two);
            this.Controls.Add(this.textBox_one);
            this.Controls.Add(this.button_mod);
            this.Controls.Add(this.button_div);
            this.Controls.Add(this.button_mul);
            this.Controls.Add(this.button_minus);
            this.Controls.Add(this.button_plus);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button_plus;
        private System.Windows.Forms.Button button_minus;
        private System.Windows.Forms.Button button_mul;
        private System.Windows.Forms.Button button_div;
        private System.Windows.Forms.Button button_mod;
        private System.Windows.Forms.TextBox textBox_one;
        private System.Windows.Forms.TextBox textBox_two;
    }
}

