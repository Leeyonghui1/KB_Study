package practice1;

public class T2 {

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		
		System.out.println("c1의 넓이 : "+c1.getArea());
		System.out.println("c2의 넓이 : "+c2.getArea());
		
		// 클래스 생성시 static으로 설정한 뒤 접근할려면
		// 객체명을 통해 접근하는게 아닌
		// 클래스명을 통해 접근해야 노란경고가 발생하지 않는다
		// c1.setPI() ===> Circle.setPI()
		//c1.setPI(5.3);
		//c2.setPI(10.0);
		Circle.setPI(10.0);
		
		//System.out.println("c1의 PI : "+c1.getPI());
		//System.out.println("c2의 PI : "+c2.getPI());
		System.out.println("c1의 PI : "+Circle.getPI());
		System.out.println("c2의 PI : "+Circle.getPI());
		System.out.println("c1의 넓이 : "+c1.getArea());
		System.out.println("c2의 넓이 : "+c2.getArea());
		

	}

}
