import java.util.Scanner;
public class Test {
	public static void main(String arg[])
	{
		Scanner s = new Scanner(System.in);
		
		//1번
		System.out.println("Q1)문자열 입력하세요");
		String a = s.nextLine();
		int alpha[] = new int[26];
		char arr[] = new char[1024];
		for(int i = 0 ; i < a.length() ; i++)
		{
			//System.out.println(a.charAt(i));
			arr[i] = a.charAt(i);
			if(arr[i] >= 'a' && arr[i] <= 'z')
			{
				alpha[arr[i] - 'a']++;
			}
		}
		for(int i = 0 ; i < 26 ; i++)
		{
			if(alpha[i] != 0)
			{
				System.out.println("'" + (char)('a'+i) + "'" + "는" + alpha[i] + "글자 입니다." );
			}
		}
		
		//2번
		System.out.println("Q2)문자열 입력하세요");
		String a2 = s.nextLine();
		int alpha2[] = new int[26];
		char arr2[] = new char[1024];
		for(int i = 0 ; i < a2.length() ; i++)
		{
			arr2[i] = a2.charAt(i);
			if(alpha2[arr2[i] - 'a'] == 0)
			{
				alpha2[arr2[i] - 'a'] = i+1;
			}
		}
		for(int i = 0 ; i < 26 ; i++)
		{
			if(alpha2[i] != 0)
			{
				System.out.println("'" + (char)('a'+i) + "'" + "는" + alpha2[i] + "번째에서 처음 등장합니다.");				
			}
		}
		
	}
}
