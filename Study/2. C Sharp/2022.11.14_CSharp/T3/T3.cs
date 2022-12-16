using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T3
{
    internal class T3
    {
        static void Main(string[] args)
        {
            
            // 1.
            Console.WriteLine("Q1) 숫자를 입력하세요.");
            int input = int.Parse(Console.ReadLine());
            Console.WriteLine("삼항연산자");
            string result = input == 0 ? "0" : input > 0 ? "양" : "음";
            Console.WriteLine(result);
            Console.WriteLine("if문");
            if(input == 0)
            {
                Console.WriteLine("0");
            }
            else if(input > 0)
            {
                Console.WriteLine("양");
            }
            else
            {
                Console.WriteLine("음");
            }
            Console.WriteLine();

            // 2.
            Console.WriteLine("Q2) 1~6숫자를 입력하세요.");
            int n = int.Parse(Console.ReadLine());
            switch(n)
            {
                case 1:
                    Console.WriteLine("일!");
                    break;
                case 2:
                    Console.WriteLine("이!");
                    break;
                case 3:
                    Console.WriteLine("삼!");
                    break;
                case 4:
                    Console.WriteLine("사!");
                    break;
                case 5:
                    Console.WriteLine("오!");
                    break;
                case 6:
                    Console.WriteLine("육!");
                    break;
            }
            Console.WriteLine();
            
            Console.WriteLine("Q2) 1~6 랜덤숫자 생성");
            Random random = new Random();
            // Next(a,b) :: a이상 b미만
            int n2 = random.Next(1, 7);
            Console.WriteLine("랜덤생성된 숫자 : "+n2);
            switch (n2)
            {
                case 1:
                    Console.WriteLine("일!");
                    break;
                case 2:
                    Console.WriteLine("이!");
                    break;
                case 3:
                    Console.WriteLine("삼!");
                    break;
                case 4:
                    Console.WriteLine("사!");
                    break;
                case 5:
                    Console.WriteLine("오!");
                    break;
                case 6:
                    Console.WriteLine("육!");
                    break;
            }
            Console.WriteLine();
            
            // 3.
            Console.WriteLine("Q3) 랜덤숫자 홀짝 출력");
            switch (n2%2)
            {
                case 0:
                    Console.WriteLine("짝수");
                    break;
                default:
                    Console.WriteLine("홀수");
                    break;
            }
            Console.WriteLine();

            // 4.
            Console.WriteLine("Q4) 나이 입력");
            int age = int.Parse(Console.ReadLine());
            if(age < 0)
            {
                Console.WriteLine("무효");
            }
            else if(age < 20)
            {
                Console.WriteLine("미성년자");
            }
            else if(age >= 20 && age < 150)
            {
                Console.WriteLine("성인");
            }
            else if(age >= 150)
            {
                Console.WriteLine("불가사의한 존재");
            }    
            
        }
    }
}
