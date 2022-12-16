using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T1
{
    public class MyChild : MyParent
    {
        public MyChild()
        {
            money--;
        }

        public void study()
        {
            Console.WriteLine($"{this.name}은 롤공부중");
        }

        public void playgame()
        {
            Console.WriteLine($"{this.name}은 {this.age}살 그래서 롤게임중");
        }

        public void buyBitCoin(int money)
        {
            MyChild.money += money;
        }
    }
}
