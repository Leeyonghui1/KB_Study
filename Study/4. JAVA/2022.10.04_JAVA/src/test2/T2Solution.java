package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T2Solution {

	public static void main(String[] args) {
		// ArrayList Ȱ���� �ζ�
		// ��� �迭 ��Ÿ�Ϸ� �ڵ� �ۼ�
		Scanner s = new Scanner(System.in);
		System.out.println("�󸶳�ġ ��ǰ���?");
		int count = s.nextInt()/1000;
		if(count > 5 || count < 1)
		{
			System.out.println("�ݾ��� �߸��Ǿ����ϴ�.");
			s.close();
			return;
		}
		
		for(int i = 0 ; i < count ; i++)
		{
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			for(int j = 0 ; j < 6 ; j++)
			{
				int num = (int)(Math.random()*45)+1;
				boolean isDuplicate = false;
				for(int k = 0 ; k < j ; k++)
				{
					if(lotto.get(k) == num)
					{
						isDuplicate = true;
						j--;
						break;
					}
				}
				
				if(!isDuplicate)
					lotto.add(num);
			}
			int bns = (int)(Math.random()*45)+1;
			for(int j = 0 ; j < lotto.size() ; j++)
			{
				if(bns == lotto.get(j))
				{
					bns = (int)(Math.random()*45)+1;
					j = -1;
				}
			}
			Collections.sort(lotto);
			System.out.print(lotto.toString());
			System.out.println(" ���ʽ� : " + bns);
			lotto.clear(); // lotto �ȿ� �ִ� ���� ���� ����(=Remove)
		}
		s.close();
	}

}
