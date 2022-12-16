package test3_4;

import java.util.ArrayList;

public class T4Solution {

	public static void main(String[] args) {
		ArrayList<Animal> animalHospital = new ArrayList<Animal>();
		
		Animal a1 = new Animal();
		Animal a2 = new Dog();
		Cat a3 = new Cat();
		
		if(a2 instanceof Dog)
		{
			((Dog)a2).setHairColor("Èò»ö");
		}
		a3.setEyeColor("È£¹Ú»ö");
		
		animalHospital.add(a1);
		animalHospital.add(a2);
		animalHospital.add(a3);
		
		
		for (Animal animal : animalHospital) {
			animal.Sleep();
			if(animal instanceof Dog)
				((Dog)animal).bark();
			else if(animal instanceof Cat)
				((Cat)animal).meow();
			System.out.println("-------------");
		}

	}

}
