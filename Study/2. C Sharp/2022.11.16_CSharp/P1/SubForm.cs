using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P1
{
    public partial class SubForm : Form
    {
        public SubForm()
        {
            InitializeComponent();
            // 화면을 그리고 난 뒤에, 구성 요소의 값을 바꿀 수 있음
            label_output.Text = "0";

            // 구성요소 :: 컴포넌트 혹은 컨트롤이라고 부름
            // 2개의 컴포넌트(=컨트롤=구성요소)를 디자인창이 아닌 코드로 추가한것
            Button b1 = new CircularButton();
            b1.Size = new System.Drawing.Size(100, 100); // 사이즈 조절
            b1.Location = new Point(200, 10); // 위치 조절
            b1.Text = "첫번째 원";
            CircularButton b2 = new CircularButton();
            b2.Size = new System.Drawing.Size(100, 100);
            b2.Location = new Point(100, 100);
            b2.Text = "두번째 원";

            // Controls :: 디자인 Form창의 구성요소(컴포넌트)를 의미
            // 코드상으로 컴포넌트를 추가할 때 마지막으로 Controls.Add()를 해야만 디자인창에 추가된다.
            Controls.Add(b1);
            Controls.Add(b2);
        }

        // 생성자 오버로딩
        // Form은 클래스
        public SubForm(string txt)
        {
            InitializeComponent();
            label_output.Text = $"{txt}님 환영합니다.";
        }
    }
}
