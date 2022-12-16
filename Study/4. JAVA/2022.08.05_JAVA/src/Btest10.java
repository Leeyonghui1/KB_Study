import java.util.Scanner;
public class Btest10 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num[] = new int[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			num[i] = s.nextInt();
		}
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n-1 ; j++)
			{
				if(num[j] > num[j+1])
				{
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
			
		}
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(num[i]);			
		}
	}
}

