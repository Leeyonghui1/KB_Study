using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT1_1
{
    public class Cuboid : Rect
    {
        public int z { get; set; }
        public int getVolume()
        {
            return w * h * z;
        }
    }
}
