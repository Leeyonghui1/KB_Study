using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SolT3
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            label1.Text = "";
        }

        // 제곱
        private void button1_Click(object sender, EventArgs e)
        {
            MyMath m = new MyMath();
            label1.Text = m.power(int.Parse(textBox1.Text)).ToString();
        }

        // 곱하기
        private void button2_Click(object sender, EventArgs e)
        {
            MyMath m = new MyMath();
            label1.Text = m.multi(int.Parse(textBox1.Text), int.Parse(textBox2.Text)).ToString();
        }

        // 거듭제곱
        private void button3_Click(object sender, EventArgs e)
        {
            // int.TryParse :: int.Parse의 업글버전 => 강제종료 안됨
            // out 키워드를 통해 값을 반환
            // textBox1에 숫자가 아닌 것이 있어도 프로그램 오류가 발생하지 않고
            // 공백이나 문자가 있으면 int x = 0 + TryParse함수는 false 리턴
            // 숫자 입력 시 int x = 입력한 값 + TryParse함수 true 리턴
            //int.TryParse(textBox1.Text, out int x);
            MessageBox.Show(int.TryParse(textBox1.Text, out int x).ToString());
            int.TryParse(textBox2.Text, out int y);
            label1.Text = new MyMath().power(x, y).ToString();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            // 클래스 메소드를 쓰는 경우
            // :: 멤버변수랑 상관없이 매개변수에 따라서 결과가 달라질 때
            label1.Text = MyMath2.power(int.Parse(textBox1.Text)).ToString();
        }

        private void button5_Click(object sender, EventArgs e)
        {
            label1.Text = MyMath2.multi(int.Parse(textBox1.Text), int.Parse(textBox2.Text)).ToString();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            label1.Text = MyMath2.power(int.Parse(textBox1.Text), int.Parse(textBox2.Text)).ToString();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox1.Text, out int x);
            label1.Text = MyMath3.power(x).ToString();

            // label1.Text = MyMath3.power(int.Parse(textBox1.Text)).ToString();
        }

        private void button8_Click(object sender, EventArgs e)
        {
            label1.Text = MyMath3.multi(int.Parse(textBox1.Text), int.Parse(textBox2.Text)).ToString();
        }

        private void button9_Click(object sender, EventArgs e)
        {
            label1.Text = MyMath3.power(int.Parse(textBox1.Text), int.Parse(textBox2.Text)).ToString();
        }
    }
}
