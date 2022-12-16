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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // char 타입자체는 바로 숫자로 대응되기 때문에 바로 글자출력 가능
            for(char i = '가'; i <= '힣'; i++)
                Console.Write(i);
            Label label = new Label();
            label.AutoSize = true;
            // Point :: c#에서 만든 구조체 || 주로 위치를 지정할 때 사용
            // Point(a,b) :: x좌표=a, y좌표=b
            label.Location = new Point(0, 100);
            label.Name = "mylabel";  // 디자인창에서의 변수 이름
            for (char i = '가'; i <= '힣'; i++)
            {
                label.Text += i;
                if (i % 100 == 0)
                    label.Text += Environment.NewLine;
                // "\n" = Environment.NewLine
            }
            Controls.Add(label); // 디자인창에 코드로 생성한 label를 추가
        }

        private void button2_Click(object sender, EventArgs e)
        {
            // Controls의 길이만큼 동작하는 반복문
            // item :: Controls에 있는 다양한 타입들의 구성요소를 의미
            // 현재 Controls에는 버튼2개, 코드로생성한 label 1개가 있음
            foreach (var item in Controls)
            {
                // is :: 타입 체크 명령어
                if (item is Label)
                {
                    Label temp = item as Label;
                    if (temp.Name == "mylabel")
                    {
                        Controls.Remove(temp);
                        break;
                    }
                }
            }
        }
    }
}
