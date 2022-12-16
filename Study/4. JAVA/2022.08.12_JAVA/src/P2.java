// 상속 : 특정 클래스의 멤버들을 그대로 사용

// 클래스 A는 클래스 B의 상위클래스
class A{          
	public int n1;
	private int n2;
	protected int n3;
	// protected 멤버 접근할 수 있는 곳
	// 1. 클래스 자기 자신
	// 2. 자신의 클래스를 상속받은 클래스
	// 3. 클래스 자기 자신이 속해있는 패키지 전체
	
	public void setN2(int n) {this.n2 = n;}
	public int getN2() {return this.n2;} 
	public void setN3(int n) {this.n3 = n;}
	public int getN3() {return this.n3;} 
	
}

// 클래스 B는 클래스 A의 하위클래스
// 클래스 B는 A로부터 상속받음
class B extends A{     
	
}

public class P2 {
	public static void main(String args[]) {
		A a = new A();   // 객체 a 생성
		B b = new B();   // 객체 b 생성
		
		// public 멤버 접근
		a.n1 = 1;
		b.n1 = 5;
		System.out.println("객체 a에 대한 n1의 값: "+a.n1);
		System.out.println("객체 b에 대한 n1의 값: "+b.n1);
		
		// private 멤버 접근
		a.setN2(10);
		b.setN2(50);
		System.out.println("객체 a에 대한 n2의 값: "+a.getN2());
		System.out.println("객체 b에 대한 n2의 값: "+b.getN2());
		 
		// protected 멤버 접근
		a.setN3(100);
		b.setN3(500);
		System.out.println("객체 a에 대한 n3의 값: "+a.getN3());
		System.out.println("객체 b에 대한 n3의 값: "+b.getN3());
		
	}

}
