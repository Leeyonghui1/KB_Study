using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    public class Product
    {
        public string Name { get; set; }
        public int Price { get; set; }

        // 기본 생성자 :: 기본 생성자 적지 않아도 기본적으로 내장되어 호출됨
        public Product()
        {

        }

        // 생성자를 새롭게 정의하면 기본 생성자는 자동 삭제
        // 기본 생성자도 쓰고 싶다면 기본 생성자를 적어야 함
        // 생성자 오버로딩
        public Product(string Name)
        {
            this.Name = Name;
        }

        public Product(int Price)
        {
            this.Price = Price;
        }

        public Product(string name, int price)
        {
            this.Name = name;
            this.Price = price;
        }
    }
}
