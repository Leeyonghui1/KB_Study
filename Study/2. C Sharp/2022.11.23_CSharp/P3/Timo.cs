using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P3
{
    public class Timo : LOLCharacter
    {
        public override void sayHello()
        {
            System.Windows.Forms.MessageBox.Show("ㅎㅇㅎㅇ");
        }

        public override void Qkey()
        {
            System.Windows.Forms.MessageBox.Show("실명다트");
        }

        public override void Wkey()
        {
            System.Windows.Forms.MessageBox.Show("신속한 이동");
        }

        public override void Ekey()
        {
            System.Windows.Forms.MessageBox.Show("맹독다트");
        }

        public override void Rkey()
        {
            System.Windows.Forms.MessageBox.Show("유독성 함정");
        }

        public new void Attack()
        {
            System.Windows.Forms.MessageBox.Show("빵야빵야");
            Qkey();
            Ekey();
            Rkey();
        }

    }
}
