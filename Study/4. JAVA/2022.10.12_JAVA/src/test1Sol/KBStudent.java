package test1Sol;
// Comparable :: �񱳿� ���Ǵ� �������̽�
public class KBStudent implements Comparable<KBStudent>{
	private String name;
	private String gender;
	private int age;
	private int number;
	
	public KBStudent(String name, String gender, int age, int number) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.number = number;
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getGender() {return gender;}
	public void setGender(String gender) {this.gender = gender;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public int getNumber() {return number;}
	public void setNumber(int number) {this.number = number;}
	

	// ��¿�
	@Override
	public String toString() {
		return String.format("�̸�:%s, ����:%s, ����%d, ��ȣ:%d",this.name,this.gender,this.age,this.number);
	}
	
	// �ߺ�üũ��
	@Override
	public boolean equals(Object obj) {
		/*
		 KBStudent k = (KBStudent)obj;
		 return k.getNumber() == number;
		*/
		return ((KBStudent)obj).getNumber() == this.number;
	}

	// ���Ŀ�
	@Override
	public int compareTo(KBStudent o) {
		return this.age - o.getAge(); // �������� ���Ŀ� ����
	}
	
}