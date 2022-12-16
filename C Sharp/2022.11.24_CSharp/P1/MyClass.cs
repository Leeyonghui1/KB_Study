using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P1
{
    public class MyClass : MyBase
    {
        // 인스턴스 변수 이지만
        // 싱글톤패턴을 쓰면
        // 단 하나의 인스턴스(객체)를 생성하여 값을 공유
        public int num { get; set; }

        public void printMsg(string msg)
        {
            System.Windows.Forms.MessageBox.Show(msg+"Test"+num);
        }

        public override void print(string msg)
        {
            System.Windows.Forms.MessageBox.Show(msg);
        }

        // 싱글톤의 핵심 :: 단 한개의 객체만 생성
        // 이유 : 클래스 메소드나 클래스 변수는 "상속"이 안되고 "공유"한다. 그래서 오버라이딩 등 불가능
        // 클래스변수 메모리 :: 데이터 영역에 저장 (프로그램 시작 시 메모리 할당)
        // 인스턴스변수 메모리 :: 힙 영역  (다 쓰면 자동 소멸)
        // 메모리 효율은 데이터영역이 더 좋음
        private static MyClass _instance = null;
        // 오직 1개의 인스턴스(객체)만 생성하기 위해 생성자를 막음
        private MyClass()
        {

        }

        // C# 스타일
        public static MyClass getInstance
        {
            get
            {
                if(_instance == null)
                    _instance = new MyClass();
                return _instance;
            }
        }

        // Java 스타일
        public static MyClass _getInstance()
        {
            if (_instance == null)
                _instance = new MyClass();
            return _instance;
        }
    }
}
