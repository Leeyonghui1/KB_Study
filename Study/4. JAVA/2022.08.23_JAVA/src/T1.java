import java.util.*;
// 계산기 클래스 문제
class Cal{
	private char p;
	private char s;
	private char m;
	private char d;
	private char r;
	public Cal(){
		this.p = '+';
		this.s = '-';
		this.m = '*';
		this.d = '/';
		this.r = '%';
	}
	public char getP() {return this.p;}
	public char getS() {return this.s;}
	public char getM() {return this.m;}
	public char getD() {return this.d;}
	public char getR() {return this.r;}
	public int sum(int a, int b) {return a+b;}
	public int sub(int a, int b) {return a-b;}
	public int mul(int a, int b) {return a*b;}
	public int div(int a, int b) {return a/b;}
	public int remain(int a, int b) {return a%b;}
}

public class T1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Cal arr = new Cal();		
		while(true)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			if(a == 0 && b == 0)
			{
				System.out.println("시스템종료");
				break;
			}
			char c = s.next().charAt(0);
			int result = 0;
			if(c == arr.getP())
				result = arr.sum(a, b);
			else if(c == arr.getS())
				result = arr.sub(a, b);
			else if(c == arr.getM())
				result = arr.mul(a, b);
			else if(c == arr.getD())
				result = arr.div(a, b);
			else if(c == arr.getR())
				result = arr.remain(a, b);
			else
				System.out.println("연산자 입력 다시");
			System.out.println("결과값 = " + result);
		}
		s.close();
	}
}