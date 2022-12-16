package test5Solution_10_05;

public class Circle {
		private int r;
		private static double PI;
	
		public static double getPI() {return PI;}
		public static void setPI(double pI) {PI = pI;}
		public int getR() {return r;}
		public void setR(int r) {this.r = r;}
		
		public Circle(int r) {
			this.r = r;
			PI = 3.14;
		}
	
		public double getArea() {return r*r*PI;}

}
