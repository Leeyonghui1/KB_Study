using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SolT1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        // 추가
        private void button1_Click(object sender, EventArgs e)
        {
            studentBindingSource.Add(new Student() 
            { 
                Name = textBox1.Text, 
                Hakbeon = textBox2.Text, 
                Gender = textBox3.Text 
            });

            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
        }

        // 수정
        private void button2_Click(object sender, EventArgs e)
        {
            // 이름으로 찾아서 나머지 값들을 수정
            string name = textBox1.Text;
            for(int i = 0; i < studentBindingSource.Count; i++)
            {
                Student s = studentBindingSource[i] as Student;
                if(s.Name == name)
                {
                    s.Hakbeon = textBox2.Text;
                    s.Gender = textBox3.Text;
                    studentBindingSource[i] = s;
                }
            }
        }

        // 삭제
        private void button3_Click(object sender, EventArgs e)
        {
            string name = textBox1.Text;
            for (int i = studentBindingSource.Count-1; i >= 0; i--)
            {
                Student s = studentBindingSource[i] as Student;
                if (s.Name == name)
                {
                    studentBindingSource.RemoveAt(i);
                }
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            string name = textBox4.Text;
            List<Student> ss = new List<Student>();

            for (int i = 0; i < studentBindingSource.Count; i++)
            {
                Student s = studentBindingSource[i] as Student;
                if (s.Name == name)
                {
                    ss.Add(s);
                }
            }

            dataGridView2.DataSource = null;
            dataGridView2.DataSource = ss;
        }
    }
}
