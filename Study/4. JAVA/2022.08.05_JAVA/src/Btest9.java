import java.util.Scanner;
public class Btest9 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int  i = 0 ; i < t ; i++)
		{
			int a = s.nextInt();
			int b = s.nextInt();
			int sum = 1;
			for(int j = 1 ; j <= b ; j++)
			{
				sum = (sum * a) % 10;
			}
			if(sum == 0)
				System.out.println("10");
			else
				System.out.println(sum);
		
			
		}
	}
}
