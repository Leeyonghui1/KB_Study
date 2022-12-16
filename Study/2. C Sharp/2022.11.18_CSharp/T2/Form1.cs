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
        public List<string> list = new List<string>();
        string[] s = new string[4];
        Random rand = new Random();

        public Form1()
        {
            InitializeComponent();
            ListText.Text = ""; 
            
            for(int i = 0; i < s.Length; i++)
            {
                string n = rand.Next(100).ToString();
                if (s.Contains(n))
                    n = rand.Next(100).ToString();
                s[i] = n;
            }

            for(int i = 0; i < s.Length; i++)
            { 
                for(int j = i+1; j < s.Length; j++)
                {
                    if (int.Parse(s[i]) > int.Parse(s[j]))
                    {
                        string temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }

            button1.Text = s[0];
            button2.Text = s[1];
            button3.Text = s[2];
            button4.Text = s[3];
            button5.Text = button1.Text;
            button6.Text = button2.Text;
            button7.Text = button3.Text;
            button8.Text = button4.Text;

            
        }

        private void button9_Click(object sender, EventArgs e)
        {
            ListText.Text = "";
            list.Add(s[rand.Next(4)]);
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

        private void button10_Click(object sender, EventArgs e)
        {
            ListText.Text = "";
            list.Remove(s[rand.Next(4)]);
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }
    }
}
