using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T5
{
    internal class T5
    {
        static void Main(string[] args)
        {
            // 1. 1~10 순차출력
            for(int i = 1; i <=10; i++)
                Console.Write(i+" ");
            Console.WriteLine();
            int c = 1;
            while(c<11)
            {
                Console.Write(c+" ");
                c++;
            }
            Console.WriteLine();

            // 2. a~b까지 순차출력
            Console.Write("a 입력 : ");
            int a = int.Parse(Console.ReadLine());
            Console.Write("b 입력 : ");
            int b = int.Parse(Console.ReadLine());
            if (a > b)
            {
                int temp = a;
                a = b;
                b = temp;
            }
            for (int i = a; i <= b; i++)
                Console.Write(i+" ");
            Console.WriteLine();
            c = a;
            while(c<=b)
            {
                Console.Write(c+" ");
                c++;
            }
            Console.WriteLine();

            // 3. 1~100 까지 짝수만 출력
            for(int i = 1; i<=100; i++)
            {
                if(i%2 == 0)
                    Console.Write(i+" ");
            }
            Console.WriteLine();
            c = 1;
            while(c<=100)
            {
                if(c%2 == 0)
                    Console.Write(c+" ");
                c++;
            }
            Console.WriteLine();

            // 4. a,b입력 후 b부터 a까지 역순 출력(a<b)
            Console.Write("a 입력 : ");
            a = int.Parse(Console.ReadLine());
            Console.Write("b 입력 : ");
            b = int.Parse(Console.ReadLine());
            if (a > b)
            {
                int temp = a;
                a = b;
                b = temp;
            }
            for (int i =b; i>=a; i--)
                Console.Write(i+" ");
            Console.WriteLine();
            c = b;
            while(c>=a)
            {
                Console.Write(c+" ");
                c--;
            }
            Console.WriteLine();

            // 5. Q2,Q4 입력한 a,b값 순서 정렬
            



        }
    }
}
