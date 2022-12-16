import java.util.*;

class Clock{
	private int hour;
	private int min;
	private int sec;
	
	public Clock(int h, int m, int s) {
		this.hour = h;
		this.min = m;
		this.sec = s;
	}
	
	public void setTime() {
		this.hour = 12;
		this.min = 40;
		this.sec = 0;
	}
	
	public int getH() {return this.hour;}
	public int getM() {return this.min;}
	public int getS() {return this.sec;}
	
	public int diff_H(int dh, int dm) {
		if(dm < 0)
			return dh-1;
		else
			return dh;
		}
	
	public int diff_M(int dm) {
		if(dm < 0)
			return 60+dm;
		else
			return dm-1;}
	
	public int diff_S(int ds) {return ds+60;}
	
}

public class T1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("현재 시각 입력(시분초)");
		int h = s.nextInt();
		int m = s.nextInt();
		int se = s.nextInt();
		
		Clock c1 = new Clock(h,m,se);
		Clock c2 = new Clock(h,m,se);
		
		c2.setTime();
		
		int dh = c2.getH() - c1.getH();
		int dm = c2.getM() - c1.getM() - 1 ;
		int ds = c2.getS() - c1.getS();
		
		if(c1.getS() < 10)
			System.out.println("현재 시각은 " + c1.getH() + "시" + c1.getM() + "분0" + c1.getS() + "초");
		else
			System.out.println("현재 시각은 " + c1.getH() + "시" + c1.getM() + "분" + c1.getS() + "초");
		
		System.out.println("점심 시간은 " + c2.getH() + "시" + c2.getM() + "분0" + c2.getS() + "초" );
		
		if(c2.diff_S(ds) < 10)
			System.out.println("점심시간까지 남은 시간은 " + c2.diff_H(dh,dm) + "시간" + c2.diff_M(dm) + "분0" + c2.diff_S(ds) + "초");
		else
			System.out.println("점심시간까지 남은 시간은 " + c2.diff_H(dh,dm) + "시간" + c2.diff_M(dm) + "분" + c2.diff_S(ds) + "초");
		
		s.close();
	}
}
