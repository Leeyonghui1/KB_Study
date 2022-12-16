package test3;

public class T3Solution {

	public static void main(String[] args) {
		// 생성자 재정의로 인한 오류 발생
		// 공백 생성자 다시 적어서 오류 제거
		CircleSolution c1 = new CircleSolution();
		c1.setR(3);
		System.out.println(c1.getArea());
		System.out.println(c1.getRound());
		
		CircleSolution c2 = new CircleSolution();
		c1.setR(-3);
		System.out.println(c2.getArea());
		System.out.println(c2.getRound());
		if(c2.getArea() != 0)
		{
			System.out.println(c2.getArea());
		}
		else
		{
			System.out.println("c2 반지름 확인필요");
		}
		
		// 매개변수가 있는 생성자를 통한 객체생성
		CircleSolution m1 = new CircleSolution(4);
		if(m1.getArea() != 0)
			System.out.println(m1.getArea());
		System.out.println(new CircleSolution(5).getArea());
	}
}
