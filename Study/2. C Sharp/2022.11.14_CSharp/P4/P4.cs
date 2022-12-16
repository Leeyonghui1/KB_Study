using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P4
{
    internal class P4
    {
        static void Main(string[] args)
        {
            // 반복문
            // 1. for :: 시작점과 종료시점을 정해놓고 반복
            for(int i = 0; i < 5; i++)
            {
                Console.WriteLine("안녕하세요 " + i + "번님");
            }

            // 2. while  :: 무한루프 돌다가 특정 조건 도달시 종료
            while(true)
            {
                Console.WriteLine("숫자 입력");
                int num = int.Parse(Console.ReadLine());
                if(num<0)
                {
                    Console.WriteLine("음수이므로 종료");
                    break; // 반복문 종료
                }
            }

            // 3. do-while
            // while처럼 무한반복하되, 처음 입력값에 따라서 1번만 실행하거나
            // 계속 실행할지를 결정할 경우
            int mynum = -1;
            do
            {
                Console.WriteLine("mynum = " + mynum);
                Console.WriteLine("mynum은?");
                mynum = int.Parse(Console.ReadLine());
            } while (mynum > 0);


            // 4. goto
            MYTEST:
            Console.WriteLine("Hello World");

            if(mynum == -1)
            {
                Console.WriteLine("mynum?");
                mynum = int.Parse(Console.ReadLine());
                goto MYTEST;
            }
        }
    }
}
