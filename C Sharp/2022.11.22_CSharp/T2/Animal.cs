using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2
{
    abstract public class Animal
    {
        public string name { get; set; }
        public int age { get; set; }
        public void sleep()
        {
            System.Windows.Forms.MessageBox.Show($"{this.name} 은/는 {this.age}살처럼 잡니다.");
        }

        public abstract void eat();
    }
}
