package test3_4;

import java.util.ArrayList;

public class T4 {

	public static void main(String[] args) {
		ArrayList<Animal> animalHospital = new ArrayList<Animal>();
		
		Animal a = new Animal();
		a.setAge(1);
		a.setName("����");
		
		Dog d = new Dog();
		d.setAge(2);
		d.setName("ġ�Ϳ�");
		d.setHairColor("������");
		
		Cat c = new Cat();
		c.setAge(3);
		c.setName("�丣�þ�");
		c.setEyeColor("��ī�̺��");
		
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
