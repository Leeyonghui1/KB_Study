import java.util.*;

class Score{
	// 멤버 변수 선언
	public int korean;
	public int math;
	public int english;
	public int society;
	public int science;
	
	// 생성자 선언
	public Score() {
		this.korean = 50;
		this.math = 50;
		this.english = 50;
		this.society = 50;
		this.science = 50;
	}
	public Score(int k, int m, int e) {
		this.korean = k;
		this.math = m;
		this.english = e;
		this.society = 50;
		this.science = 50;
	}
	public Score(int k, int m, int e, int so, int sc) {
		this.korean = k;
		this.math = m;
		this.english = e;
		this.society = so;
		this.science = sc;
	}
	
	// 멤버 함수 선언
	public double getAvr3(int k, int m, int e) { // 매개변수 이용하여 값 구하기
		return (double)(k+m+e)/3; 
	}
	public double getAvra3() { // 객체 자체의 값을 통해서 값 구하기
		return (double)(this.korean+this.math+this.english)/3;
	}
	public double getAvr5(int k, int m, int e, int so, int sc) {
		return (double)(k+m+e+so+sc)/5;
	}
	public double getAvra5() {
		return (double)(this.korean+this.math+this.english+this.society+this.science)/5; 
	}
}

public class T1Solution {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// 객체 생성부
		// 객체1 : 입력없이 생성
		System.out.println("s1은 입력없이 자동으로 실행");
		Score s1 = new Score();
		// 객체2 : 3개 입력받고 생성
		System.out.println("s2의 점수 3개 입력");
		System.out.print("국어 점수: ");int a = s.nextInt(); // 국어점수입력
		System.out.print("수학 점수: ");int b = s.nextInt(); // 수학점수입력
		System.out.print("영어 점수: ");int c = s.nextInt(); // 영어점수입력
		Score s2 = new Score(a,b,c);
		// 객체3 : 5개 입력받고 생성
		System.out.println("s3의 점수 5개 입력");
		System.out.print("국어 점수: "); a = s.nextInt();
		System.out.print("수학 점수: "); b = s.nextInt();
		System.out.print("영어 점수: "); c = s.nextInt();
		System.out.print("사회 점수: "); int d = s.nextInt();
		System.out.print("과학 점수: "); int e = s.nextInt();
		Score s3 = new Score(a,b,c,d,e);
		
		// 각 개체들의 국영수 평균, 국영수사과 평균
		double result = s1.getAvr3(s1.korean, s1.english, s1.math);
		System.out.println("s1의 국영수 평균은 = " + result);
		result = s1.getAvra5();
		System.out.println("s1의 국영수사과 평균은 = " + result);
		result = s2.getAvra3();
		System.out.println("s2의 국영수 평균은 = " + result);
		result = s2.getAvr5(s2.korean, s2.math, s2.english, s2.society, s2.science);
		System.out.println("s2의 국영수사과 평균은 = " + result);
		result = s3.getAvr3(a, b, c);
		System.out.println("s3의 국영수 평균은 = " + result);
		result = s3.getAvr5(a, b, c, d, e);
		System.out.println("s3의 국영수사과 평균은 = " + result);
		s.close();
	}

}
