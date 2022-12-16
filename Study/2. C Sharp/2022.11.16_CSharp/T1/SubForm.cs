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
    public partial class SubForm : Form
    {
        public SubForm()
        {
            InitializeComponent();
        }

        public SubForm(string id)
        {
            InitializeComponent();
            if (id.Equals("admin"))
                label_output.Text = "관리자님 환영합니다.";
            else
                label_output.Text = $"{id}님 환영합니다.";
        }
    }
}
