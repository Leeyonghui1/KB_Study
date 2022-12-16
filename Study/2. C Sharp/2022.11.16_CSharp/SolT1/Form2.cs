using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SolT1
{
    public partial class Form2 : Form
    {
        private string text1;
        private string text2;

        public Form2()
        {
            InitializeComponent();
        }

        public Form2(string text1, string text2)
        {
            InitializeComponent();  // 반드시 있어야 호출에 응답해줌
            this.text1 = text1;
            this.text2 = text2;

            if (text1 == "admin" && text2 == "1234")
                label1.Text = "관리자님 안녕하세요";
            else
                label1.Text = "너 뭐냐?";
        }
    }
}
