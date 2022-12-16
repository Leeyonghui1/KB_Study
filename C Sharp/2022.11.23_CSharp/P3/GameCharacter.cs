using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P3
{
    abstract public class GameCharacter
    {
        public string name { get; set; }
        abstract public void sayHello();
    }
}
