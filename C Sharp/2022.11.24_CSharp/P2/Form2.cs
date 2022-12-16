using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P2
{
    public partial class Form2 : Form, IObserver
    {
        public Form2()
        {
            InitializeComponent();
        }

        public Form2(ISubject sub)
        {
            InitializeComponent();
            // this :: Form2를 의미
            // Form2가 IObserver를 구현하고 있기때문에 등록가능
            sub.register(this);
        }

        public void update(string value)
        {
            label1.Text = "옵저버1"+value;
        }
    }
}
