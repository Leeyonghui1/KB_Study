using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace T1
{
    public partial class Form1 : Form
    {
        List<Student> students = new List<Student>();

        public Form1()
        {
            InitializeComponent();
        }
       
        private void button1_Click(object sender, EventArgs e)
        {
            string name = textBox1.Text;
            string hakbeon = textBox2.Text;
            string gender = textBox3.Text;

            Student s = new Student() { Name = name, Hakbeon = hakbeon, Gender = gender };

            studentBindingSource.Add(s);
            students.Add(s);

            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
        }

        private void button2_Click(object sender, EventArgs e)
        {  
            List<Student> new_students = new List<Student>();
            foreach (Student student in students)
                new_students.Add((Student)student);

            string hakbeon = textBox4.Text;
            Student s1 = students.Find(x => x.Hakbeon == hakbeon);
            int i = studentBindingSource.IndexOf(s1);          


            //students.Remove(s1);
            //studentBindingSource.RemoveAt(i);
            //studentBindingSource.Remove(s1);

            string name = textBox5.Text;
            string gender = textBox6.Text;
            Student s = new Student() { Name=name, Hakbeon = hakbeon, Gender = gender };
            new_students[i] = s;


            studentBindingSource.Clear();
            foreach (Student student2 in new_students)
                studentBindingSource.Add(student2);
            
            //students[i] = s;
            //students.Add(s);
            //studentBindingSource.Add(s);
            //studentBindingSource[i] = s;
            
            textBox4.Text = "";
            textBox5.Text = "";
            textBox6.Text = "";
            new_students.Clear();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            string name = textBox1.Text;
            string hakbeon = textBox2.Text;
            string gender = textBox3.Text;

            Student s1 = students.Find(x => x.Name == name);
            Student s2 = students.Find(x => x.Hakbeon == hakbeon);
            Student s3 = students.Find(x => x.Gender == gender);


            studentBindingSource.Remove(s1);
            studentBindingSource.Remove(s2);
            studentBindingSource.Remove(s3);

            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";

        }

        private void button4_Click(object sender, EventArgs e)
        {
            List<Student> selectstu = null;

            string name = textBox7.Text;
            selectstu = students.FindAll(x => x.Name == name);

            dataGridView2.DataSource = null;
            dataGridView2.DataSource = selectstu;

            textBox7.Text = "";
            
        }
    }
}
