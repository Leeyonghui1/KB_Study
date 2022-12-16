import java.util.*;
public class B2675 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int i = 0 ; i < T ; i++)
		{
			int R = s.nextInt();
			String S = s.next();
			char[] arr = S.toCharArray();
			for(int j = 0 ; j < arr.length ; j++)
			{
				for(int k = 1 ; k <= R ; k++)
				{
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
		s.close();
	}
}