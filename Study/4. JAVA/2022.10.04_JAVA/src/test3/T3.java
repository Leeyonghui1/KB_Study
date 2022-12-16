package test3;

public class T3 {

	public static void main(String[] args) {
		Circle a = new Circle();
		a.setR(0);
		a.setR(3);
		System.out.println(a.getArea());
		System.out.println(a.getRound());
		System.out.println(String.format("%.3f", a.getArea()));
		System.out.println(String.format("%.3f", a.getRound()));

	}

}
