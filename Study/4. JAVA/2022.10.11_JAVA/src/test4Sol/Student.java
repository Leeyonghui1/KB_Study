package test4Sol;

public class Student {
	private int age;
	private String name;
	
	public int getAge() {return age;}
	// throws :: �� �޼ҵ�� ������ ���� ���ɼ��� �ִ�.
	public void setAge(int age) throws Exception 
	{
		if(age <= 0)
			throw new Exception("age�� ����"+age);
		this.age = age;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
