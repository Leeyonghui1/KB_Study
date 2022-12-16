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
            Cat c = new Cat() { age = 10, name = "야옹이" };
            c.eat();
            c.sleep();
            c.fight();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Tiger t = new Tiger() { age = 100, name = "호치"};
            t.sleep();
            t.eat();
            t.fight();

            ((Cat)t).eat();   // eat()은 하이딩 메소드 :: 강제 형변환으로 부모 클래스(Cat)의 메소드 호출 성공
            ((Cat)t).fight(); // fight()는 오버라이딩 메소드 :: 강제 형변환으로 부모 클래스(Cat)의 메소드 호출 실패

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Cat c = new Cat();
            c.name = "해라";
            c.age = 30;
            // ToString() :: object 클래스의 메소드
            // 오버라이딩 가능
            // 오버라이딩 하지 않으면 object 클래스의 메소드를 호출
            MessageBox.Show(c.ToString());
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Tiger t = new Tiger();
            t.name = "호치치";
            t.age = 300;
            MessageBox.Show(t.ToString());
        }
    }
}
