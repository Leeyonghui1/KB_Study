import java.util.Scanner;
import java.util.Arrays;
public class BTest2 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] number= new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			number[i] = s.nextInt();
		}
		
		s.close();
		Arrays.sort(number);
		System.out.print(number[0] + " " + number[n-1]);
	}
}
