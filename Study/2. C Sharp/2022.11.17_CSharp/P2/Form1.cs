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
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int a = 5;
            int b = 10;
            int c = 0;
            c = a + b;
            c = c - a;
            Console.WriteLine("안녕하세요");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int count = 0;
            for(int i = '가'; i<='힣'; i++)
            {
                count++;
            }
            char[] chars = new char[count];
            for (int i = '가'; i <= '힣'; i++)
            {
                char c = (char)i;
                chars[i-'가'] = c;
                Console.Write(c);
            }
            for(int i =0; i < chars.Length; i++)
            {
                if(i % 150 == 0)
                    label_kor.Text += "\n";
                label_kor.Text += chars[i];
            }
        }
    }
}
