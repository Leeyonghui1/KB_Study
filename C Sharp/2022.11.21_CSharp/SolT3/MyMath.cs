using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT3
{
    public class MyMath
    {
        public int power(int x)
        {
            return x * x;
        }

        public int multi(int x, int y)
        {
            return x * y;
        }

        // 거듭제곱
        // 위의 power 메소드와의 차이점 :: 파라메터 갯수가 다름
        // 동일한 메소드명이나 파라메터 개수나 타입이 다르면 다른 메소드로 취급 :: 오버로딩
        public int power(int x, int c)
        {
            // 1. Math.Pow :: double 타입
            return (int)Math.Pow(x, c);

            /*
            // 2. 반복문
            int result = 1;
            for(int i = 0; i < c; i++)
                result *= x;
            return result;
            */
        }
    }
}
