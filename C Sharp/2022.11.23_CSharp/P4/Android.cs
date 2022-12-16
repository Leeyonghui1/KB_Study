using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P4
{
    public class Android : IMyRobot
    {
        public void actCute()
        {
            System.Windows.Forms.MessageBox.Show("애교");
        }

        public void attackTarget()
        {
            System.Windows.Forms.MessageBox.Show("목표물 공격");
        }

        public void killTarget()
        {
            System.Windows.Forms.MessageBox.Show("목표물 제거");
        }

        public void printMessage(string message)
        {
            System.Windows.Forms.MessageBox.Show($"{message} 출력");
        }

        public void protecMaster(string name)
        {
            System.Windows.Forms.MessageBox.Show($"{name} 지킨다");
        }

        public void smile()
        {
            System.Windows.Forms.MessageBox.Show("웃음");
        }

        public void wellCome()
        {
            System.Windows.Forms.MessageBox.Show("환영");
        }
    }
}
