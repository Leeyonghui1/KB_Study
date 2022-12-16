using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT3
{
    public class MyMath3
    {
      
        // 뒷부분 매개변수(c)는 생략이 가능하고 변경이 가능한 파라메터
        // ==> 선택적 매개변수라고 부름
        // power(10) ==> power(10, 2)
        // power(10, 3) ==> power(10, 3)
        public static int power(int x, int c=2)
        {
            int result = 1;
            for (int i = 0; i < c; i++)
                result *= x;
            return result;
        }

        public static int multi(int x, int y)
        {
            return x * y;
        }

    }
}
