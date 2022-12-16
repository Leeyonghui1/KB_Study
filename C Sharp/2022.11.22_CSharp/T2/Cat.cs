using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2
{
    public class Cat : Animal
    {
        public override void eat()
        {
            System.Windows.Forms.MessageBox.Show($"{this.name} 고양이는 {this.age}살 답게 잘 먹는다. 야오오옹");
        }
    }
}
