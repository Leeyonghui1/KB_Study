package my.hello.javastudy;
import java.util.*;

public class P1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		// �ζ� ���α׷�
		// 6�� ��ȣ�� ���ʽ� ��ȣ ���
		// 1. ��÷ ��ȣ�� �� �� �̾Ƴ��� �Է¹ޱ�
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		if(count < 1 || count > 5)
		{
			System.out.println(count+"Ƚ���� �߸��� ��!");
			s.close();
			return;
		}
		// ���� �õ��� �ζ� Ƚ��
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
			// 2. ��÷ ��ȣ�� �̾Ƴ��� �ȴ�.
			System.out.print((i+1)+"��° ��ȣ");
			System.out.print(Arrays.toString(lotto));
			System.out.println(" ���ʽ� ��ȣ : " + bns);
		}		
		s.close();
	}
}
