package practice2;

// 인터페이스 생성시 [인터페이스명+able]로 설정
// 인터페이스
// :: 특정한 기능을 구현하라고 '명시적'으로 알려주는것 (추상클래스는 간접적으로)
// 1) 특정 기능을 구현하도록 명시적으로 강제
// 2) 다중 상속이 가능해짐
// 3) 인터페이스끼리 상속도 가능
public interface Animalable {
	// 생성자 생성 불가
	// 접근제어자 public, static, final만 허용
	// 그리고 무조건 변수값 초기화해줘야함
	// 인터페이스 내에서 getter,setter 생성불가 
	// --> 인터페이스 내에서 메소드는 자동적으로 abstract메소드
	// --> 따라서 메소드 선언만 가능하고 정의불가, 그래서 getter&setter 생성불가
	int a = 1;
	final String name = "최종";
	
	static int A() {return a;}
	public void Move();
	public void Run();
	public void Charming();
}
