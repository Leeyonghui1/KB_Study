using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SolT1
{
    public partial class LoginForm : Form
    {
        public LoginForm()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            this.Dispose();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string id = textBox1.Text;
            string pw = textBox2.Text;
            if(id == "admin" && pw == "1234")
                MessageBox.Show("관리자");
            if(id.Equals("admin") && pw.Equals("1234"))
                MessageBox.Show("관리자 하이");
        }

        private void label5_Click(object sender, EventArgs e)
        {
            Hide();  // 현재 창 숨김
            // Form2를 띄우고 코드는 멈춤(ShowDialog 때문에)
            //ShowDialog = 모달(Modal) => 뒤에 창 조작 불가능, 코드가 여기서 멈춤
            //Show = 모달리스(Modeless) => 뒤에 창 조작 가능, 코드가 멈추지 않음
            new Form2(textBox1.Text, textBox2.Text).ShowDialog();  
            Show(); // 현재 창 보여줌
        }

        private void button5_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("https://twitter.com/");
        }
    }
}
