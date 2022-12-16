using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P4
{
    // 인터페이스끼리 상속도 가능
    public interface IMyRobot : IFight, ICharming
    {
        void printMessage(string message);
    }
}
