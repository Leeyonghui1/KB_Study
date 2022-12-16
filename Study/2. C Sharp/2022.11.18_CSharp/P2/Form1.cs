using System;
using System.Collections;
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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            // 숫자 10개를 저장하는 방법
            // 1.배열
            int[] number1 = new int[10];
            for (int i = 0; i < 10; i++)
                number1[i] = i;
            foreach (var item in number1)
            {
                Console.WriteLine(item);
            }
            // 배열의 길이 :: Length
            for(int i=0; i < number1.Length; i++)
                Console.WriteLine(number1[i]);


            // 2. List :: 배열이랑 다르게 길이가 정해져 있지 않음
            List<int> number2 = new List<int>();
            for (int i = 0; i < 10; i++)
                number2.Add(i*i);
            foreach (var item in number2)
            {
                Console.WriteLine(item);
            }
            // List의 길이 :: Count
            // List의 구성요소 접근시 배열이랑 똑같이 인덱스로 접근
            // Java에서는 Get으로 접근
            for(int i = 0; i < number2.Count; i++)
                Console.WriteLine(number2[i]);


            // C#에서의 ArrayList :: 모든 타입을 담는 객체
            ArrayList test = new ArrayList();
            test.Add("안녕");
            test.Add(123);
            test.Add('a');
            test.Add(new Random());
        }
    }
}
