using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    public class Observer1 : IObserver
    {
        public string name { get; set; }
        public void update(string value)
        {
            this.name = value + "," + name + ",님";
            System.Windows.Forms.MessageBox.Show(name);
        }
    }
}
