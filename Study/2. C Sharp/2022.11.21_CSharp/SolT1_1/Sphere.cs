using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT1_1
{
    // 다중상속 불가
    // 다중상속이 되는 것 처럼은 할 수 있다.
    public class Sphere : Circle
    {
        public Sphere(int r) : base(r)
        {
        }
        public double getVolume()
        {
            return (4.0 / 3) * PI * r * r * r;
        }
    }
}
