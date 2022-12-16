using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2
{
    public class Unicorn : Animal
    {
        public override void eat()
        {
            System.Windows.Forms.MessageBox.Show($"{this.name} 은/는 환상의 동물 {this.age}살 유니콘 쩝쩝 밥을 먹는다.");
        }
    }
}
