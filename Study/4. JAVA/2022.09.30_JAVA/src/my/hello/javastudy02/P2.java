package my.hello.javastudy02;

import java.util.ArrayList;

public class P2 {

	public static void main(String[] args) {
		//�迭
		// ����� ���ÿ� ũ�Ⱑ ������
		int[] numbers = new int[5];
		// ArraryList
		// �迭���� �ٸ��� ���� ��ÿ� ũ�Ⱑ 0
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// ���� �Ҵ�(�迭)
		numbers[0] = 10;
		numbers[1] = 30;
		// ���� �б�(�迭)
		System.out.println("ù��°��:"+numbers[0]);
		
		// ���� �߰�(ArrayList)
		nums.add(10);
		// js�� pushó�� ���ο� ���� �߰� , ������ ��ġ�� �����ؼ� ���� �߰������� ����
		nums.add(30);
		
		// Ư�� ��ġ�� ���� ����(ArrayList)
		nums.set(0, 20); // ù��° ���� 20���� ����
		System.out.println(nums.get(0));
		
		// foreach ���� ctrl+space�� ����� �ڵ�
		// �迭�� ���̸�ŭ �ݺ��� ����
		// �ݷ�(:) �տ� �ִ� �� �迭 �ȿ� �ִ� ������ҵ�
		for (Integer integer : numbers) {
			System.out.println(integer);
		}
		
		// ArrayList �� ���� ������ �� ����
		nums.remove(0);
		nums.add(100);
		nums.add(30);
		nums.add(30);
		nums.remove((Integer)30); // ���� 30�� ���� 1�� ����
		System.out.println("----");
		for (Integer integer : nums) {
			System.out.println(integer);
		}
	}

}
