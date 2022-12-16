package test1;

public class T1 {

	public static void main(String[] args) {
		Square sq = new Square();
		sq.setWh(10);
		System.out.println("wh°ª : "+sq.getWh());

		Rectangle r1 = new Rectangle();
		r1.setW(3);
		r1.setH(3);
		System.out.println("r1ÀÇ ³ÐÀÌ´Â :"+r1.getArea(r1.getW(), r1.getH()));
		
		Rectangle r2 = new Rectangle(r1.getH());
		r2.setH(0);
		r2.setW(3);
		System.out.println("r2ÀÇ ³ÐÀÌ´Â :"+r2.getArea(r2.getW(), r2.getH()));
		
		Rectangle r3 = new Rectangle(r2.getH(),r2.getW());
		r3.setW(10);
		r3.setH(5);
		System.out.println("r3ÀÇ ³ÐÀÌ´Â :"+r3.getArea(r3.getW(), r3.getH()));
		
	}
}
