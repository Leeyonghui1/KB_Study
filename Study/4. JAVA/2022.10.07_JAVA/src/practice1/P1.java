package practice1;

import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
		
		// �߻�Ŭ����Ÿ������ �ν��Ͻ� ���� �Ұ�
		// Food f = new Food();  :: ����
		
		Food f = new Taco();
		Ramen r = new Ramen();
		Bibimbab b = new Bibimbab();
		
		f.eat();
		r.eat();
		b.eat();
		System.out.println("--------------");
		
		ArrayList<Food> foods = new ArrayList<Food>();
		foods.add(f);
		foods.add(r);
		foods.add(b);
		// foods�� �ִ� ���ĵ� ��� eat ȣ�Ⱑ��
		// eat�� ���� �ٸ��� ����
		for (Food food : foods) {
			food.eat();
		}
		
		
		// �͸�Ŭ���� :: �̸��� �ƿ����� Ŭ����
		// temp������ ���̴� Ŭ����
		Food temp = new Food() {
			public void eat() {
				System.out.println("�⵵�ϰ� �Դ´�");
			}
		};
		temp.setName("��ȸ�Ĵ��");
		foods.add(temp);
		
		foods.add(new Food() {
			@Override
			public void eat() {
				System.out.println("�����ϰ� �Դ´�");
			}
		});
		
		
	}
}
