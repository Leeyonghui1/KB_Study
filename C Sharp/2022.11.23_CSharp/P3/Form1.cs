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
        List<LOLCharacter> characters = new List<LOLCharacter>();
        public Form1()
        {
            InitializeComponent();
            Ezreal c1 = new Ezreal();
            c1.name = "Ezreal";
            c1.level = 11;
            

            Karma c2 = new Karma();
            c2.name = "Karma";
            c2.level = 12;

            characters.Add(c1);
            characters.Add(c2);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            foreach (var item in characters)
            {
                item.sayHello();
                item.Attack();
                item.MoveLeft();
                item.MoveRight();
                item.MoveUp();
                item.MoveDown();
                item.Qkey();
                item.Wkey();
                item.Ekey();
                item.Rkey();
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Timo t = new Timo();
            t.name = "피카츄성우";
            t.level = 50;
            t.sayHello();

            t.Attack();

            t.Qkey();
            t.Wkey();
            t.Ekey();
            t.Rkey();

            t.MoveDown();
            t.MoveUp();
            t.MoveRight();
            t.MoveLeft();
        }
    }
}
