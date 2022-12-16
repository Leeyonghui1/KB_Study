package practice3;

public class Employee {
	private String name;
	private String sabeon;
	
	public Employee(String name, String sabeon) {
		this.name = name;
		this.sabeon = sabeon;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getSabeon() {return sabeon;}
	public void setSabeon(String sabeon) {this.sabeon = sabeon;}
	
	
	// �޸𸮸��� ������ �ؽ��ڵ尡 ����
	// Object Ŭ������ �ִ� hashCode �޼ҵ忡�� �޸� �������� �ִ�
	// Object Ŭ������ �ִ� hashCode �޼ҵ带 �������ؾ� HashSet �ߺ� ������ ���Ű���
	@Override
	public int hashCode() {
		// ���ڿ��� hashCode�� ��
		return (name+sabeon).hashCode();
	}
	
	// equals���� ������ �ؾ� HashSet ��ü���� ����� �ߺ� ���� �۵�
	@Override
	public boolean equals(Object obj) {
		Employee temp = (Employee)obj;
		return temp.getName().equals(name) && temp.getSabeon().equals(sabeon); 
		
	}
}
