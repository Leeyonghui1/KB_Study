import java.util.Scanner;
public class Btest11 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[9];
		int sum = 0;
		int i = 0;
		int j = 0;
		int fake1 = 0;
		int fake2 = 0;
		for(i = 0 ; i < 9 ; i++)
		{
			num[i] = sc.nextInt();
			sum += num[i];
		}
		int aim = sum - 100;
		for(i = 0 ; i < 9 ; i++)
		{
			for(j = i+1 ; j < 9 ; j++)
			{
				int a = num[i] + num[j];
				if(a == aim)
				{
					fake1 = i;
					fake2 = j;
				}
				else
					continue;
			}
		}
		for(i = 0 ; i < 9 ; i++)
		{
			if(i == fake1 || i == fake2)
				continue;
			else
				System.out.println(num[i]);
		}
	}
}
