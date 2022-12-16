using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkingCarManager
{
    // 컨트롤러
    // 클래스 메소드 사용
    
    public class DataManager
    {
        public static List<ParkingCar> Cars = new List<ParkingCar>();
        // 정적 생성자, 딱 한번만 호출
        static DataManager()
        {
            Load();
        }
        public static void Load()
        {

        }
        // 파일에 로그 기록
        public static void printLog(string contents)
        {
            // ParkingHistory 폴더
            DirectoryInfo di = new DirectoryInfo("ParkingHistory");
            if(di.Exists == false)  // 해당 폴더가 없으면
                di.Create(); // 폴더 생성
            // ParkingHistory 폴더에 ParkingHistory.txt 파일에 내용을 적는다.
            // true :: 새로운 내용을 뒤에 추가한다
            using (StreamWriter w = new StreamWriter("ParkingHistory\\ParkingHistory.txt", true))
            {
                w.WriteLine(contents);
            }
        }
    }
}
