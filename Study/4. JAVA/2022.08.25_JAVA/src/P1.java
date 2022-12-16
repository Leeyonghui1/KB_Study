// 상속 개념, 상속 적용 + super(), 오버라이딩

// 부모 클래스
class Phone{
	// 멤버 : 휴대폰 기종 이름, 번호
	private String name;
	private String num;
	
	// 생성자에는 어떤 명령문이라도 쓸 수는 있지만,
	// 주로 변수 초기화를 많이 쓴다.
	// 생성자
	public Phone(String na, String nu)
	{
		this.name = na;
		this.num = nu;
	}
	
	// 메소드
	public void print()
	{
		System.out.println("클래스 Phone의 메소드 print() 실행");
		System.out.println("휴대폰 정보");
		System.out.println("기종: " + this.name);
		System.out.println("번호: " + this.num);
	}
	public String getName() {return this.name;}
	public String getNum() {return this.num;}
}

// 자식 클래스
class SmartPhone extends Phone{
	// 멤버 : {상속 멤버 : 휴대폰 기종 이름, 번호}, 현재 버전, 연동계정 
	private String androidver;
	private String account;
	
	// 부모 클래스의 생성자가 재정의되었다면
	// 자식 클래스 생성자도 재정의가 필요( super() 함수 이용 )
	// 생성자
	public SmartPhone(String na, String nu, String ac)
	{
		super(na,nu); 
		this.androidver = "Android.13";
		this.account = ac;
	}
	
	// 메소드
	public void print()
	{
		System.out.println("클래스 SmartPhone의 메소드 print() 실행");
		System.out.println("휴대폰 정보");
		System.out.println("기종: " + this.getName());
		System.out.println("번호: " + this.getNum());
		System.out.println("현재 버전: " + this.androidver);
		System.out.println("연동 계정: " + this.account);
	}
}


public class P1 {
	public static void main(String args[]) {
		// 객체 생성
		Phone p = new Phone("엣지","010-111-2222");
		SmartPhone sp = new SmartPhone("아이폰","010-3333-5555","띠용이");
		
		p.print();
		// 오버라이딩
		// 부모 클래스의 메소드 이름과 자식 클래스의 메소드 이름이 똑같을때
		// 자식 클래스의 객체는 자식 클래스의 메소드를 실행하고 부모 클래스의 메소드는 실행 X
		System.out.println();
		sp.print();
	}
}
