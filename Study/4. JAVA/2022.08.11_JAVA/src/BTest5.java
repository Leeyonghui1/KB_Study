import java.util.*;
public class BTest5 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// st와 ch의 값은 공유가 되지 않는다.
		// 단지, st의 값을 ch가 복사해서 가지고있음
		String st = s.next();
		char ch[] = st.toCharArray();
		
		int cnt = 0;  // 모음 개수 저장할 변수
		for(int i = 0 ; i < st.length() ; i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
