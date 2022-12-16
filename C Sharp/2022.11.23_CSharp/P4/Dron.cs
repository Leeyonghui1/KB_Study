using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P4
{
    public class Dron : IFight
    {
        public void attackTarget()
        {
            System.Windows.Forms.MessageBox.Show("목표물 정조준");
        }

        public void killTarget()
        {
            System.Windows.Forms.MessageBox.Show("다다다다");
        }

        public void protecMaster(string name)
        {
            System.Windows.Forms.MessageBox.Show($"나의 주인 {name} 지킨다.");
        }
    }
}
