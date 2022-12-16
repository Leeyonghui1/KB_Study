using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P1
{
    public class Tiger : Cat
    {
        // 하이딩  :: 강제 형변환하여 부모 클래스의 메소드 호출 가능
        public new void eat()
        {
            System.Windows.Forms.MessageBox.Show($"{this.name} 호랑이는 무섭게 먹습니다. {this.age}살이에요.");
        }

        // 오버라이딩 :: 강제 형변환해도 부모 클래스의 메소드 호출 불가능
        public override void fight()
        {
            // base.fight() :: 조상 클래스의 fight() 호출
            System.Windows.Forms.MessageBox.Show($"{this.age}살 {this.name} 호랑이의 혈투");
        }

        // object 클래스의 ToString 메소드 오버라이딩
        public override string ToString()
        {
            // return base.ToString();
            return $"이름 : {this.name}, 나이 : {this.age}";
        }
    }
}
