package practice1;

public class KBCustomer {
	// private :: 다른 클래스에서(다른 파일에서) 읽거나 쓰지 못함 (값에 접근하지 못함)
	// public, private :: 정보의 은닉
	// c#에서는 캡슐화라고 부르는데, java에서는 캡슐화가 아님 >?? 정보의 은닉 = 캡슐화인듯?
	private int age;
	private String name;
	private String cNum;
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getcNum() {return cNum;}
	public void setcNum(String cNum) {this.cNum = cNum;}
	
	
}
