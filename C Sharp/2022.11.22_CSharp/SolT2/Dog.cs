using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT2
{
    public class Dog : Animal
    {
        public override void eat()
        {
            System.Windows.Forms.MessageBox.Show($"{this.name} 은/는 개같이 먹는다.");
        }
    }
}
