using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T4
{
    internal class T4
    {
        static void Main(string[] args)
        {
            // 1.
            for(int i = 0; i < 5; i++)
            {
                Console.WriteLine("안녕하세요 "+(i+1)+"번님");
            }

            // 2.
            int sum = 0;
            for(int i = 1; i <= 10; i++)
            {
                sum += i;
            }
            Console.WriteLine("1~10 총합 : "+sum);

            // 3.
            Console.WriteLine("별 라인 개수 입력");
            int input = int.Parse(Console.ReadLine());
            for(int i = 0; i < input; i++)
            {
                for(int j = 0; j <= i; j++)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
            }
        }
    }
}
