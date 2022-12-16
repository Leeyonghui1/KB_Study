import java.util.*;
// 현재 시각 저장하는 클래스

class Clock_Sol{
	// 멤버 변수
	private int hours;
	private int mins;
	private int secs;
	
	// 생성자
	// 객체 생성할 때만 사용가능
	public Clock_Sol(int h, int m, int s) {
		this.hours = h;
		this.mins = m;
		this.secs = s;
	}
	
	// 멤버 함수(메소드)
	// 필요할 때마다 함수 호출 가능
	public void settingTime(int h, int m, int s) {
		this.hours = h;
		this.mins = m;
		this.secs = s;
	}
	public int getHour() {return this.hours;}
	public int getMin() {return this.mins;}
	public int getSec() {return this.secs;}
	
}

public class T1Solution {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("현재 시각을 입력하세요");
		int hours = sc.nextInt();
		int mins = sc.nextInt();
		int secs = sc.nextInt();
		
		// 입력값으로 멤버 변수 초기화 하면서 객체 생성
		Clock_Sol c1s = new Clock_Sol(hours,mins,secs);
		Clock_Sol c2s = new Clock_Sol(hours,mins,secs);
		
		// c2 객체의 멤버를 특정값으로 변경하기(메소드 필요)
		c2s.settingTime(16,40,30);
		
		// 멤버 함수 통해서 c1,c2 간 시간 차이 계산
		// 결과가 마이너스 값이 안나오도록
		int sub_H = c2s.getHour() - c1s.getHour();
		int sub_M = c2s.getMin() - c1s.getMin();
		int sub_S = c2s.getSec() - c1s.getSec();
		if(sub_S<0) {
			sub_S = 60 + sub_S;
			sub_M--;
		}
		if(sub_M<0) {
			sub_M = 60 + sub_M;
			sub_H--;
		}
		// 출력
		System.out.println("현재 시각은 " + c1s.getHour() + "시" + c1s.getMin() + "분" + c1s.getSec() + "초");
		System.out.println("강의종료 시간은 " + c2s.getHour() + "시" + c2s.getMin() + "분" + c2s.getSec() + "초");
		System.out.println("강의종료까지 남은 시간은 " + sub_H + "시간" + sub_M + "분" + sub_S + "초");
		System.out.print("강의종료까지 남은 시간은 " + sub_H + "시간 ");
		if(sub_M<10) {
			System.out.print(0);
		}
		System.out.print(sub_M+"분 ");
		if(sub_S<10) {
			System.out.print(0);
		}
		System.out.print(sub_S+"초 ");
		sc.close();
	}

}
