using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    // abstract :: 추상
    // => 인스턴스 생성 불가
    // => 추상클래스를 상속받은 클래스는 반드시 기능 구체화를 해야함
    // => 추상클래스와 인터페이스는 "다형성"을 많이 활용
    abstract public class Animal
    {
        public string name { get; set; }
        public int age { get; set; } 
        public void sleep()
        {
            System.Windows.Forms.MessageBox.Show($"{this.name} 은/는 {this.age}살처럼 잡니다.");
        }

        // Animal 클래스를 상속받은 클래스에서 구체화 해야하는 추상 메소드
        public abstract void eat(); 
    }
}
