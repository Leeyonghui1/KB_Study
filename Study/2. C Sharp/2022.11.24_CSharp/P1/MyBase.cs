using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P1
{
    public class MyBase
    {
        public string name { get; set; }
        // 정적(static)은 virtual 못씀
        public virtual void print(string msg)
        {
            Console.WriteLine(msg);
        }

    }
}
