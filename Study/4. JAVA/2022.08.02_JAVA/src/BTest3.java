import java.util.Scanner;
public class BTest3 {
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		int number[] = new int[6];
		for(int i = 0 ; i < 6 ; i++)
		{
			number[i] = s.nextInt();
		}
		for(int i = 0 ; i < 4 ; i++)
		{
			for(int j = 0 ; j < 3 ; j++)
			{
				if(number[j] > number[j+1])
				{
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		for(int i = 0 ; i < 2;i++)
		{
			for(int j = 4;j<5;j++)
			{
				if(number[j] > number[j+1])
				{
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
				}
			}
		}
		System.out.println(number[1]+number[2]+number[3]+number[5]);
	}
}
