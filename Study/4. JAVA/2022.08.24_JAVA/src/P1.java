import java.util.*;

class A{
	// A 멤버 : n1
	private int n1;
	public A(int a) {
		this.n1 = a;
		// 생성자 안에 초기화 명령문 이외 다른 명령문 정의 가능
		System.out.println("클래스 A의 멤버 n1 값 저장 완료");
		System.out.println("저장된 n1의 값: " + this.n1);
	}
	public void print(String s) 
	{System.out.println(s + "의 n1 값: " + this.n1);}
}

class B extends A{
	// B 멤버 : n1, n2
	private int n2;
	
	// super() : 부모 클래스의 생성자가 재정의가 되었다면
	//           자식 클래스에서 부모 클래스 생성자를 호출할 때 사용
	public B(int a, int b) {
		super(a);    // 부모 클래스에서 재정의한 생성자로 
					 // 부모 클래스 멤버인 n1을 초기화함
		this.n2 = b;
		System.out.println("클래스 B의 멤버 n2 값 저장 완료");
		System.out.println("저장된 n2의 값: " + this.n2);
	}
	public void print(String s) 
	{System.out.println(s + "의 n2 값: " + this.n2);}
}

public class P1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		// A 클래스에 대한 객체 a 생성
		A a = new A(i);
		
		int j = s.nextInt();
		int k = s.nextInt();
		// B 클래스에 대한 객체 b 생성
		B b = new B(j,k);
		
		// 오버라이딩 : 부모 클래스의 함수를 자식 클래스에서 다시 정의
		// 부모 클래스와 자식 클래스에 동일한 이름의 함수가 있다면
		// 자식 클래스의 객체는 부모 클래스의 동일한 이름의 함수를 실행하지 못함
		// 결론 : 자식 클래스 입장에선 "덮어쓰기"한 함수 실행
		System.out.println();
		a.print("a"); // 클래스 A의 메소드 print()실행
		b.print("b"); // 클래스 B의 메소드  print()실행
		// 자식 클래스 B의 객체 'b'를 통해 부모 클래스 A의 메소드 print() 실행 불가
		s.close();
	}
}
