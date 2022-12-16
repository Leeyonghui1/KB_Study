import java.util.*;

public class B2480 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int max = 0;
		for(int i = 0 ; i < 3 ; i++)
		{
			if(a > b && a > c)
				max = a;
			else if (b > a && b > c)
				max = b;
			else
				max = c;
		}
		if (a == b && b == c)
			System.out.print(10000 + (a * 1000));
		else if (a == b && a != c)
			System.out.print(1000 + (a * 100));
		else if (a != b && a == c)
			System.out.print(1000 + (a * 100));
		else if (b != a && b == c)
			System.out.print(1000 + (b * 100));
		else if (a != b && b != c && c != a)
			System.out.print(max * 100);
		
		s.close();
	}
}
