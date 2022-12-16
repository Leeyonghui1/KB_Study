using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2022._11._14_CSharp
{
    internal class P1
    {
        static void Main(string[] args)
        {
            // 자바 sysout == c# cw
            // cw 누르고 tab키 두번
            Console.WriteLine("안녕");

            int num1 = 10;
            double num2 = 3.14;
            // c#에서는 문자열 변수 저장시 s를 소문자로 주로사용
            string m1 = "Hello";
            // 대문자도 가능하긴 함
            String m2 = "이것도 됨";
            char lastName = '이';
            bool tf = true;
            Boolean tf2 = false;

            char c1 = "안녕하세요"[0];  // 글자 '안'을 가져옴
            string s1 = "Hello";
            char c2 = s1[1]; // 알파벳 'e'를 가져옴

            Console.WriteLine(c1);
            Console.WriteLine(s1);
            Console.WriteLine(c2);

            Console.WriteLine(10+20);
            Console.WriteLine("안녕"+"하세요");
            Console.WriteLine("10"+20);

            // 문자열 처리 방법
            // 1. 더하기를 통해 변수랑 문자열 더함
            int age = 28;
            string info = "내 나이 : " + age; // 문자열+변수
            Console.WriteLine(info);
            // 2. string.format
            string info2 = string.Format("내 나이 : {0}", age);
            Console.WriteLine(info2);
            // 3. $ 표시
            string info3 = $"내 나이 : {age}";
            Console.WriteLine(info3);
        }
    }
}
