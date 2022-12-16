using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _2022._11._18_CSharp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Console.WriteLine("안녕하세요");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int count = 0;
            for (int i = '가'; i <= '힣'; i++)
                count++;
            char[] chars = new char[count];
            for(int i = '가'; i <= '힣'; i++)
            {
                char c = (char)i;
                chars[i - '가'] = c;
                Console.Write(c);
            }
            for(int i = 0; i < chars.Length; i++)
            {
                if (i % 150 == 0)
                    label_kor.Text += "\n";
                label_kor.Text += chars[i];
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            for(char i = '가'; i <= '힣'; i++)
                Console.Write(i);
            Console.WriteLine();
            Label label = new Label();
            label.AutoSize = true;
            label.Location = new Point(0, 400);
            for (char i = '가'; i <= '힣'; i++)
            {
                label.Text += i;
                if (i % 100 == 0)
                    label.Text += "\n";
            }
            Controls.Add(label);

        }
    }
}
