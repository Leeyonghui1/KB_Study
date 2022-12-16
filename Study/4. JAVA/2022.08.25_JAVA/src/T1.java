abstract class Animal{
	abstract public String getName();
	abstract public String cry();
}

class Cat extends Animal{
	private String name;
	
	public Cat(String n) {this.name = n;}
	
	public String getName() {return this.name;}
	public String cry() {return "야오오옹";}
	public void print()
	{
		System.out.println("Cat 클래스 메소드 print() 실행");
		System.out.println("\"" + this.name + "\"" + "의 울음소리는 " + "\"" + this.cry() + "\"");
	}
}

class Dog extends Animal{
	private String name;
	
	public Dog(String n) {this.name = n;}
	
	public String getName() {return this.name;}
	public String cry() {return "월월월";}
	public void print()
	{
		System.out.println("Dog 클래스 메소드 print() 실행");
		System.out.println("\"" + this.getName() + "\"" + "의 울음소리는 " + "\"" + this.cry() + "\"");
	}
}

public class T1 {
	public static void main(String args[]) {
		Cat c = new Cat("고양이");
		Dog d = new Dog("강아지");
		
		c.print();
		d.print();
		System.out.println();
		System.out.println("\"" + c.getName() + "\"" + "의 울음소리는 " + "\"" + c.cry() + "\"");
		System.out.println("\"" + d.getName() + "\"" +  "의 울음소리는 " + "\"" + d.cry() + "\"");
	}
}
