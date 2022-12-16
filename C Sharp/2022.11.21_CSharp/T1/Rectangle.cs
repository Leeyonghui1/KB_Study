using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace T1
{
    public class Rectangle 
    {
        public int Width { get; set; }
        public int Length { get; set; }

        public int recArea(int w, int l)
        {
            return w * l;
        }
    }
}
