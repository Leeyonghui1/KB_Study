using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace T3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            label_result.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            MyMath m = new MyMath();
            int result = m.Power(int.Parse(textBox_x.Text));
            label_result.Text = $"입력한 숫자(x)의 제곱 결과 : {result}";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            MyMath m = new MyMath();
            int result = m.Power(int.Parse(textBox_x.Text), int.Parse(textBox_c.Text));
            label_result.Text = $"입력한 숫자(x)의 c승 결과 : {result}";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MyMath m = new MyMath();
            int result = m.Multi(int.Parse(textBox_x.Text), int.Parse(textBox_y.Text));
            label_result.Text = $"입력한 숫자1(x), 숫자2(y)의 곱셈 결과 : {result}";
        }
    }
}
