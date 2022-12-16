import java.util.*;

class Point{
	private int x;
	private int y;
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void print()
	{
		System.out.println("위치 정보");
		System.out.println("x: " + this.x);
		System.out.println("y: " + this.y);
	}
}

class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(int x, int y, String c)
	{
		super(x,y);
		this.color = c;
	}
	
	public void print()
	{
		System.out.println("색상 정보");
		System.out.println("색상: " + this.color);
	}
}


public class T1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
	
		System.out.print("x좌표값 입력: ");
		int x = s.nextInt();
		System.out.print("y좌표값 입력: ");
		int y = s.nextInt();
		System.out.print("색상 입력: ");
		String c = s.next();
		
		Point p1 = new Point(x,y);
		ColorPoint p2 = new ColorPoint(x,y,c);
		
		p1.print();
		p2.print();
	
		s.close();
	}
}
