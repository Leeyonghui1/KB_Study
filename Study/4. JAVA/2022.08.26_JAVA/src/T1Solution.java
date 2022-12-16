// JAVA에서는 다중 상속을 지원하지 않음
// 추상 클래스를 사용할 때는 예외로 이중 상속 가능

// 추상 클래스나 추상 메소드 만들때에는 'abstract' 키워드 사용
abstract class Phones{
	// 추상 메소드 3개 만들기
	// 추상 메소드 선언은 함수 원형만 선언하고 정의를 하지 않는다.
	abstract public String getNum();
	abstract public String getName();
	abstract public void print();
}

// 추상 클래스만으로 객체 생성 불가
// 반드시 다른 클래스가 추상 클래스로부터 상속 받아야 객체 생성 가능
class CellPhones extends Phones{
	private String num;
	private String name;
	
	public CellPhones(String n, String na)
	{
		this.num = n;
		this.name = na;
	}
	
	// 추상 메소드 정의 및 구현(오버라이딩)
	public String getNum() {return this.num;}
	public String getName() {return this.name;}
	public void print()
	{
		// 해당 객체의 멤버 변수 정보 출력하기
		System.out.println("CellPhones 정보");
		System.out.println("번호: " + this.num);
		System.out.println("휴대폰 이름: " + this.name);
	}
}

// 이중 상속 ( Phones(추상) -> CellPhones -> SmartPhones )
class SmartPhones extends CellPhones{
	private String androidver;
	private String account;
	// 멤버 변수 : num, name, androidver, account
	
	public SmartPhones(String n, String na, String v, String ac)
	{
		super(n,na);
		this.androidver = v;
		this.account = ac;
	}
	
	public void print()
	{
		// CellPhones에 있는 print() 오버라이딩
		// SmartPhones 클래스 통해 만들어진 객체는 이 함수를 실행
		System.out.println("SmartPhones 정보");
		System.out.println("번호: " + this.getNum());
		System.out.println("이름: " + this.getName());
		System.out.println("안드로이드버전: " + this.androidver);
		System.out.println("계정: " + this.account);
	}
}

public class T1Solution {
	public static void main(String args[]) {
		// 객체 생성
		CellPhones p = new CellPhones("010-777-1111","초콜릿");
		SmartPhones sp = new SmartPhones("010-3333-9999","S20+","13","배고파요");
		
		// print() 이용하여 각 객체의 멤버 변수 정보 출력
		p.print();
		System.out.println();
		sp.print();
	}

}
