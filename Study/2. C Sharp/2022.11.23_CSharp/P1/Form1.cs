using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // <int> :: Student 클래스의 T 타입을 int 타입으로 설정
            Student<int> s = new Student<int>();
            s.age = 10;
            s.name = "이용희";
            s.hakbeon = 09;  // 현재 hakbeon은 int 타입이라서 앞의 '0'은 삭제되어 '9'로 출력됨
            MessageBox.Show($"이름:{s.name}, 나이:{s.age}, 학번:{s.hakbeon}");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            // // 현재 hakbeon은 string 타입이라서 '09'로 출력됨
            Student<string> s = new Student<string>("09","이용희",20);
            MessageBox.Show($"이름:{s.name}, 나이:{s.age}, 학번:{s.hakbeon}");
        }

        private void button3_Click(object sender, EventArgs e)
        {
            MyHakbeon h = new MyHakbeon("경북산업직업전문학교", 1);
            Student<MyHakbeon> s = new Student<MyHakbeon>(h, "이용희", 20);

            Student<MyHakbeon> s2 = new Student<MyHakbeon>(new MyHakbeon("영진직업전문학교", 2), "이용희", 22);

            Student<MyHakbeon> s3 = new Student<MyHakbeon>();
            s3.name = "김홍근";
            s3.age = 40;
            s3.hakbeon = h;
            s3.hakbeon = new MyHakbeon("코리아IT", 3);

            MessageBox.Show($"이름:{s.name}, 나이:{s.age}, 학번:{s.hakbeon.name}, {s.hakbeon.number}");
            MessageBox.Show($"이름:{s2.name}, 나이:{s2.age}, 학번:{s2.hakbeon.name}, {s2.hakbeon.number}");
            MessageBox.Show($"이름:{s3.name}, 나이:{s3.age}, 학번:{s3.hakbeon.name}, {s3.hakbeon.number}");
        }
    }
}
