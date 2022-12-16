using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P3
{
    public class Ezreal : LOLCharacter
    {
        public override void Qkey()
        {
            base.Qkey();
            Console.WriteLine($"레벨 : {this.level}의 신비한 화살");
        }

        public override void Wkey()
        {
            base.Wkey();
            Console.WriteLine($"레벨 : {this.level}의 정수의 흐름");
        }

        public override void Ekey()
        {
            base.Ekey();
            Console.WriteLine($"레벨 : {this.level}의 비전 이동");
        }

        public override void Rkey()
        {
            base.Rkey();
            Console.WriteLine($"레벨 : {this.level}의 정조준 일격");
        }

        public override void sayHello()
        {
            base.sayHello();
            Console.WriteLine("임무를 수락하지! 잠깐, 어디 가는 거라고?");
        }
    }
}
