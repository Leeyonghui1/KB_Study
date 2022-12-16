import java.util.*;
public class BTest4 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String st = s.next();
		//char ch[] = st.toCharArray();
		
		for(int i = 0 ; i < st.length() ; i++)
		{
			// charAt() : 값 참조는 가능하지만 값 변경은 불가능
			if(st.charAt(i) >= 'A' && st.charAt(i) <= 'Z')
			{
				System.out.print((char)(st.charAt(i)+32));
			}
			else if(st.charAt(i) >= 'a' && st.charAt(i) <= 'z')
			{
				System.out.print((char)(st.charAt(i)-32));
			}
		}
	}

}
