/*
 # 추상 클래스 :: 구체적으로 정의되지 않은 클래스
 	* 추상 클래스를 통해서 정상적으로 객체 생성 불가
 	* 추상 메소드 하나라도 포함하고 있어야함(?)
 	* 즉, 추상 클래스는 반드시 상속받아져서 구체화 필요
 	* 추상 클래스는 상속을 주는 부모 클래스
 # 추상 메소드 :: 구체적으로 정의 되지 않은 메소드
*/


// 추상 클래스
abstract class Person{
	// 추상 클래스로 만들기 위해서는, abstract 키워드 필요
	// 추상 메소드 또한 abstract 키워드 필요
	abstract public void printName();
	abstract public void print();
}

// 추상 클래스(Person) 구체화
class Me extends Person{
	// 추상 클래스 상속받았을 때 추상 메소드를 구체화 하지 않으면 오류발생
	// 메소드 구체화 : 중괄호{}열어서 명령문 작성
	
	private String name;
	
	public Me(String n) {this.name = n;}
	/*
	   # 추상 메소드를 구체화할 때
	 	 * 추상 클래스에 존재하는 모든 추상 메소드를 초기화해야함
	     * 추상 메소드의 타입, 메소드명, 매개변수를 똑같이 적어야함
	*/
	public void printName()
	{
		// 추상 메소드 printName()을 구체화
		System.out.println("이름: " + this.name);
	}
	public void print()
	{
		System.out.println("화이팅");
	}
}


public class P2 {
	public static void main(String args[]) {
		// 추상 클래스에 대한 객체 생성 불가
		// 오류발생 : Person p = new Person();
		Me m = new Me("이용희");
		m.printName();
		m.print();
	}
}
