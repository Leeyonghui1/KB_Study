using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    public class KBBank
    {
        public string Name { get; set; } // 고객명
        public int Balance { get; set; } // 잔액
        public void info()
        {
            Console.WriteLine("이름 : " + this.Name);
            Console.WriteLine("잔액 : " + this.Balance);
        }

        public object ShallowCopy()
        {
            return this.MemberwiseClone();
        }
    }
}
