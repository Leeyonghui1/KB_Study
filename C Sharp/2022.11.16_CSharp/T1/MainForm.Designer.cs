namespace T1
{
    partial class MainForm
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(MainForm));
            this.textBox_id = new System.Windows.Forms.TextBox();
            this.textBox_pw = new System.Windows.Forms.TextBox();
            this.button_login = new System.Windows.Forms.Button();
            this.button_login2 = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.label_login = new System.Windows.Forms.Label();
            this.label_id = new System.Windows.Forms.Label();
            this.label_pw = new System.Windows.Forms.Label();
            this.label_msg = new System.Windows.Forms.Label();
            this.label_signup = new System.Windows.Forms.Label();
            this.button_call = new System.Windows.Forms.Button();
            this.button_mail = new System.Windows.Forms.Button();
            this.button_twit = new System.Windows.Forms.Button();
            this.button_join = new System.Windows.Forms.Button();
            this.button_power = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // textBox_id
            // 
            this.textBox_id.Location = new System.Drawing.Point(221, 102);
            this.textBox_id.Name = "textBox_id";
            this.textBox_id.Size = new System.Drawing.Size(214, 27);
            this.textBox_id.TabIndex = 0;
            // 
            // textBox_pw
            // 
            this.textBox_pw.Location = new System.Drawing.Point(221, 160);
            this.textBox_pw.Name = "textBox_pw";
            this.textBox_pw.Size = new System.Drawing.Size(214, 27);
            this.textBox_pw.TabIndex = 1;
            this.textBox_pw.UseSystemPasswordChar = true;
            // 
            // button_login
            // 
            this.button_login.BackColor = System.Drawing.Color.Crimson;
            this.button_login.FlatAppearance.BorderSize = 0;
            this.button_login.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_login.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_login.ForeColor = System.Drawing.Color.White;
            this.button_login.Location = new System.Drawing.Point(219, 212);
            this.button_login.Name = "button_login";
            this.button_login.Size = new System.Drawing.Size(105, 50);
            this.button_login.TabIndex = 2;
            this.button_login.Text = "로그인";
            this.button_login.UseVisualStyleBackColor = false;
            this.button_login.Click += new System.EventHandler(this.button_login_Click);
            // 
            // button_login2
            // 
            this.button_login2.BackColor = System.Drawing.Color.Crimson;
            this.button_login2.FlatAppearance.BorderSize = 0;
            this.button_login2.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_login2.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.button_login2.ForeColor = System.Drawing.Color.White;
            this.button_login2.Location = new System.Drawing.Point(330, 212);
            this.button_login2.Name = "button_login2";
            this.button_login2.Size = new System.Drawing.Size(105, 50);
            this.button_login2.TabIndex = 3;
            this.button_login2.Text = "로그인2";
            this.button_login2.UseVisualStyleBackColor = false;
            this.button_login2.Click += new System.EventHandler(this.button_login2_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.Dock = System.Windows.Forms.DockStyle.Right;
            this.pictureBox1.Image = ((System.Drawing.Image)(resources.GetObject("pictureBox1.Image")));
            this.pictureBox1.Location = new System.Drawing.Point(532, 0);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(357, 395);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 4;
            this.pictureBox1.TabStop = false;
            // 
            // label_login
            // 
            this.label_login.AutoSize = true;
            this.label_login.Font = new System.Drawing.Font("Century Gothic", 21.75F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label_login.Location = new System.Drawing.Point(55, 38);
            this.label_login.Name = "label_login";
            this.label_login.Size = new System.Drawing.Size(150, 36);
            this.label_login.TabIndex = 5;
            this.label_login.Text = "Login First";
            // 
            // label_id
            // 
            this.label_id.AutoSize = true;
            this.label_id.Location = new System.Drawing.Point(170, 102);
            this.label_id.Name = "label_id";
            this.label_id.Size = new System.Drawing.Size(35, 21);
            this.label_id.TabIndex = 6;
            this.label_id.Text = "ID :";
            // 
            // label_pw
            // 
            this.label_pw.AutoSize = true;
            this.label_pw.Location = new System.Drawing.Point(163, 160);
            this.label_pw.Name = "label_pw";
            this.label_pw.Size = new System.Drawing.Size(42, 21);
            this.label_pw.TabIndex = 6;
            this.label_pw.Text = "PW :";
            // 
            // label_msg
            // 
            this.label_msg.AutoSize = true;
            this.label_msg.Location = new System.Drawing.Point(23, 360);
            this.label_msg.Name = "label_msg";
            this.label_msg.Size = new System.Drawing.Size(206, 21);
            this.label_msg.TabIndex = 6;
            this.label_msg.Text = "Don\'t Have an Account?";
            // 
            // label_signup
            // 
            this.label_signup.AutoSize = true;
            this.label_signup.Cursor = System.Windows.Forms.Cursors.Hand;
            this.label_signup.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label_signup.ForeColor = System.Drawing.Color.Crimson;
            this.label_signup.Location = new System.Drawing.Point(235, 360);
            this.label_signup.Name = "label_signup";
            this.label_signup.Size = new System.Drawing.Size(67, 19);
            this.label_signup.TabIndex = 6;
            this.label_signup.Text = "Sign Up";
            // 
            // button_call
            // 
            this.button_call.FlatAppearance.BorderSize = 0;
            this.button_call.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_call.Image = ((System.Drawing.Image)(resources.GetObject("button_call.Image")));
            this.button_call.Location = new System.Drawing.Point(313, 338);
            this.button_call.Name = "button_call";
            this.button_call.Size = new System.Drawing.Size(46, 45);
            this.button_call.TabIndex = 7;
            this.button_call.UseVisualStyleBackColor = true;
            // 
            // button_mail
            // 
            this.button_mail.FlatAppearance.BorderSize = 0;
            this.button_mail.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_mail.Image = ((System.Drawing.Image)(resources.GetObject("button_mail.Image")));
            this.button_mail.Location = new System.Drawing.Point(365, 338);
            this.button_mail.Name = "button_mail";
            this.button_mail.Size = new System.Drawing.Size(46, 45);
            this.button_mail.TabIndex = 7;
            this.button_mail.UseVisualStyleBackColor = true;
            // 
            // button_twit
            // 
            this.button_twit.FlatAppearance.BorderSize = 0;
            this.button_twit.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_twit.Image = ((System.Drawing.Image)(resources.GetObject("button_twit.Image")));
            this.button_twit.Location = new System.Drawing.Point(417, 338);
            this.button_twit.Name = "button_twit";
            this.button_twit.Size = new System.Drawing.Size(46, 45);
            this.button_twit.TabIndex = 7;
            this.button_twit.UseVisualStyleBackColor = true;
            // 
            // button_join
            // 
            this.button_join.FlatAppearance.BorderSize = 0;
            this.button_join.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_join.Image = ((System.Drawing.Image)(resources.GetObject("button_join.Image")));
            this.button_join.Location = new System.Drawing.Point(469, 338);
            this.button_join.Name = "button_join";
            this.button_join.Size = new System.Drawing.Size(46, 45);
            this.button_join.TabIndex = 7;
            this.button_join.UseVisualStyleBackColor = true;
            // 
            // button_power
            // 
            this.button_power.BackColor = System.Drawing.Color.White;
            this.button_power.FlatAppearance.BorderSize = 0;
            this.button_power.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.button_power.Image = ((System.Drawing.Image)(resources.GetObject("button_power.Image")));
            this.button_power.Location = new System.Drawing.Point(843, 0);
            this.button_power.Name = "button_power";
            this.button_power.Size = new System.Drawing.Size(46, 45);
            this.button_power.TabIndex = 7;
            this.button_power.UseVisualStyleBackColor = false;
            this.button_power.Click += new System.EventHandler(this.button_power_Click);
            // 
            // MainForm
            // 
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.None;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(889, 395);
            this.Controls.Add(this.button_join);
            this.Controls.Add(this.button_twit);
            this.Controls.Add(this.button_mail);
            this.Controls.Add(this.button_power);
            this.Controls.Add(this.button_call);
            this.Controls.Add(this.label_signup);
            this.Controls.Add(this.label_msg);
            this.Controls.Add(this.label_pw);
            this.Controls.Add(this.label_id);
            this.Controls.Add(this.label_login);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.button_login2);
            this.Controls.Add(this.button_login);
            this.Controls.Add(this.textBox_pw);
            this.Controls.Add(this.textBox_id);
            this.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "MainForm";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "MainForm";
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox textBox_id;
        private System.Windows.Forms.TextBox textBox_pw;
        private System.Windows.Forms.Button button_login;
        private System.Windows.Forms.Button button_login2;
        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.Label label_login;
        private System.Windows.Forms.Label label_id;
        private System.Windows.Forms.Label label_pw;
        private System.Windows.Forms.Label label_msg;
        private System.Windows.Forms.Label label_signup;
        private System.Windows.Forms.Button button_call;
        private System.Windows.Forms.Button button_mail;
        private System.Windows.Forms.Button button_twit;
        private System.Windows.Forms.Button button_join;
        private System.Windows.Forms.Button button_power;
    }
}

