using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P3
{
    internal class P3
    {
        static void Main(string[] args)
        {
            // 조건문

            int a = 10;
            // 삼항연산자
            string result = a % 2 == 0 ? "짝수" : "홀수";
            Console.WriteLine(result);

            a = 5;
            result = a % 2 == 0 ? "짝수" : "홀수";
            Console.WriteLine(result);
            
            // if문
            if(a == 0)
            {
                Console.WriteLine("0입니다.");
            }
            else if (a%2 == 0)
            {
                Console.WriteLine("짝수");
            }
            else
            {
                Console.WriteLine("홀수");
            }


            // switch
            switch(a)
            {
                case 0:
                    Console.WriteLine("a는 0이다.");
                    break;
                case 1:
                case 2:
                case 3:
                    Console.WriteLine("a는 1~3이다.");
                    break; // c# switch case에서 break가 없으면 에러발생
                default:
                    Console.WriteLine("a는 "+a+"이다.");
                    break;
            }

        }
    }
}
