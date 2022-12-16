using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lotto
{
    public partial class Form1 : Form
    {
        Random r = new Random();
        int[] lottos = new int[7];
        List<CircularButton> circularButtons = new List<CircularButton>();
        public Form1()
        {
            InitializeComponent();

            circularButtons.Add(circularButton1);
            circularButtons.Add(circularButton2);
            circularButtons.Add(circularButton3);
            circularButtons.Add(circularButton4);
            circularButtons.Add(circularButton5);
            circularButtons.Add(circularButton6);
            circularButtons.Add(circularButton7);

            foreach (var item in circularButtons)
            {
                item.Text = "";
            }
            //circularButton1.Text = "";
            //circularButton2.Text = "";
            //circularButton3.Text = "";
            //circularButton4.Text = "";
            //circularButton5.Text = "";
            //circularButton6.Text = "";
            //circularButton7.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            for(int i = 0; i < lottos.Length; i++)
            {
                int n = r.Next(1, 46);
                while (lottos.Contains(n))
                    n = r.Next(1, 46);
                lottos[i] = n;
            }

            //for(int i = 0; i < lottos.Length; i++)
            //{
            //    for(int j = i+1; j < lottos.Length; j++)
            //    {
            //        if (lottos[i] > lottos[j])
            //        {
            //            int temp = lottos[i];
            //            lottos[i] = lottos[j];
            //            lottos[j] = temp;
            //        }
            //    }
            //}

            Array.Sort(lottos);

            for(int i =0; i < circularButtons.Count; i++)
            {
                circularButtons[i].Text = lottos[i].ToString();
            }

            //circularButton1.Text = lottos[0].ToString();
            //circularButton2.Text = lottos[1].ToString();
            //circularButton3.Text = lottos[2].ToString();
            //circularButton4.Text = lottos[3].ToString();
            //circularButton5.Text = lottos[4].ToString();
            //circularButton6.Text = lottos[5].ToString();
            //circularButton7.Text = lottos[6].ToString();



            for(int i = 0; i < circularButtons.Count; i++)
            {
                if (int.Parse(circularButtons[i].Text) <= 10)
                {
                    this.circularButtons[i].BackColor = Color.Yellow;
                }
                else if (int.Parse(circularButtons[i].Text) > 10 && int.Parse(circularButtons[i].Text) <= 20)
                {
                    this.circularButtons[i].BackColor = Color.Blue;
                }
                else if (int.Parse(circularButtons[i].Text) > 20 && int.Parse(circularButtons[i].Text) <= 30)
                {
                    this.circularButtons[i].BackColor = Color.Red;
                }
                else if (int.Parse(circularButtons[i].Text) > 30 && int.Parse(circularButtons[i].Text) <= 40)
                {
                    this.circularButtons[i].BackColor = Color.LightGray;
                }
                else
                {
                    this.circularButtons[i].BackColor = Color.Green;
                }
            }
        }       
    }
}
