using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P4
{
    public interface IFight
    {
        void killTarget();
        void attackTarget();
        void protecMaster(string name);
    }
}
