using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    public class Cat : Animal
    {
        // Animal :: 추상 클래스 , eat() :: 추상 메소드
        // 추상 클래스를 상속받은 클래스(Cat)에서 추상메소드(eat())을 반드시 구체화 해야 한다.
        public override void eat()
        {
            // throw new NotImplementedException();  :: 구현하지 않았을 때 발생하는 오류
            System.Windows.Forms.MessageBox.Show($"{this.name} 고양이는 {this.age}살 답게 잘 먹는다. 야오오옹");
        }
    }
}
