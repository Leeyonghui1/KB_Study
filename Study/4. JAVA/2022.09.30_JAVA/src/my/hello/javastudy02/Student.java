package my.hello.javastudy02;

public class Student{
	// name, age, score
	private String name;
	private int age;
	private double score;
	
	// ���� �Ӽ����̶� getter,setter�� �����ٸ� �Ʒ��� ���� �ƹ��͵� ���� �����ڰ� �ڵ����� ���������
	public Student() {
		
	}
	// ������
	public Student(String name, int age, double score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}
	// �����ε�
	// �����ڸ��� �Ȱ��� �Ű����� Ÿ��,������ �ٸ��� ����
	public Student(String name){
		this.name = name;
	}
	
	
	
	// alt+shift+s �������¿��� rŰ
	// ���콺 ������ Ŭ�� -> Source -> Generate Getter and Setter
	// Getter Setter
	public String getName() {return name;}
	public String getName(String title) {return name+title;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public double getScore() {return score;}
	public void setScore(double score) {this.score = score;}
	
}