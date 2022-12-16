using System;
using System.Collections.Generic;
using System.Data;
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
            try
            {
                DBHelper.selectQuery();
                Cars.Clear();
                foreach (DataRow item in DBHelper.dt.Rows)
                {
                    ParkingCar car = new ParkingCar();
                    car.ParkingSpot = int.Parse(item["parkingspot"].ToString());
                    car.carNumber = item["carnumber"].ToString();
                    car.driverName = item["drivername"].ToString();
                    car.phoneNumber = item["phonenumber"].ToString();
                    car.parkingTime = item["parkingtime"].ToString() == "" ? new DateTime() : DateTime.Parse(item["parkingtime"].ToString());
                    Cars.Add(car);
                }
            }
            catch (Exception e)
            {
                System.Windows.Forms.MessageBox.Show(e.Message+"load");
                printLog(e.StackTrace + "load");
            }
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

        // 주차 및 출차용 Save
        public static void Save(string parkingSpotText, string carNumber, string driverName, string phoneNumber, bool isRemove=false)
        {
            try
            {
                DBHelper.updateQuery(parkingSpotText, carNumber, driverName, phoneNumber, isRemove);
            }
            catch (Exception)
            {
            }
        }
        // 주차 공간 추가&삭제용 Save
        public static bool Save(string command, string parkingSpot, out string contents)
        {
            
            DBHelper.selectQuery(int.Parse(parkingSpot));
            contents = "";
            if (command == "insert")
                return DBInsert(parkingSpot, ref contents);
            else
                return DBDelete(parkingSpot, ref contents);
        }

        // 공간 추가&삭제용 함수
        private static bool DBDelete(string parkingSpot, ref string contents)
        {
            //throw new NotImplementedException();
            if(DBHelper.dt.Rows.Count != 0)  // 공간 삭제 가능
            {
                DBHelper.deleteQuery(parkingSpot);
                contents = $"주차공간 {parkingSpot}이/가 삭제되었습니다.";
                return true;
            }
            else // 공간 삭제 불가능
            {
                contents = $"주차공간 없습니다.";
                return false;
            }
        }

        private static bool DBInsert(string parkingSpot, ref string contents)
        {
            //throw new NotImplementedException();
            if(DBHelper.dt.Rows.Count == 0) // 공간 추가 가능
            {
                DBHelper.insertQuery(parkingSpot);
                contents = $"주차공간 {parkingSpot}이/가 추가되었습니다.";
                return true;
            }
            else // 해당 공간이 이미 존재하는 경우
            {
                contents = $"해당 공간이 이미 있습니다.";
                return false;
            }
        }
    }
}
