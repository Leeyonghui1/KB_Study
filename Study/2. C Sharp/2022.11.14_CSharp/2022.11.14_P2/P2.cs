using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2022._11._14_P2
{
    internal class P2
    {
        static void Main(string[] args)
        {
            //java의 nextLine
            Console.WriteLine("이름이 뭐에요?");
            string name = Console.ReadLine();
            //java의 nextInt
            Console.WriteLine("나이가 어떻게 되요?");
            int age = int.Parse(Console.ReadLine());
            //Console.ReadLine() = 문자열 입력
            //int.Parse는 문자열을 숫자로 바꾸는 것
            Console.WriteLine("몸무게는?");
            double kg = double.Parse(Console.ReadLine());
            Console.WriteLine(name);
            Console.WriteLine(age);
            Console.WriteLine(kg);

            Console.WriteLine(DateTime.Now.Year);
        }
    }
}
