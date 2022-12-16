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
        // 제일 처음 시작
        public Form1()
        {
            InitializeComponent();
            panel_side.Height = button3.Height;
            panel_side.Top = button3.Top;
            // FirstControl로 만든 유저컨트롤을 맨 앞으로 보냄
            firstControl1.BringToFront();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Dispose();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            panel_side.Height = button3.Height;
            panel_side.Top = button3.Top;
            // FirstControl로 만든 유저컨트롤을 맨 앞으로 보냄
            firstControl1.BringToFront();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            panel_side.Height = button4.Height;
            panel_side.Top = button4.Top;
            // SecondControl로 만든 유저컨트롤을 맨 앞으로 보냄
            secondControl1.BringToFront();
        }

        private void myClickEvent(object sender, EventArgs e)
        {
            // object :: 모든 객체의 조상
            // sender :: 이벤트를 발생시킨 주체
            // EventArgs :: 이벤트에 연관된 내용이 저장된 객체

            // object 타입의 sender를 Button으로 형변환
            // as :: 형변환 명령어
            // Button btn = (sender as Button) :: Button btn = (Button) sender  [똑같은 의미]
            Button btn = (sender as Button);
            panel_side.Height = btn.Height;
            panel_side.Top = btn.Top;
        }
    }
}
