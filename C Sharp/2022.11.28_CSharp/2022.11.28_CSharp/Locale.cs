namespace _2022._11._28_CSharp
{
    // 위치정보 (위치 이름, 그 위치의 좌표들)
    public class Locale
    {
        public string name { get; set; }
        public double Lat { get; set; } // Y 좌표
        public double Lng { get; set; } // X 좌표

        public Locale(string name, double lat, double lng)
        {
            this.name = name;
            Lat = lat;
            Lng = lng;
        }

        public override string ToString()
        {
            return name;  // string 으로 변환시 이름만 리턴
        }
    }
}
