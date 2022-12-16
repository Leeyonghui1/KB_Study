import java.util.*;
public class B2153 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int alpha[] = new int[26];
		int alpha2[] = new int[26];
		int check[] = new int[26];
		int check2[] = new int[26];
		
		for(int i = 0 ; i < 26 ; i++)
		{
			alpha[i] = i+1;
			alpha2[i] = i+27;
		}
	
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
				check[str.charAt(i) - 'a']++;
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
				check2[str.charAt(i) - 'A']++;
		}
		
		int sum = 0;
		for(int i = 0 ; i < 26 ; i++)
		{
			if(check[i] >= 1)
			{
				sum += check[i] * alpha[i];
			}
			if(check2[i] >= 1)
			{
				sum += check2[i] * alpha2[i];
			}
		}
		
		int checkpoint = 1;
		for(int i = 2 ; i < sum ; i++)
		{
			if((sum % i) == 0)
				checkpoint = 0;
		}
		
		if(checkpoint == 1)
			System.out.println("It is a prime word.");
		if(checkpoint == 0)
			System.out.println("It is not a prime word.");
		s.close();
	}
}
