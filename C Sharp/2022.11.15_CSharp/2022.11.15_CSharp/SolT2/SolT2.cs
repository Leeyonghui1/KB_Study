using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT2
{
    internal class SolT2
    {
        static void Main(string[] args)
        {
            // 1.
            Student stu1 = new Student();
            stu1.Name = "이동준";
            stu1.Age = 34;
            stu1.eye = 0.4;
            Console.WriteLine($"{stu1.Name}학생은" +
                $" {stu1.Age}살이고, 시력은 {stu1.eye}이다.");

            // 2.
            Student stu2 = new Student();
            Console.WriteLine("이름은?");
            stu2.Name = Console.ReadLine();
            Console.WriteLine("나이는?");
            stu2.Age = int.Parse(Console.ReadLine());
            Console.WriteLine("시력은?");
            stu2.eye = double.Parse(Console.ReadLine());
            Console.WriteLine($"{stu2.Name}학생은 {stu2.Age}살이고, 시력은 {stu2.eye}입니다.");

            // 3.
            Student[] stus = new Student[3];
            stus[0] = new Student();
            stus[0].Name = "조영탁";
            stus[0].Age = 30;
            stus[0].eye = 1.2;
            stus[1] = new Student();
            stus[1].Name = "이범식";
            stus[1].Age = 35;
            stus[1].eye = 1.6;
            stus[2] = new Student();
            stus[2].Name = "박재형";
            stus[2].Age = 25;
            stus[2].eye = 0.6;
            for (int i = 0; i < stus.Length; i++)
            {
                Console.WriteLine($"{stus[i].Name}학생은 {stus[i].Age}살이고, 시력은 {stus[i].eye}이다.");
            }

            // 4.
            Student[] stus2 = new Student[3];
            for (int i = 0; i < stus2.Length; i++)
            {
                stus2[i] = new Student();
                Console.WriteLine("이름?");
                stus2[i].Name = Console.ReadLine();
                Console.WriteLine("나이?");
                stus2[i].Age = int.Parse(Console.ReadLine());
                Console.WriteLine("시력?");
                stus2[i].eye = double.Parse(Console.ReadLine());

                Console.WriteLine("이름 : " + stus2[i].Name);
                Console.WriteLine("나이 : " + stus2[i].Age);
                Console.WriteLine("시력 : " + stus2[i].eye);
                Console.WriteLine("시력 : " + stus2[i].eye.ToString("0.0"));
                Console.WriteLine("시력 : " + "{0:F2}", stus2[i].eye);
                Console.WriteLine("시력 : " + "{0:.00}", stus2[i].eye);
                Console.WriteLine("시력 : " + "{0:N}", stus2[i].eye);
            }

            // 7.
            Console.WriteLine("KB 학생 만들기");
            KBStudent kb1 = new KBStudent();
            kb1.Name = "장혜정";
            kb1.Age = 20;
            kb1.Eye = 1.5;
            kb1.MBTI = "ISFP";

            Console.WriteLine("이름 : " + kb1.Name);
            Console.WriteLine("나이 : " + kb1.Age);
            Console.WriteLine("시력 : " + "{0:N}", kb1.Eye);
            Console.WriteLine("MBTI : " + kb1.MBTI);


            KBStudent kb2 = new KBStudent();
            kb2.Name = "김성환";
            kb2.Age = 20;
            kb2.Eye = 1.7;
            kb2.MBTI = "ENFP";
            kb2.introduce(); // kb2의 모든 정보를 출력
        }
    }
}
