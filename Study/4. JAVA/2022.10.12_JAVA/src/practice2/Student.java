package practice2;

public class Student {
	private String Name;
	private int age;
	
	public Student(String name, int age) {
		this.Name = name;
		this.age = age;
	}

	public String getName() {return Name;}
	public void setName(String name) {Name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	// Object Ŭ������ toString �޼ҵ� �������̵�
	@Override
	public String toString() {
		return "�̸�:"+this.Name+", ����:"+this.age;
	}
	
}
