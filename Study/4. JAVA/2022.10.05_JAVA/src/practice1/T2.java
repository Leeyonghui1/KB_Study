package practice1;

public class T2 {

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		
		System.out.println("c1�� ���� : "+c1.getArea());
		System.out.println("c2�� ���� : "+c2.getArea());
		
		// Ŭ���� ������ static���� ������ �� �����ҷ���
		// ��ü���� ���� �����ϴ°� �ƴ�
		// Ŭ�������� ���� �����ؾ� ������ �߻����� �ʴ´�
		// c1.setPI() ===> Circle.setPI()
		//c1.setPI(5.3);
		//c2.setPI(10.0);
		Circle.setPI(10.0);
		
		//System.out.println("c1�� PI : "+c1.getPI());
		//System.out.println("c2�� PI : "+c2.getPI());
		System.out.println("c1�� PI : "+Circle.getPI());
		System.out.println("c2�� PI : "+Circle.getPI());
		System.out.println("c1�� ���� : "+c1.getArea());
		System.out.println("c2�� ���� : "+c2.getArea());
		

	}

}
