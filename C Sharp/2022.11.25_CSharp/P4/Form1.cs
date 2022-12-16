using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = "";
            List<int> list = new List<int>() { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

            // LINQ
            // 원본 list의 값들은 변화 없음
            // select :: 실제로 출력할 값(output에 들어가는 값)
            // where  :: 조건 
            var output = from item in list select item * item;

            foreach (var item in output)
                label1.Text += item + " ";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            label2.Text = "";
            List<int> list = new List<int>() { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

            var output = from item in list where item % 2 == 0 select item;

            foreach (var item in output)
                label2.Text += item + " ";

            // LINQ의 결과물을 배열이나 리스트로 변환 가능
            int[] a = output.ToArray<int>();
            List<int> b = output.ToList<int>();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            label3.Text = "";
            label4.Text = "";
            List <Product> products = new List<Product>();
            products.Add(new Product() { name = "비빔밥", price = 5000 });
            products.Add(new Product() { name = "라면", price = 1500 });
            products.Add(new Product() { name = "국밥", price = 4500 });
            products.Add(new Product() { name = "귤", price = 500 });



            var output = from item in products
                         orderby item.price
                         select item;

            // 1000원 이상, 가격 내림차순

            var output2 = from item in products
                          where item.price >= 1000
                          orderby item.price descending
                          select item;

            foreach (var item in output)
                label3.Text += $"{item.name}의 가격 : {item.price}   ";

            foreach (var item in output2)
                label4.Text += $"{item.name}의 가격 : {item.price}   ";

            label5.Text = "";
            List<Product> c = output.ToList<Product>();
            label5.Text = c[0].name;

        }

        private void button4_Click(object sender, EventArgs e)
        {
            label6.Text = "";
            
            List<Product> products = new List<Product>();
            products.Add(new Product() { name = "비빔밥", price = 5000 });
            products.Add(new Product() { name = "라면", price = 1500 });
            products.Add(new Product() { name = "국밥", price = 4500 });
            products.Add(new Product() { name = "귤", price = 500 });



            var output = from item in products 
                         where item.price > 1000
                         orderby item.price descending
                         select item;

            foreach (var item in output)
                label6.Text += $"{item.name}, {item.price}{Environment.NewLine}";
            
        }
    }
}
