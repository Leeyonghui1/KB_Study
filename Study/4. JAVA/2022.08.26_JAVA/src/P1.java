// 클래스는 보통 객체를 생성하는 데에 사용
// 클래스의 구성요소 : 멤버변수(필드),멤버함수(메소드),생성자

// 클래스 선언
class A{
	// 멤버 변수
	private int n1; 
	
	// 멤버 함수 
	public void setN(int a) {this.n1 = a;}
	public int getN() {return this.n1;}
	// 오버 로딩 : 메소드명이 같을 때
	//			 매개변수의 수와, 타입이 다르다면
	// 			 동시 선언 가능
	public int Sum() {
		System.out.println("매개변수 없음");
		return 1;}
	public int Sum(int a, int b) {
		System.out.println("매개변수 있음");
		return a+b;}
	
	// 생성자 : 객체 생성하는데에 실행하는 메소드
	// 		 : 생성자 이름은 클래스 이름과 동일해야함
	public A(int a) 
	{
		System.out.println("n1의 값을 초기화합니다.");
		this.n1 = a;
	}
}

// 상속(extends) : 부모(상위) 클래스 -> 자식(하위) 클래스
// 자식 클래스의 멤버 변수는 부모 클래스의 멤버 변수를 그대로 가진다
// 그러나 자식 클래스에서 부모 클래스의 private 멤버에대해 직접적인 접근은 불가능
// 그래서 메소드를 통해 접근 해야 한다.
class B extends A{
	// 멤버 변수
	private int n2;
	// B 클래스의 멤버 변수 : n1(상속받은 멤버 변수), n2
	
	// 멤버 함수
	public void set() {setN(10);} // 메소드를 통해 상속받은 멤버변수 n1에 대해 접근
	
	// 오버라이딩 : 부모 클래스 메소드명과 자식 클래스 메소드명이 똑같을 때
	// 			  자식 클래스 객체는 자식 클래스의 메소드를 실행, 부모 클래스 메소드 무시
	public void setN(int a) {this.n2 = a;}
	public int getN() {return this.n2;}
	
	
	// 생성자 : 부모 클래스의 생성자가 새롭게 재정의 되었다면
	// 		   자식 클래스의 생성자도 재정의해야 한다
	public B(int a, int b)
	{
		super(a);
		this.n2 = b;
	}
}



public class P1 {
	public static void main(String args[]) {
		// 객체 생성
		// 동일한 클래스 여러개의 객체 생성 가능
		A a = new A(1);
		System.out.println("a의 n1 값은 " + a.getN());
		A aa = new A(10);
		System.out.println("aa의 n1 값은 " + aa.getN());
	
		B b = new B(3,4);
		System.out.println("b의 n1 값은 " + b.getN());

		// 오버로딩 적용
		a.Sum();
		a.Sum(2,4);
		
		// 오버라이딩 적용
		System.out.println("a 객체의 n1 값: " + a.getN());
		System.out.println("b 객체의 n2 값: " + b.getN());
	}
}
