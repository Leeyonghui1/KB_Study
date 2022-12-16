using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P1
{
    // 제너릭<T> :: 인스턴스를 생성할 때마다 다른 타입으로 설정이 가능함
    public class Student<T>
    {
        public T hakbeon { get; set; }
        public string name { get; set; }
        public int age { get; set; }

        public Student()
        {

        }
        
        public Student(T hakbeon, string name, int age)
        {
            this.hakbeon = hakbeon;
            this.name = name;
            this.age = age;
        }
    }
}
