using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P3
{
    public partial class Form1 : Form
    {
        public List<string> list = new List<string>();
        
        public Form1()
        {
            InitializeComponent();
            Random random = new Random();
            int[] nums = new int[4];
            for(int i = 0; i < nums.Length; i++)
            {
                int r = random.Next(1,100);
                if (nums.Contains(r))
                {
                    r = random.Next(1, 100);
                    nums[i] = r;
                }
                nums[i] = r;
            }
            button1.Text = nums[0].ToString();
            button5.Text = nums[0].ToString();
            button2.Text = nums[1].ToString();
            button6.Text = nums[1].ToString();
            button3.Text = nums[2].ToString();
            button7.Text = nums[2].ToString();
            button4.Text = nums[3].ToString();
            button8.Text = nums[3].ToString();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            list.Add(button1.Text);
            int count = 0;
            for (int i = 0; i < list.Count; i++)
                count++;
            label_list.Text += list[count-1]+" ";

        }

        private void button2_Click(object sender, EventArgs e)
        {
            list.Add(button2.Text);
            int count = 0;
            for (int i = 0; i < list.Count; i++)
                count++;
            label_list.Text += list[count - 1] + " ";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            list.Add(button3.Text);
            int count = 0;
            for (int i = 0; i < list.Count; i++)
                count++;
            label_list.Text += list[count - 1] + " ";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            list.Add(button4.Text);
            int count = 0;
            for (int i = 0; i < list.Count; i++)
                count++;
            label_list.Text += list[count - 1] + " ";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            label_list.Text = "";
            list.Remove(button5.Text);
            for (int i = 0; i < list.Count; i++)
                label_list.Text += list[i] + " ";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            label_list.Text = "";
            list.Remove(button6.Text);
            for (int i = 0; i < list.Count; i++)
                label_list.Text += list[i] + " ";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            label_list.Text = "";
            list.Remove(button7.Text);
            for (int i = 0; i < list.Count; i++)
                label_list.Text += list[i] + " ";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            label_list.Text = "";
            list.Remove(button8.Text);
            for (int i = 0; i < list.Count; i++)
                label_list.Text += list[i] + " ";
        }
    }
}
