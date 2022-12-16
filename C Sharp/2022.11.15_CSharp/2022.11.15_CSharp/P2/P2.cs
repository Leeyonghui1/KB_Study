using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    internal class P2
    {
        static void Main(string[] args)
        {
            // 구조체 b1, b2
            // 동명이인, 잔액이 다른 상황
            BKBank b1 = new BKBank();
            b1.Name = "박재형";
            b1.Balance = 10000000;
            BKBank b2 = b1;
            b2.Balance = 0;
            // 각각의 balance값이 다르다
            b1.info();
            b2.info();

            KBBank kb1 = new KBBank();
            kb1.Name = "박지호";
            kb1.Balance = 50000000;
            KBBank kb2 = kb1;
            kb2.Balance = 0;
            // 둘다 balance값 0
            kb1.info();
            kb2.info();

            // 이 문제를 해결하려면 어떻게?
            // new를 사용해서 새로운 위치를 할당하던지
            // ShallowCopy()함수의 MemberwiseClone()을 생성해서 사용
            /*
            KBBank kb3 = (KBBank) kb1.ShallowCopy();
            kb3.Balance = 100;
            kb3.info();
            */
            kb1.Balance = 50000000;
            kb1.Name = "박지호";
            // 답1. 일일히 복사 :: new 키워드로 인터페이스를 생성해야함
            KBBank kb3 = new KBBank();
            kb3.Name = kb1.Name;
            kb3.Balance = 1000;
            kb3.info();
            // 답2. ICloneable 인터페이스 구현
            // 답3. 생성자를 이용한 복사
            // 답4. 별도의 메소드를 만드는 방법


            KyungBookBank kbb1 = new KyungBookBank("조영탁");
            kbb1.Balance = 5000;
            KyungBookBank kbb2 = new KyungBookBank(kbb1.Name);
            kbb2.Balance = 0;

            kbb1.info();
            kbb2.info();

            kbb1.Saving(10000);
            kbb1.info();

            kbb2.withDrawal(5000);
            kbb2.info();

        }
    }
}
