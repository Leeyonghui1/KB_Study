package my.hello.javastudy;
import java.util.*;

public class P1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// 로또 프로그램
		// 6개 번호랑 보너스 번호 출력
		// 1. 당첨 번호를 몇 번 뽑아낼지 입력받기
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		if(count < 1 || count > 5)
		{
			System.out.println(count+"횟수는 잘못된 값!");
			s.close();
			return;
		}
		// 내가 시도할 로또 횟수
		for(int i = 0 ; i < count ; i++)
		{
			int[] lotto = new int[6];//[0,0,0,0,0,0]

			//boolean isDuplicate = false;
			for(int j = 0 ; j < lotto.length ; j++)
			{
				int num = (int)(Math.random()*45)+1;
				boolean isDuplicate = false;
				for(int k = 0 ; k < j ; k++)
				{
					if(lotto[k] == num)
					{
						isDuplicate = true;
						j--;
						break;
					}
				}
				if(!isDuplicate)
					lotto[j] = num;
			}
			int bns = (int)(Math.random()*45)+1;
			for(int j = 0 ; j < lotto.length ; j++)
			{
				if(bns == lotto[j])
				{
					bns = (int)(Math.random()*45)+1;
					j = -1;
				}
			}
			Arrays.sort(lotto);
			// 2. 당첨 번호를 뽑아내면 된다.
			System.out.print((i+1)+"번째 번호");
			System.out.print(Arrays.toString(lotto));
			System.out.println(" 보너스 번호 : " + bns);
		}		
		s.close();
	}
}
