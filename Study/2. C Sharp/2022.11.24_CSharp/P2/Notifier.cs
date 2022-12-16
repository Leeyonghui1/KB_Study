using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace P2
{
    public class Notifier : ISubject
    {
        // 접근제한자 생략 시 C#에서는 기본값은 private
        // IObserver를 구현하는 객체(인스턴스)를 담는 리스트타입 변수
        private List<IObserver> observers = new List<IObserver>();

        public void notify(string msg)
        {
            foreach (IObserver o in observers)            
                o.update(msg);   
        }

        public void register(IObserver o)
        {
            observers.Add(o);
        }

        public void unregister(IObserver o)
        {
            observers.Remove(o);
        }
    }
}
