using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P2
{
    // delegate :: 대리자
    // => 일종의 클래스 처럼 사용자 정의 자료형
    // => 함수를 매개변수처럼 쓰게 만드는 것
    // delegate, 람다를 이용하면 많은 동작을 짧은 코드로 작성가능
    public delegate void VoidFunc();
    public delegate int IntegerFunc();
    public delegate void ParameterFunc(int i);
    public delegate int IntegerParamFunc(int i); 

    public partial class Form1 : Form
    {
        // 클래스 안쪽에 델리게이트 선언 가능
        //public delegate void VoidFunc();
        //public delegate int IntegerFunc();
        //public delegate void ParameterFunc(int i);
        //public delegate int IntegerParamFunc(int i);

        public int power(int num)
        {
            return num * num;
        }
        // executeFunc 오버로딩
        public void executeFunc(IntegerParamFunc i, int num)
        {
            MessageBox.Show($"{num}의 제곱 : {i(num)}");
        }
        public void myTest()
        {
            MessageBox.Show("My Test");
        }
        public void yourTest()
        {
            MessageBox.Show("Your Test");
        }
        public void executeFunc(VoidFunc v, int c)
        {
            for (int i = 0; i < c; i++)
                v();
        }

        List<Product> products = new List<Product>();

        public Form1()
        {
            InitializeComponent();
            products.Add(new Product() { id = 5, name = "감자", price = 100 });
            products.Add(new Product() { id = 1, name = "돌", price = 50 });
            products.Add(new Product() { id = 3, name = "칫솔살균기", price = 0 });


            button4.Click += (s, e) =>
            {
                MessageBox.Show("버튼4 클릭");
            };
            // 이벤트를 여러 개 붙일 수 있다.
            button4.Click += delegate (object s, EventArgs e)
            {
                MessageBox.Show((s as Button).Text);
            };

            button4.Click += button1_Click;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            executeFunc(myTest, 2);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            // 무명 delegate
            // 한 곳에서만 쓸 함수 생성법
            executeFunc(delegate () {
                MessageBox.Show("안녕하세요");
            }, 3);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            // 람다 표현
            // 무명 delegate를 더 줄인 형태
            // 간단하게 함수를 쓰고 싶을 때 씀
            // 한번만 쓰거나 임시로 함수 쓸 때 사용
            // 무명 delegate, 람다는 메모리 관리가 효율적이다.
            executeFunc(() => { MessageBox.Show("aaa"); }, 10);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            executeFunc(power, 10);  // 100출력
            
            // 델리게이트를 매개변수나 변수로 사용가능
            VoidFunc myvoid = yourTest;
            myvoid(); // yourTest 호출
        }

        private void button6_Click(object sender, EventArgs e)
        {
            executeFunc(delegate (int n) { return n * n * n; }, 5);
        }

        private void button7_Click(object sender, EventArgs e)
        {
            executeFunc((int n) => { return n * n * n * n; }, 10);
            // executeFunc((n) => n * n * n * n , 10);

        }

        private void button8_Click(object sender, EventArgs e)
        {
            // id 오름차순 정렬
            products.Sort(delegate (Product a, Product b) 
            {
                return a.id.CompareTo(b.id);
            });
        }

        private void button9_Click(object sender, EventArgs e)
        {
            // 가격 오름차순 정렬
            products.Sort((a, b) => a.price.CompareTo(b.price));
        }

        private void button10_Click(object sender, EventArgs e)
        {
            // 출력
            foreach (Product p in products)
                MessageBox.Show($"{p.name}, {p.price}, {p.id}");
        }
    }
}
