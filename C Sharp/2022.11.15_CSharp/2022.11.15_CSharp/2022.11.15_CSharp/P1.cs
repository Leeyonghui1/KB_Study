using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2022._11._15_CSharp
{
    internal class P1
    {
        static void Main(string[] args)
        {
            // 1개의 변수에 여러개(여러 타입)의 값을 가질 때
            // struct(구조체), class(클래스) :: 사용자 정의 자료형
            Student s1 = new Student();
            s1.Name = "오세룡";
            s1.Age = 20;
            s1.eye = 0.01;

            Student[] students = new Student[2];
            students[0] = s1;
            students[1] = new Student();
            students[1].Name = "박지호";
            students[1].Age = 25;
            students[1].eye = 0.1;

            Console.WriteLine(s1.Name);
            Console.WriteLine(students[1].Name);
        }
    }
}
