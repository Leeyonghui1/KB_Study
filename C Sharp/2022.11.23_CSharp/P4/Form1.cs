using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Dog d = new Dog();
            d.actCute();
            d.smile();
            d.wellCome();

            // 인터페이스도 다형성이 적용됨
            ICharming pet1 = new Dog();
            ICharming pet2 = new RobotPet();

            pet1.actCute();
            pet2.actCute();

        }

        void cute_smile_well(ICharming c)
        {
            c.actCute();
            c.smile();
            c.wellCome();
        }

        void fightForMe(IFight f, string m)
        {
            f.attackTarget();
            f.killTarget();
            f.protecMaster(m);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            cute_smile_well(new Dog());
            cute_smile_well(new RobotPet());
        }

        private void button3_Click(object sender, EventArgs e)
        {
            List<IFight> fighters = new List<IFight>();
            fighters.Add(new RobotPet());
            fighters.Add(new Dron());

            foreach (IFight item in fighters)
            {
                fightForMe(item, textBox1.Text);
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Android a = new Android();
            IMyRobot i = new Android();
            IFight f = new Android();
            ICharming c = new Android();

            a.printMessage("헬로월드");
            a.actCute();
            a.smile();
            a.wellCome();
            a.attackTarget();
            a.killTarget();
            a.protecMaster("주인");

            i.printMessage("안녕세상");
            i.actCute();
            i.smile();
            i.wellCome();
            i.attackTarget();
            i.killTarget();
            i.protecMaster("마스터");

            f.attackTarget();
            f.killTarget();
            f.protecMaster("이용희");

            c.actCute();
            c.smile();
            c.wellCome();
            
        }
    }
}
