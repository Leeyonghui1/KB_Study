import java.util.*;

class Average {
	// 멤버 변수
	public int kor;
	public int math;
	public int eng;
	public int soc;
	public int sci;
	
	// 생성자
	public Average() {
		this.kor = 50;
		this.math = 50;
		this.eng = 50;
		this.soc = 50;
		this.sci = 50;
	}
	public Average(int kor, int math, int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.soc = 50;
		this.sci = 50;
	}
	public Average(int kor, int math, int eng, int soc, int sci) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.soc = soc;
		this.sci = sci;
	}
	
	// 메소드
	public double getAvg(int kor, int math, int eng) {
		return (kor + math + eng) / 3;
	}
	public double getAvg(int kor, int math, int eng, int soc, int sci) {
		return (kor + math + eng + soc + sci) / 5;
	}
}

public class T1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		// 객체 1 생성
		Average avg1 = new Average();
		
		System.out.println("객체 2 데이터 입력");
		int kor2 = s.nextInt();
		int math2 = s.nextInt();
		int eng2 = s.nextInt();
		// 객체 2 생성
		Average avg2 = new Average(kor2, math2, eng2);
		
		System.out.println("객체 3 데이터 입력");
		int kor3 = s.nextInt();
		int math3 = s.nextInt();
		int eng3 = s.nextInt();
		int soc3 = s.nextInt();
		int sci3 = s.nextInt();
		// 객체 3 생성
		Average avg3 = new Average(kor3, math3, eng3, soc3, sci3);
		
		// 객체 배열 선언
		Average arr[] = new Average[3];
		arr[0] = avg1;
		arr[1] = avg2;
		arr[2] = avg3;
	
		// 출력
		for(int i = 0 ; i < 3 ; i++)
		{
			System.out.println("객체" + (i+1) + "의 국영수 평균 : " + arr[i].getAvg(arr[i].kor, arr[i].math, arr[i].eng));
			System.out.println("객체" + (i+1) + "의 국영수사과 평균 : " + arr[i].getAvg(arr[i].kor, arr[i].math, arr[i].eng, arr[i].soc, arr[i].sci));
		}		
		s.close();
	}

}
