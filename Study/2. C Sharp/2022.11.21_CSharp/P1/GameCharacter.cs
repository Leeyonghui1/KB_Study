using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P1
{
    public class GameCharacter
    {
        // 게임 캐릭터 수
        public static int Count = 0;

        // 해당 캐릭터 별 id
        public string id { get; set; }

        // 캐릭터 생성될 때 마다 캐릭터 수 증가
        public GameCharacter()
        {
            Count++;
        }
    }
}
