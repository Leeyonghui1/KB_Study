using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P3
{
    public interface IRpgCharacter
    {
        int level { get; set; }

        void Attack();
    }
}
