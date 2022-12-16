using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT3
{
    internal class SolT3
    {
        static void Main(string[] args)
        {
            Console.WriteLine("1");
            Console.WriteLine("숫자 입력받기");
            int num1 = int.Parse(Console.ReadLine());

            string result1 = num1 == 0 ? "0" : (num1 > 0 ? "양" : "음");
            Console.WriteLine(result1);

            if (num1 == 0)
            {
                Console.WriteLine("0");
            }
            else
            {
                if (num1 > 0)
                {
                    Console.WriteLine("양");
                }
                else
                {
                    Console.WriteLine("음");
                }
            }

            if (num1 == 0)
            {
                Console.WriteLine("0");
            }
            else if (num1 < 0)
            {
                Console.WriteLine("양");
            }
            else
            {
                Console.WriteLine("음");
            }

            Console.WriteLine("숫자 입력");
            int dice = int.Parse(Console.ReadLine());

            switch (dice)
            {
                case 1:
                    Console.WriteLine("일");
                    break;
                case 2:
                    Console.WriteLine("이");
                    break;
                case 3:
                    Console.WriteLine("삼");
                    break;
                case 4:
                    Console.WriteLine("사");
                    break;
                case 5:
                    Console.WriteLine("오");
                    break;
                case 6:
                    Console.WriteLine("육");
                    break;
                default:
                    Console.WriteLine(dice);
                    break;
            }

            int comDice = new Random().Next(6) + 1;
            /*
             comDice = new Random().Next(1,7);

             Random random = new Random();
             comDice = random.Next(6)+1;

             Random random = new Random();
             comDice = random.Next(1,7);
             */
            switch (comDice)
            {
                case 1:
                    Console.WriteLine("일");
                    break;
                case 2:
                    Console.WriteLine("이");
                    break;
                case 3:
                    Console.WriteLine("삼");
                    break;
                case 4:
                    Console.WriteLine("사");
                    break;
                case 5:
                    Console.WriteLine("오");
                    break;
                case 6:
                    Console.WriteLine("육");
                    break;
                default:
                    Console.WriteLine(comDice);
                    break;
            }

            switch (dice)
            {
                case 1:
                case 3:
                case 5:
                    Console.WriteLine("홀수");
                    break;
                case 2:
                case 4:
                case 6:
                    Console.WriteLine("짝수");
                    break;
                default:
                    Console.WriteLine(dice);
                    break;
            }

            Console.WriteLine("나이?");
            int age = int.Parse(Console.ReadLine());
            if (age < 0)
            {
                Console.WriteLine("무효");
            }
            else if (age < 20)
            {
                Console.WriteLine("미성년자");
            }
            else if (age >= 20 && age < 150)
            {
                Console.WriteLine("성인");
            }
            else
            {
                Console.WriteLine("불가사의한 존재");
            }

            if (age < 0)
            {
                Console.WriteLine("무효");
            }
            if (age >= 0 && age < 20)
            {
                Console.WriteLine("미성년자");
            }
            if (age >= 20 && age < 150)
            {
                Console.WriteLine("성인");
            }
            if (age >= 150)
            {
                Console.WriteLine("불가사의한 존재");
            }

            if (age < 0)
            {
                Console.WriteLine("무효");
            }
            else
            {
                if (age >= 0 && age < 20)
                {
                    Console.WriteLine("미성년자");
                }
                else if (age >= 20 && age < 150)
                {
                    Console.WriteLine("성인");
                }
                else
                {
                    Console.WriteLine("불가사의한 존재");
                }
            }
        }
    }
}
