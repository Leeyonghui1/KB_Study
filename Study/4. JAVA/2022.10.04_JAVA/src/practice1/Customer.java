package practice1;

// 하나의 변수 안에 한 고객의 모든 정보를 집어 넣고 싶다면
// C에서는 구조체와 같은 사용자 정의 타입을 만들고
// 자바스크립트에서는 객체 혹은 class 혹은 functinon 이용해서
// 종합적인 타입의 변수를 만들고
// C# , Java, C++ 에서는 class를 만들어서 사용


public class Customer {
	// 이름, 나이, 고객번호
	String name;
	int age;
	String cNum;
	
	// 생성자
	Customer(){
		System.out.println("고객 1명 생성");
	}
}
