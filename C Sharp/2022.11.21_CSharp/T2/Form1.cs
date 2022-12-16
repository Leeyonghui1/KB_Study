using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace T2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            List<Student> students = new List<Student>();
            students.Add(new Student() { Name = "이용희", Grade = 1 });
            students.Add(new Student() { Name = "김성근", Grade = 2 });
            students.Add(new Student() { Name = "장태연", Grade = 3 });
            students.Add(new Student() { Name = "안서준", Grade = 4 });
            students.Add(new Student() { Name = "차승화", Grade = 1 });
            students.Add(new Student() { Name = "김보규", Grade = 2 });

            for(int i = 0; i < students.Count; i++)
            {
                Label label = new Label();
                label.Text = $"{students[i].Grade}학년 {students[i].Name} 학생";
                label.AutoSize = true;
                label.Location = new Point(13, 13 + (23 + 3) * i);
                Controls.Add(label);
            }

            //for(int i = students.Count-1; i >= 0; i--)
            //{
            //    if (students[i].Grade > 1)
            //        students.RemoveAt(i);
            //}

            for(int i = 0; i < students.Count; i++)
            {
                if (students[i].Grade > 1)
                {
                    students.RemoveAt(i);
                    i--;
                }
            }

            for (int i = 0; i < students.Count; i++)
            {
                Label label = new Label();
                label.Text = $"{students[i].Grade}학년 {students[i].Name} 학생";
                label.AutoSize = true;
                label.Location = new Point(130, 13 + (23 + 3) * i);
                Controls.Add(label);
            }
        }
    }
}
