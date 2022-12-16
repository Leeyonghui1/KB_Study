using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P2
{
    public partial class Form1 : Form
    {
        enum 가위바위보
        {
            가위=1,바위,보
        }

        enum Fruit
        {
            apple, banana=5, orange
        }
        public Form1()
        {
            InitializeComponent();
            MessageBox.Show(가위바위보.가위.ToString());
            MessageBox.Show(((int)가위바위보.가위).ToString());

            string[] fruits = new string[10];
            fruits[0] = "영주사과";
            fruits[1] = "청주사과";
            fruits[2] = "공주사과";
            fruits[3] = "경주사과";
            fruits[4] = "성주사과";
            fruits[5] = "대구 바나나";
            fruits[6] = "제주도 귤";

            MessageBox.Show(fruits[0]);
            MessageBox.Show(fruits[5]);
            MessageBox.Show(fruits[6]);

            MessageBox.Show(fruits[(int)Fruit.apple]);
            MessageBox.Show(fruits[(int)Fruit.banana]);
            MessageBox.Show(fruits[(int)Fruit.orange]);


        }

        private void button1_Click(object sender, EventArgs e)
        {
            // 추상클래스(인터페이스) 단독으로 인스턴스 생성 불가
            // Animal a = new Animal(); :: 불가
            
            // List에 여러 개의 자료형을 추가하거나
            // 메소드의 매개변수로써 조상 클래스를 활용함
            Animal a = new Dog();  // 다형성
            // Dog a = new Dog();
            a.name = "퍼피";
            a.age = 10;
            a.sleep();
            a.eat();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Animal b = new Cat() { name = "야옹야옹", age = 5};
            b.sleep();
            b.eat();
        }

        // Animal a :: Animal을 상속한 클래스로 생성된 인스턴스를 의미
        // new Dog(), new Cat()
        private void sleep_and_eat(Animal a)
        {
            a.sleep();
            a.eat();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            sleep_and_eat(new Cat() { name = "냥이", age = 7 });
            sleep_and_eat(new Dog() { name = "행복이", age = 8 });
        }

        private void button4_Click(object sender, EventArgs e)
        {
            List<Animal> animals = new List<Animal>();
            animals.Add(new Cat() { name = "야옹이", age = 1 });
            animals.Add(new Dog() { name = "멍뭉이", age = 10 });
            animals.Add(new Cat() { name = "캣캣캣", age = 5 });

            foreach (var item in animals)
            {
                sleep_and_eat(item);
            }
        }
    }
}
