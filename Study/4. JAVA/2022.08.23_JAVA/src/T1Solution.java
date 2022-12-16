import java.util.*;

class Cals{
	//멤버 변수
	private char ch;
	
	// 생성자
	public Cals(char c) {this.ch = c;}

	// 메소드
	public char getCh() {return this.ch;}
	public int sums(int a, int b) {return a+b;}
	public int subs(int a, int b) {return a-b;}
	public int muls(int a, int b) {return a*b;}
	public int divs(int a, int b) {return a/b;}
	public int rest(int a, int b) {return a%b;}
}

public class T1Solution {
	public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	Cals arr[] = new Cals[5];
	arr[0] = new Cals('+');
	arr[1] = new Cals('-');
	arr[2] = new Cals('*');
	arr[3] = new Cals('/');
	arr[4] = new Cals('%');
	
	while(true)
	{
		int a = s.nextInt();
		int b = s.nextInt();
		if(a == 0 && b == 0) {break;}
		char c = s.next().charAt(0);
		int result = -1;
		if(c == arr[0].getCh()) {result = arr[0].sums(a, b);}
		else if(c == arr[1].getCh()) {result = arr[1].subs(a, b);}
		else if(c == arr[2].getCh()) {result = arr[2].muls(a, b);}
		else if(c == arr[3].getCh()) {result = arr[3].divs(a, b);}
		else if(c == arr[4].getCh()) {result = arr[4].rest(a, b);}
		
		System.out.println("결과는 "+result);
	}
	s.close();
	}
}
