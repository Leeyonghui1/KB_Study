using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T2
{
    internal class T2
    {
        static void Main(string[] args)
        {  
            Console.WriteLine("Q1) 나이 입력");
            int age = int.Parse(Console.ReadLine());
            Console.WriteLine("이름 입력");
            string name = Console.ReadLine();
            Console.WriteLine("MBTI 입력");
            string mbti = Console.ReadLine();
            Console.WriteLine("혈액형 입력");
            string alpha = Console.ReadLine();

            Console.WriteLine($"나이 : {age}, 이름 : {name}, MBTI : {mbti}, 혈액형 : {alpha}");
            Console.WriteLine();

            Console.WriteLine("Q2) 태어난 연도 입력");
            int birth = int.Parse(Console.ReadLine());
            int age2 = DateTime.Now.Year - birth +1;
            Console.WriteLine($"내 나이 : {age2}");
            Console.WriteLine();

            Console.WriteLine("Q3) 반지름 입력");
            int r = int.Parse(Console.ReadLine());
            Console.WriteLine($"둘레 : {r*2*3.14}");
            Console.WriteLine($"넓이 : {r*r*3.14}");
            Console.WriteLine();
            
            Console.WriteLine("Q4) 시력 입력");
            double eye = double.Parse(Console.ReadLine());
            Console.WriteLine($"내 시력은 {eye.ToString("0.0")} 입니다.");
        }
    }
}
