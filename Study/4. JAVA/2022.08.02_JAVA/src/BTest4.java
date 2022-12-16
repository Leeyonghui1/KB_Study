import java.util.Scanner;
public class BTest4 {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		for(int i = 0 ; i < a.length();i++)
		{
			char c = a.charAt(i);
			if(Character.isUpperCase(c))
			{
				System.out.print(String.valueOf(c).toLowerCase());
			}
			else
			{
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}
	}
}
