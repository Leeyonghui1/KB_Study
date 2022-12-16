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
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = "";
            List<int> ages = new List<int>() { 10, 20, 30, 40, 50 };

            var output = from item in ages
                         select new
                         {
                             age = item,
                             money = (item * 100) * 2
                         };

            foreach (var item in output)
                label1.Text += item.age + "대 : " + item.money + "   ";

        }
    }
}
