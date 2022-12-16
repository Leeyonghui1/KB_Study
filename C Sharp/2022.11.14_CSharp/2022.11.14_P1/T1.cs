using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2022._11._14_P1
{
    internal class T1
    {
        static void Main(string[] args)
        {
            Console.WriteLine("안녕, 내 이름은 이용희, 남자, 28살");

            string name = "이용희";
            string gender = "남자";
            int age = 28;

            string info1 = "안녕, 내 이름은 " + name + ", 성별은 " + gender + ", 나이는 " + age;
            Console.WriteLine(info1);

            string info2 = string.Format("안녕, 내 이름은 {0}, 성별은 {1}, 나이는 {2}", name, gender, age);
            Console.WriteLine(info2);

            string info3 = $"안녕, 내 이름은 {name}, 성별은 {gender}, 나이는 {age}";
            Console.WriteLine(info3);
        }
    }
}
