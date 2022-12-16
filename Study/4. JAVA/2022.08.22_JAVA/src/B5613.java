import java.util.*;
public class B5613 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		char c;
		do {
			c = s.next().charAt(0);
			if(c=='=')
				break;
			int b = s.nextInt();
			switch(c) {
			case '+' : a += b; break;
			case '-' : a -= b; break;
			case '/' : a /= b; break;
			case '*' : a *= b; break;
			}
		}while(true);
		System.out.println(a);
		s.close();
	}
}
