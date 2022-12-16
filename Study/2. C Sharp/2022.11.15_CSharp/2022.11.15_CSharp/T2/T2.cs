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
            // 1.
            Student s1 = new Student();
            s1.Name = "이용희";
            s1.Age = 28;
            s1.eye = 0.1;

            // 2.
            Console.WriteLine("2번) 학생1명 정보 입력");
            Student s2 = new Student();
            Console.Write("이름 : ");
            s2.Name = Console.ReadLine();
            Console.Write("나이 : ");
            s2.Age = int.Parse(Console.ReadLine());
            Console.Write("시력 : ");
            s2.eye = double.Parse(Console.ReadLine());

            // 3.
            Student[] students = new Student[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = new Student();
            students[2].Name = "장태연";
            students[2].Age = 28;
            students[2].eye = 1.5;

            // 4.
            Console.WriteLine();
            Console.WriteLine("4번) 반복문 사용 Student배열에 학생3명 정보 입력");
            Student[] students1 = new Student[3];
            for (int i = 0; i < students.Length; i++)
            {
                Console.Write("이름 : ");
                students1[i].Name = Console.ReadLine();
                Console.Write("나이 : ");
                students1[i].Age = int.Parse(Console.ReadLine());
                Console.Write("시력 : ");
                students1[i].eye = double.Parse(Console.ReadLine());
            }
            Console.WriteLine();
            Console.WriteLine("3번 Student배열 출력");
            foreach (var item in students)
            {
                Console.Write("이름 : ");
                Console.WriteLine(item.Name);
                Console.Write("나이 : ");
                Console.WriteLine(item.Age);
                Console.Write("시력 : ");
                Console.WriteLine(item.eye.ToString("0.0"));
            }
            Console.WriteLine();
            Console.WriteLine("4번 Student배열 출력");
            foreach (var item in students1)
            {
                Console.Write("이름 : ");
                Console.WriteLine(item.Name);
                Console.Write("나이 : ");
                Console.WriteLine(item.Age);
                Console.Write("시력 : ");
                Console.WriteLine(item.eye.ToString("0.0"));
            }

            // 5.
            Console.WriteLine();
            Console.WriteLine("5번 KBStudent 구조체 학생 생성");
            Console.Write("생성할 학생 수 : ");
            int num = int.Parse(Console.ReadLine());
            KBStudent[] kbs1 = new KBStudent[num];
            for (int i = 0; i < kbs1.Length; i++)
            {
                Console.Write("이름 : ");
                kbs1[i].Name = Console.ReadLine();
                Console.Write("MBTI : ");
                kbs1[i].MBTI = Console.ReadLine();
                Console.Write("나이 : ");
                kbs1[i].Age = int.Parse(Console.ReadLine());
                Console.Write("시력 : ");
                kbs1[i].Eye = double.Parse(Console.ReadLine());
            }
            Console.WriteLine();
            Console.WriteLine("KBStudent 학생정보 출력");
            foreach (var item in kbs1)
            {
                Console.Write("이름 : ");
                Console.WriteLine(item.Name);
                Console.Write("MBTI : ");
                Console.WriteLine(item.MBTI);
                Console.Write("나이 : ");
                Console.WriteLine(item.Age);
                Console.Write("시력 : ");
                Console.WriteLine(item.Eye.ToString("0.0"));
            }
        }
    }
}
