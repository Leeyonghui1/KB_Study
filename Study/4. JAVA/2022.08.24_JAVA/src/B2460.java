import java.util.*;
public class B2460 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int current = 0;
		int max = 0;
		for(int i = 0 ; i < 10 ; i++)
		{
			int out = s.nextInt();
			int in = s.nextInt();
			current = current - out + in;
			if(current > max)
				max = current;
		}
		System.out.println(max);
		s.close();
	}
}