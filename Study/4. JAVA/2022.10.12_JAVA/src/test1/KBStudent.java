package test1;

public class KBStudent {
	private String Name;
	private String gender;
	private int Age;
	private int Number;
	
	// getter&setter
	public String getName() {return Name;}
	public void setName(String name) {Name = name;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public int getAge() {return Age;}
	public void setAge(int age) {Age = age;}
	public int getNumber() {return Number;}
	public void setNumber(int number) {Number = number;}
	
	// ������
	public KBStudent(String name, String gender, int age, int number) {
		this.Name = name;
		this.gender = gender;
		this.Age = age;
		this.Number = number;
	}
	
	@Override
	public String toString() {
		return "�̸� : "+Name+", ���� : "+gender+", ���� : "+Age+", ��ȣ : "+Number;
	}
	
	@Override
	public boolean equals(Object obj) {
		KBStudent s = (KBStudent)obj;
		return s.getNumber() == this.Number;
	}
	
}
