import java.util.*;
class Avg{
	// 필드
	private int kor;
	private int eng;
	private int math;
	private int soc;
	private int sci;
	
	// 생성자
	public Avg()
	{
		this.kor = 50;
		this.eng = 50;
		this.math = 50;
		this.soc = 50;
		this.sci = 50;
	}
	public Avg(int k, int e, int m)
	{
		this.kor = k;
		this.eng = e;
		this.math = m;
		this.soc = 50;
		this.sci = 50;
	}
	public Avg(int k, int e, int m, int soc, int sci)
	{
		this.kor = k;
		this.eng = e;
		this.math = m;
		this.soc = soc;
		this.sci = sci;
	}
	
	// 메소드
	public void setKor(int k) {this.kor = k;}
	public int getKor() {return kor;}
	public void setEng(int e) {this.eng = e;}
	public int getEng() {return eng;}
	public void setMath(int m) {this.math = m;}
	public int getMath() {return math;}
	public void setSoc(int soc) {this.soc = soc;}
	public int getSoc() {return soc;}
	public void setSci(int sci) {this.sci = sci;}
	public int getSci() {return sci;}
	
	public double getAvg(int k, int e, int m) {return (k+e+m) / 3;}
	public double getAvg(int k, int e, int m, int soc, int sci) {return (k+e+m+soc+sci) / 5;}
}

public class T1_2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		Avg avg1 = new Avg();
		
		double size1 = avg1.getAvg(avg1.getKor(), avg1.getEng(), avg1.getMath());
		double size2 = avg1.getAvg(avg1.getKor(), avg1.getEng(), avg1.getMath(), avg1.getSoc(), avg1.getSci());
		
		System.out.println("국영수 평균은 = " + size1);
		System.out.println("국영수사과 평균은 = " + size2);
		
		int k = s.nextInt();
		int e = s.nextInt();
		int m = s.nextInt();
		
		Avg avg2 = new Avg(k,e,m);
		avg2.setKor(k);
		avg2.setEng(e);
		avg2.setMath(m);
		
		double size3 = avg2.getAvg(avg2.getKor(), avg2.getEng(), avg2.getMath());
		double size4 = avg2.getAvg(avg2.getKor(), avg2.getEng(), avg2.getMath(), avg2.getSoc(), avg2.getSci());
		
		System.out.println("국영수 평균은 = " + size3);
		System.out.println("국영수사과 평균은 = " + size4);
		
		
		k = s.nextInt();
		e = s.nextInt();
		m = s.nextInt();
		int soc = s.nextInt();
		int sci = s.nextInt();
		
		Avg avg3 = new Avg(k,e,m,soc,sci);
		avg3.setKor(k);
		avg3.setEng(e);
		avg3.setMath(m);
		avg3.setSoc(soc);
		avg3.setSci(sci);
		
		double size5 = avg3.getAvg(avg3.getKor(), avg3.getEng(), avg3.getMath());
		double size6 = avg3.getAvg(avg3.getKor(), avg3.getEng(), avg3.getMath(), avg3.getSoc(), avg3.getSci());
		
		System.out.println("국영수 평균은 = " + size5);
		System.out.println("국영수사과 평균은 = " + size6);
		
		
		s.close();
	}
}
