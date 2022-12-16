using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace T1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            // 3.
            MyParent.money = 100000;
            MyParent.openDoor();

            // 4.
            MyParent p1 = new MyParent();
            p1.name = "이용희";
            p1.age = 50;
            MyParent p2 = new MyParent();
            p2.name = "장태연";
            p2.age = 55;
            MyChild c1 = new MyChild();
            c1.name = "김성근";
            c1.age = 20;

            // 5.
            Console.WriteLine($"현재 재산은(MyParent) {MyParent.money}입니다.");
            Console.WriteLine($"현재 재산은(MyChild) {MyChild.money}입니다.");

            // 6.
            MyChild.openDoor();

            // 7.
            p1.sleep();
            p2.sleep();
            c1.sleep();

            p1.eat();
            p2.eat();
            c1.eat();

            // 8.
            c1.study();
            c1.playgame();

            // 9.
            c1.buyBitCoin(100000);
            Console.WriteLine($"현재 재산은(MyParent) {MyParent.money}입니다.");
            Console.WriteLine($"현재 재산은(MyChild) {MyChild.money}입니다.");

            // 10.
            List<MyParent> members = new List<MyParent>();
            members.Add(p1);
            members.Add(p2);
            members.Add(c1);

            // 11.
            foreach (var item in members)
            {
                item.eat();
                item.sleep();
                var m = item as MyParent;
                if(m != null)
                {
                    var c = item as MyChild;
                    if(c != null) 
                    {
                        MyChild.openDoor();
                        c.study();
                        c.playgame();
                    }
                    else
                        MyParent.openDoor();
              
                }
            }


        }
    }
}
