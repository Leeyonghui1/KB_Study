using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT3
{
    public class MyMath2
    {
        // static :: 클래스 변수, 클래스 메소드
        // 클래스명.메소드명() 으로 호출
        // 인스턴스 만들지 않고 사용가능
        // static 메소드 안에는 static 변수, 메소드만 들어갈 수 있음
        // ==> static은 프로그램 시작 시 메모리에 올라가기 때문에, 인스턴스 값 불가
        // ==> 반대로 인스턴스 메소드 안 static 변수,메소드 가능


        public static int power(int x)
        {
            return x * x;
        }

        public static int multi(int x, int y)
        {
            return x * y;
        }

        
        public static int power(int x, int c)
        {
            // 1. Math.Pow :: double 타입
            return (int)Math.Pow(x, c);

            /*
            // 2. 반복문
            int result = 1;
            for(int i = 0; i < c; i++)
                result *= x;
            return result;
            */
        }
    }
}
