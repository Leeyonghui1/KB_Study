using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _1121SolT4
{
    public partial class Form1 : Form
    {
        // ref :: 참조자
        // C 포인터랑 공통점 :: 변수의 위치를 가리킴
        // C 포인터랑 차이점 :: ref타입 변수를 출력하면 그 주소의 값을 출력 || 포인터 변수를 출력하면 주소값을 출력
        private void swapFunction(ref int a, ref int b) // 외부에 영향을 줌
        {
            int temp = a;
            a = b;
            b = temp;
        }
        private void swapFunction(int a, int b) // 외부에 영향을 주지 않음
        {
            int temp = a;
            a = b;
            b = temp;
        }

        public Form1()
        {
            InitializeComponent();
            label5.Text = "";
            int a = 3;
            int b = 5;
            swapFunction(a, b); // ref를 사용하지 않아서 값이 바뀌지 않는다
            Console.WriteLine($"a={a}, b={b}");
            swapFunction(ref a, ref b);
            Console.WriteLine($"a={a}, b={b}");

            // label1.Click += 적고  tab tab
            // 안되면 Ctrl+Space or Alt+Enter
            // 안되면 직접 이벤트 적기
            label1.Click += Label1_Click;

        }

        private void Label1_Click(object sender, EventArgs e)
        {
            label1.Text = "a=";
            label2.Text = "b=";
            label3.Text = "a=";
            label4.Text = "b=";

        }

        private void button1_Click(object sender, EventArgs e)
        {
            int.TryParse(textBox1.Text, out int a);
            int.TryParse(textBox2.Text, out int b);
            swapFunction(ref a, ref b);
            textBox3.Text = a.ToString();
            textBox4.Text = b.ToString();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {          
            label5.Text = DateTime.Now.ToString("yyyy-MM-dd HH:mm:ss.fff");
        }
    }
}
