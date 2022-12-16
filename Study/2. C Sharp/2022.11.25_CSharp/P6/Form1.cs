using Newtonsoft.Json.Linq;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace P6
{
    // JSON 파일을 가져와서 DataGridView에 띄우기
    // 프로젝트 -> NuGet 패키지 관리 -> 찾아보기 Json -> 로켓모양 설치
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            lottoBindingSource.Clear();

            int.TryParse(textBox1.Text, out int count);
            if (count < 1) // 실패했을 경우
                count = 1;
            while(true) // 입력회차부터 최신회차까지
            {
                using(WebClient wc = new WebClient())
                {
                    var json = wc.DownloadString("https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo="+count);
                    
                    var jArray = JObject.Parse(json);
                    if (jArray["returnValue"].ToString() == "fail")
                        break;
                    Lotto temp = 
                        new Lotto(jArray["drwtNo1"].ToString(), jArray["drwtNo2"].ToString(),
                        jArray["drwtNo3"].ToString(), jArray["drwtNo4"].ToString(), jArray["drwtNo5"].ToString(),
                        jArray["drwtNo6"].ToString(), jArray["bnusNo"].ToString(), jArray["drwNo"].ToString(),
                        jArray["drwNoDate"].ToString());

                    lottoBindingSource.Add(temp);
                    count++;
                }
            }
        }
    }
}
