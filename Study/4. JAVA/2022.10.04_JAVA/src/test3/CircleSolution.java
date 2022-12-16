package test3;

public class CircleSolution {
	private int r;
	private final double pi = 3.14;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		if(r<=0)
			this.r = 0;
		else
			this.r = r;
	}
	
	public double getArea() 
	{
		if(r<=0)
		{
			System.out.println("반지름 값 확인필요");
			return 0;
		}
		return r*r*pi;
	}		
	public double getRound() 
	{
		if(r<=0)
		{
			System.out.println("반지름 값 확인필요");
			return 0;
		}
		return 2*r*pi;
	}

	// 생성자
	// 기본 형태 :: 아래와 같이 아무것도 수행하지 않는 코드
	// public CircleSolution(){}
	// 생성자 :: 리턴값 없는 함수
	// 생성자는 글자그대로 생성할 때 호출하므로
	// 변수를 선엄함과 동시에 속성값도 바로 세팅할 수 있음
	public CircleSolution(int r) {
		setR(r);
	}
	// 문제점 :: 생성자를 명시적으로 적게되면 기존에 있던 공백 생성자는 지워짐
	//		      그래서 생성자를 재정의하면 생성한 객체를 수정해야 함
	
	// 하지만 공백형태 기본 생성자를 다시 적어주면 다시 생성가능
	public CircleSolution() {
		
	}
	
	// 오버로딩
	// 생성자나 함수(=메소드) 만들 때
	// 이름은 똑같으나 매개변수의 개수나 타입이 다른 경우 서로 다른 함수로 인식
}
