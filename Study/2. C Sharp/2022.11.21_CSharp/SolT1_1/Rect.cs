using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SolT1_1
{
    public class Rect
    {
        // Java 방식
        //private int width;
        //public int getWidth() { return this.width; }
        //public void setWidth(int w) { this.width = w; }

        // C# 방식
        //private int width;
        //public int w { get { return width; } set { width = value; } }
        //public int w { get => width; set { width = value; } }
        
        public int w { get; set; }
        public int h { get; set; }
        public int getArea()
        {
            return w * h;
        }
    }
}
