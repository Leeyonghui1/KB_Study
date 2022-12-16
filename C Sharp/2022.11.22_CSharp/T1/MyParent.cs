using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T1
{
    public class MyParent
    {
        public static int money = 0;
        public string name { get; set; }
        public int age { get; set; }


        public static void openDoor()
        {
            Console.WriteLine("도어락을 열어요");
        }

        public void eat()
        {
            Console.WriteLine($"{this.name} 밥 먹어요");
        }

        public void sleep()
        {
            Console.WriteLine($"{this.age}살에 맞게 잘 자요");
        }
    }
}
