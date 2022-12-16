using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT1_1
{
    public class Circle
    {
        public int r { get; set; }
        protected double PI = 3.14;
        // protected :: Circle과 Circle 클래스를 상속한 클래스에서만 사용 가능


        //public Circle()
        //{
        //}
        public Circle(int r)
        {
            this.r = r;
        }

        public double getArea()
        {
            return r * r * PI;
        }
        public double getRound()
        {
            return 2 * r * PI;
        }
    }
}
