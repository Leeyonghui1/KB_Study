using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T1
{
    public class Circle
    {
        public const double PI = 3.14;
        public int r { get; set; }

        public double circleRound(int r)
        {
            return 2 * PI * r;
        }

        public double circleArea(int r)
        {
            return PI * r * r;
        }
    }
}
