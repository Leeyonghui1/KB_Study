package test3_4;

import java.util.ArrayList;

public class T4 {

	public static void main(String[] args) {
		ArrayList<Animal> animalHospital = new ArrayList<Animal>();
		
		Animal a = new Animal();
		a.setAge(1);
		a.setName("돼지");
		
		Dog d = new Dog();
		d.setAge(2);
		d.setName("치와와");
		d.setHairColor("빨간색");
		
		Cat c = new Cat();
		c.setAge(3);
		c.setName("페르시안");
		c.setEyeColor("스카이블루");
		
		animalHospital.add(a);
		animalHospital.add(d);
		animalHospital.add(c);
		
		animalHospital.get(0).Sleep();
		animalHospital.get(1).Sleep();
		((Dog)animalHospital.get(1)).bark();
		animalHospital.get(2).Sleep();
		((Cat)animalHospital.get(2)).meow();
		
	}
}
