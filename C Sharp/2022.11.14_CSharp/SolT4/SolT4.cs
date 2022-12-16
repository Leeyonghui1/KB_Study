using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT4
{
    internal class SolT4
    {
        static void Main(string[] args)
        {
            // 1.
            for (int i = 1; i <= 5; i++)
            {
                Console.WriteLine("안녕하세요 " + i + "번님");
            }

            // 2.
            int sum = 0;
            for(int i = 1; i <= 10; i++)
            {
                sum += i;
            }
            Console.WriteLine("1~10까지의 합 : "+sum);
            // while 방식
            sum = 0;
            int c = 0;
            while(c<11)
            {
                sum += c;
                c++;
            }
            Console.WriteLine("1~10까지 총합 : "+sum);

            // 3.
            Console.WriteLine("숫자 입력하세요");
            int count = int.Parse(Console.ReadLine());
            for(int i = 1; i <= count; i++)
            {
                for(int j = 0; j <i; j++)
                    Console.Write("*");
                Console.WriteLine();
            }
            // while 방식
            int c1 = 1;
            int c2 = 0;
            while(c1<=count)
            {
                while (c2 < c1)
                {
                    Console.Write("*");
                    c2++;
                }
                Console.WriteLine();
                c2 = 0;
                c1++;           
            }
        }
    }
}
