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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            Rectangle rectangle = new Rectangle();
            Console.WriteLine("1. 직사각형(3*4)");
            Console.WriteLine("넓이 : " + rectangle.recArea(3, 4));
            Console.WriteLine();

            Console.Write("가로 : ");
            int w1 = int.Parse(Console.ReadLine());
            Console.Write("세로 : ");
            int l1 = int.Parse(Console.ReadLine());
            rectangle.Width = w1;
            rectangle.Length = l1;
            Console.WriteLine("넓이 : " + rectangle.recArea(rectangle.Width, rectangle.Length));
            Console.WriteLine();

            Circle circle = new Circle();
            Console.WriteLine("2. 원(r=3)");
            Console.WriteLine("둘레 : " + circle.circleRound(3));
            Console.WriteLine("넓이 : " + circle.circleArea(3));
            Console.WriteLine();

            Console.Write("반지름 : ");
            int radius1 = int.Parse(Console.ReadLine());
            circle.r = radius1;
            Console.WriteLine("둘레 : " + circle.circleRound(circle.r));
            Console.WriteLine("넓이 : " + circle.circleArea(circle.r));
            Console.WriteLine();

            Cuboid cuboid = new Cuboid();
            cuboid.Width = 3;
            cuboid.Length = 4;
            Console.WriteLine("3. 직육면체(h=5)");
            Console.WriteLine("부피 : " + cuboid.cuboidVolume(5));
            Console.WriteLine();

            Console.Write("가로 : ");
            int w2 = int.Parse(Console.ReadLine());
            Console.Write("세로 : ");
            int l2 = int.Parse(Console.ReadLine());
            Console.Write("높이 : ");
            int h2 = int.Parse(Console.ReadLine());
            cuboid.Width = w2;
            cuboid.Length = l2;
            cuboid.Height = h2;
            Console.WriteLine("부피 : " + cuboid.cuboidVolume(cuboid.Height));
            Console.WriteLine();

            Sphere sphere = new Sphere();
            sphere.r = 3;
            Console.WriteLine("4. 구(r=3)");
            Console.WriteLine("부피 : " + sphere.sphereVolume());
            Console.WriteLine();

            Console.Write("반지름 : ");
            int radius2 = int.Parse(Console.ReadLine());
            sphere.r = radius2;
            Console.WriteLine("부피 : " + sphere.sphereVolume());
            Console.WriteLine();


            label_outrect.Text = "";
            label_outcircle.Text = "";
            label_outcuboid.Text = "";
            label_outsphere.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int width = int.Parse(textBox_width.Text);
            int length = int.Parse(textBox_length.Text);

            Rectangle rectangle = new Rectangle();
            rectangle.Width = width;
            rectangle.Length = length;

            Console.WriteLine("직사각형");
            Console.WriteLine("넓이 : " + rectangle.recArea(rectangle.Width, rectangle.Length));
            Console.WriteLine();

            MessageBox.Show("넓이 : " + rectangle.recArea(rectangle.Width, rectangle.Length));

            label_outrect.Text = "넓이 : " + rectangle.recArea(rectangle.Width, rectangle.Length);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int radius = int.Parse(textBox_radius.Text);

            Circle circle = new Circle();
            circle.r = radius;

            Console.WriteLine("원");
            Console.WriteLine("둘레 : " + circle.circleRound(circle.r));
            Console.WriteLine("넓이 : " + circle.circleArea(circle.r));
            Console.WriteLine();

            MessageBox.Show("둘레 : " + circle.circleRound(circle.r) + "\n" + "넓이 : " + circle.circleArea(circle.r));

            label_outcircle.Text = "둘레 : " + circle.circleRound(circle.r) + "\n" + "넓이 : " + circle.circleArea(circle.r);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            int width = int.Parse(textBox_width.Text);
            int length = int.Parse(textBox_length.Text);
            int height = int.Parse(textBox_height.Text);

            Cuboid cuboid = new Cuboid();
            cuboid.Width = width;
            cuboid.Length = length;
            cuboid.Height = height;
            Console.WriteLine("직육면체");
            Console.WriteLine("부피 : " + cuboid.cuboidVolume(cuboid.Height));
            Console.WriteLine();

            MessageBox.Show("부피 : " + cuboid.cuboidVolume(cuboid.Height));

            label_outcuboid.Text = "부피 : " + cuboid.cuboidVolume(cuboid.Height);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            int radius = int.Parse(textBox_radius.Text);

            Sphere sphere = new Sphere();
            sphere.r = radius;
            Console.WriteLine("구");
            Console.WriteLine("부피 : " + sphere.sphereVolume());
            Console.WriteLine();

            MessageBox.Show("부피 : " + sphere.sphereVolume());

            label_outsphere.Text = "부피 : " + sphere.sphereVolume();
        }
    }
}
