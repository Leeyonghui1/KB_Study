using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P3
{
    public class Karma : LOLCharacter
    {
        public override void Qkey()
        {
            base.Qkey();
            Console.WriteLine($"레벨 : {this.level}의 내면의 열정 / 영혼의 불꽃");
        }

        public override void Wkey()
        {
            base.Wkey();
            Console.WriteLine($"레벨 : {this.level}의 굳은 결의 / 재생");
        }

        public override void Ekey()
        {
            base.Ekey();
            Console.WriteLine($"레벨 : {this.level}의 고무 / 저항");
        }

        public override void Rkey()
        {
            base.Rkey();
            Console.WriteLine($"레벨 : {this.level}의 만트라");
        }

        public override void sayHello()
        {
            base.sayHello();
            Console.WriteLine("항상 정신을 집중하세요");
        }
    }
}
