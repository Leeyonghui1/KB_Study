using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace T1
{
    public class Cuboid : Rectangle
    {
        public int Height { get; set; }

        public int cuboidVolume(int h)
        {
            return Width * Length * h;
        }
    }
}
