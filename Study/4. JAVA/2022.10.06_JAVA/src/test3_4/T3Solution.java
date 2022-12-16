package test3_4;

import java.util.ArrayList;

public class T3Solution {

	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		// 다형성 활용
		// 왼쪽(부모), 오른쪽(new 자식)
		Animal a1 = new Dog();
		Animal c2 = new Cat();
		
		// 다형성 응용
		// 부모클래스 타입 배열 or ArrayList에
		// 자식클래스 타입 객체들이 들어감
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
