using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    public class Product : IComparable<Product>
    {
        // IComparable 인터페이스 :: CompareTo 메소드를 반드시 구현하라는 규칙을 부여

        public int id { get; set; }
        public string name { get; set; }
        public int price { get; set; }

        // IComparable<Product>  대신 IComparable 만 적으면
        // public int CompareTo(object other)  :: 매개변수가 object가 된다 -> 별도의 형변환을 해야함
        
        /*
        // 버튼2 :: 가격 오름차순
        public int CompareTo(Product other)
        {
            // 반환값이 음수, 0, 양수 에 따라서 정렬이 달라짐
            return price.CompareTo(other.price);
            // throw new NotImplementedException();
        }
        */
        /*
        // 버튼3 :: id 오름차순
        public int CompareTo(Product other)
        {
            return id.CompareTo(other.id); 
        }
        */
        
        // 버튼4 :: 가격 내림차순
        public int CompareTo(Product other)
        {
            // return -1*price.CompareTo(other.price);
            return other.price.CompareTo(price);
        }
        
    }
}
