using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T1
{
    public class Sphere : Circle
    {
        public double sphereVolume()
        {
            return (double)(4 / 3) * PI * r * r * r;
        }
    }
}
