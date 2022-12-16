using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace T1
{
    public partial class MainForm : Form
    {
        public MainForm()
        {
            InitializeComponent();
        }

        private void button_login_Click(object sender, EventArgs e)
        {
            string id = textBox_id.Text;
            if(id.Equals("admin"))
                MessageBox.Show("관리자님 환영합니다.");
            else
                MessageBox.Show($"{textBox_id.Text}님 환영합니다.");

        }

        private void button_login2_Click(object sender, EventArgs e)
        {
            SubForm s = new SubForm(textBox_id.Text);
            s.Show();
        }

        private void button_power_Click(object sender, EventArgs e)
        {
            this.Dispose();
        }
    }
}
