using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace T2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Animal a = new Dog();
            a.name = "퍼피";
            a.age = 10;
            a.sleep();
            a.eat();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Animal b = new Cat() { name = "야옹야옹", age = 5 };
            b.sleep();
            b.eat();
        }

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

        private void button5_Click(object sender, EventArgs e)
        {
            Animal u = new Unicorn();
            u.name = "유니코니";
            u.age = 500;
            sleep_and_eat(u);
        }
    }
}
