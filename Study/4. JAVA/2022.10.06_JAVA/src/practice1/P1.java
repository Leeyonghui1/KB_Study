package practice1;

import test5Solution_10_05.Sphere;

public class P1 {

	public static void main(String[] args) {
		Person p = new Person();
		// 디폴트 접근제한자 사용
		p.name = "김보규";
		p.age = 5;
		p.sNum = "2012";
		
		Globe g1 = new Globe(10);
		g1.rollTheGlobe("파란색");
		g1.setColor("녹색");
		System.out.println(g1.getColor());
		// g1.Color = "녹색";  :: 오류발생
		// g1.spin(); :: 오류발생
		
		Sphere s1 = new Sphere(5);
		s1.getArea();
		// s1.spin();   :: 오류발생
		// s1.Color="red"; :: 오류발생
		
		// Color, spin은 protected
		// Sphere를 상속한 클래스이거나
		// Sphere와 같은 폴더(패키지)에 있는 클래스에서만 접근 가능
		
	}

}
