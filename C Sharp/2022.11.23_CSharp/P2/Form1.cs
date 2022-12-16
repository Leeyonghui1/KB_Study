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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            List<Product> products = new List<Product>();
            products.Add(new Product() { id = 1, price = 1000, name = "감자" });
            products.Add(new Product() { id = 3, price = 500, name = "파" });
            products.Add(new Product() { id = 2, price = 100, name = "젤리" });

            // var 대신 타입을 알면 타입을 직접 적어줘도 가능
            foreach (Product p in products)
            {
                MessageBox.Show($"{p.name}");
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            List<Product> products = new List<Product>();
            products.Add(new Product() { id = 1, price = 1000, name = "감자" });
            products.Add(new Product() { id = 3, price = 500, name = "파" });
            products.Add(new Product() { id = 2, price = 100, name = "젤리" });

            // CompareTo가 정의되어 있지 않다면 Sort() 호출 불가능
            // IComparable 인터페이스를 구현해서(CompareTo 메소드 구현) Sort() 호출 가능
            // 여기서는 젤리 , 파 , 감자순서로 나옴
            products.Sort();

            foreach (Product p in products)
            {
                MessageBox.Show($"{p.name}");
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            List<Product> products = new List<Product>();
            products.Add(new Product() { id = 1, price = 1000, name = "감자" });
            products.Add(new Product() { id = 3, price = 500, name = "파" });
            products.Add(new Product() { id = 2, price = 100, name = "젤리" });

            products.Sort();

            foreach (Product p in products)
            {
                MessageBox.Show($"{p.name}");
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            List<Product> products = new List<Product>();
            products.Add(new Product() { id = 1, price = 1000, name = "감자" });
            products.Add(new Product() { id = 3, price = 500, name = "파" });
            products.Add(new Product() { id = 2, price = 100, name = "젤리" });

            products.Sort();

            foreach (Product p in products)
            {
                MessageBox.Show($"{p.name}");
            }
        }
    }
}
