package test3_4;

import java.util.ArrayList;

public class T3Solution {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		// ������ Ȱ��
		// ����(�θ�), ������(new �ڽ�)
		Animal a1 = new Dog();
		Animal c2 = new Cat();
		
		// ������ ����
		// �θ�Ŭ���� Ÿ�� �迭 or ArrayList��
		// �ڽ�Ŭ���� Ÿ�� ��ü���� ��
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		zoo.add(a);
		zoo.add(d);
		zoo.add(c);
		zoo.add(a1);
		zoo.add(c2);
		zoo.add(new Animal());
		zoo.add(new Dog());
		zoo.add(new Cat());
		
	}
}
