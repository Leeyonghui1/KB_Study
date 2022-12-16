package test1Sol;

import java.util.ArrayList;
import java.util.List;

public class T1Solution {

	public static void main(String[] args) {
		Pikachu p = new Pikachu("����");
		Bulbasaur b = new Bulbasaur();
		Squirtle s = new Squirtle();
		
		Animalable d = new Animalable() {
			@Override
			public void charming() {
				System.out.println("�۸� ¢�´�.");
			}
		};
		
		Plantable myp = new Plantable() {
			@Override
			public void grow() {
				System.out.println("LG Ʒ���迡�� �ڶ�� �� ��");
			}
		};
		
		
		Pokemonable g = new Pokemonable() {

			@Override
			public void charming() {
				System.out.println("��������");
			}

			@Override
			public void grow() {
				System.out.println("�ٴټӿ��� �ڶ���.");
			}

			@Override
			public void fight() {
				 System.out.println("�źϰź� ��Death");
			}
		};
		
		// ArrayList�� List��� �������̽��� ��ӹ��� Ŭ����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> ns = new ArrayList<Integer>();
		
		
		// try catch ���� - java,c#���� ���� ���
		// try�� ������ �κ��� ������ ���� catch�κ����� �Ѿ��
		// ���α׷��� ������� �ʴ´�.
		// try catch ���ѻ��¿��� �������� �״�� ����
		try {
			// ���� ���� �̽��� �ذ��� ���� - Clonable��� �������̽�
			Pikachu pipi = (Pikachu)p.clone();
			pipi.setName("����׶���");
			// p�� �̸��� �������� ����
			// �ٵ� pipi �̸��� ����׶��̷� �ٲٴ� p�� �ٲ�
			// ->> pipi�� p�� �Ȱ��� ��ġ�� �����ϱ� ����(��������)
			System.out.println(p.getName());
			System.out.println(pipi.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// Plantable�� grow�� �������̵��Ѱ�
		// ȭ��ǥ���·� �ٿ������� :: ����(lambda)
		// ���ٴ� �ϳ��� �޼ҵ常 �����Ҷ��� ����
		Plantable myFlower = () -> {
			System.out.println("�������� �ڳ����");
		};
		myFlower.grow();
	}
}