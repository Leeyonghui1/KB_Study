using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    // KBBank 클래스를 상속한 클래스 KyungBookBank
    public class KyungBookBank : KBBank
    {
        public KyungBookBank(string Name)
        {
            this.Name = Name; 
        }

        public void withDrawal(int money)
        {
            this.Balance -= money;
        }

        public void Saving(int money)
        {
            this.Balance += money;
        }

     
    }
}
