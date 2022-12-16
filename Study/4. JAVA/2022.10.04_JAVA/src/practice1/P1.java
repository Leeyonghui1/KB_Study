package practice1;

public class P1 {

	public static void main(String[] args) {
		// class를 이용해서 변수를 선언할 땐
		// 반드시 new 키워드가 필요
		// why? 사용자 정의 자료형은 일반적인 자료형이 아님
		// 그래서 메모리를 따로 할당해줘야함
		// new 키워드 :: 메모리 할당 키워드 (=C언어 malloc)
		// new 뒤 클래스명()의 의미
		// 메모리를 할당하기는 하는데 어느만큼, 어떤 형태로 할당할지 정해주는것
		
		// 요약
		// 사용자 정의 class, 몇몇 자바에서 만든 class는
		// new 키워드와 클래스명을 이용해서 선언해야 함
		// 클래스명 변수명 = new 클래스명();
		// 클래스 이용해서 선언한 변수나 클래스 자체를
		// 객체(Object)라고 부름
		Customer c1 = new Customer();
		c1.name = "이용희";
		c1.age = 30;
		c1.cNum = "00001";
		/*
		Customer c2;
		c2.name = "이동준";
		c2.age = 33;
		c2.cNum = "00000";
		*/
		
		/*
		KBCustomer kb1 = new KBCustomer();
		kb1.age = 100;
		*/
		
		KBCustomer k1 = new KBCustomer();
		k1.setAge(34);
		k1.setName("이동준");
		k1.setcNum("00000");
		
		System.out.println(k1.getAge());
		System.out.println(k1.getName());
		System.out.println(k1.getcNum());
	}

}
