using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SolT1
{
    public partial class Form1 : Form
    {
        // list :: Form1 클래스의 멤버 변수
        public List<string> list = new List<string>();

        public Form1()
        {
            InitializeComponent();
            // 초기 화면 세팅
            ListText.Text = "";
            Random rand = new Random();
            button1.Text = rand.Next(100).ToString();
            button2.Text = rand.Next(100) + "";
            button3.Text = "" + rand.Next(100);
            button4.Text = rand.Next(100).ToString();
            button5.Text = button1.Text;
            button6.Text = button2.Text;
            button7.Text = button3.Text;
            button8.Text = button4.Text;

            
        }
        // button 1~4 :: ListText에 글자 추가
        private void button1_Click(object sender, EventArgs e)
        {
            list.Add(button1.Text);
            ListText.Text = ""; // ListText 라벨의 텍스트 리셋
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //list.Add(button2.Text);
            list.Add((sender as Button).Text);
            ListText.Text = ""; // ListText 라벨의 텍스트 리셋
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            list.Add((sender as Button).Text);
            ListText.Text = ""; // ListText 라벨의 텍스트 리셋
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            list.Add((sender as Button).Text);
            ListText.Text = ""; // ListText 라벨의 텍스트 리셋
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

        // 텍스트 지우기
        private void button5_Click(object sender, EventArgs e)
        {
            list.Remove((sender as Button).Text);
            ListText.Text = ""; // ListText 라벨의 텍스트 리셋
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

        private void button6_Click(object sender, EventArgs e)
        {
            list.Remove((sender as Button).Text);
            ListText.Text = ""; // ListText 라벨의 텍스트 리셋
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

        private void button7_Click(object sender, EventArgs e)
        {
            list.Remove((sender as Button).Text);
            ListText.Text = ""; // ListText 라벨의 텍스트 리셋
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }

        private void button8_Click(object sender, EventArgs e)
        {
            list.Remove((sender as Button).Text);
            ListText.Text = ""; // ListText 라벨의 텍스트 리셋
            foreach (var item in list)
            {
                ListText.Text += item + " ";
            }
        }
    }
}
