using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Linq;

namespace T2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string url = "https://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=2714000000";
            XElement x = XElement.Load(url);
            Console.WriteLine(x.Element("channel").Element("title").Value);
            //Console.WriteLine(x.Elements("channel").ElementAt(0).Value); 
            //Console.WriteLine(x.Element("rss").Element("channel").Element("title"));

            var xq = from item in x.Descendants("data")
                     select new Weather()
                     {
                         hour = int.Parse(item.Element("hour").Value),
                         wf = item.Element("wfKor").Value.ToString(),
                         temp = double.Parse(item.Element("temp").Value)
                     };

            // List형태로 변환
            List<Weather> w = xq.ToList<Weather>();

            foreach (var item in w)
                weatherBindingSource.Add(item);

            label1.Text = x.Element("channel").Element("title").Value;
            

            
        }
    }
}
