package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T1Solution2 {

	public static void main(String[] args) {
		// �迭 : ũ�Ⱑ �����ǰ� Ư�� �ε����� �� ����
		// ArrayList : ũ�Ⱑ �����Ǿ� ���� ����
		// ��� ���� �̹� �� �κп� ���ؼ� �� ��������
		// Ư�� �κ� �������� -> ArrayList ���� ����
		
		// ArrayList ǥ���
		// 1)
		//ArrayList<Integer> numbers = new ArrayList<Integer>();
		// 2) 2�� ǥ����� �������̶� �������̽� ���� �ʿ�
		List<Integer> nums = new ArrayList<Integer>();

		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++)
		{
			System.out.println(i+1+"��° ���� �Է��ϱ�");
			nums.add(s.nextInt());
		}
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
		// �Է��� ���� �̸��� ���ڸ� ArrayList���� �����ϱ�
		// ���� ������ ���� �� for���� ���
		System.out.println("�� �̸��� ���ڸ� ������?");
		int cutline = s.nextInt();
		for(int i = nums.size()-1 ; i >= 0 ; i--)
		{
			if(cutline > nums.get(i))
				nums.remove(i);
		}
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
	
		s.close();
	}

}
