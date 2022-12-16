using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P5
{
    internal class P5
    {
        static void Main(string[] args)
        {
            for(int i = 1; i <= 10; i++)
            {
                if(i%2 == 0)
                    Console.WriteLine("짝수");
                Console.WriteLine("i="+i);
            }

            // break :: 반복문 종료
            // continue :: 특정 조건에서만 다음 step으로 넘어감
            for(int i=1; i<=10; i++)
            {
                Console.WriteLine("i=" + i);
                if (i % 2 != 0)
                    continue;
                Console.WriteLine("짝수");
            }

        }
    }
}
