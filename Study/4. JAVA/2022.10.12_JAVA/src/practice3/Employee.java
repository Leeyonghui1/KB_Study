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
	
	
	// 메모리마다 고유의 해쉬코드가 있음
	// Object 클래스에 있는 hashCode 메소드에는 메모리 참조값이 있다
	// Object 클래스에 있는 hashCode 메소드를 재정의해야 HashSet 중복 데이터 제거가능
	@Override
	public int hashCode() {
		// 문자열의 hashCode를 비교
		return (name+sabeon).hashCode();
	}
	
	// equals까지 재정의 해야 HashSet 객체에서 제대로 중복 제거 작동
	@Override
	public boolean equals(Object obj) {
		Employee temp = (Employee)obj;
		return temp.getName().equals(name) && temp.getSabeon().equals(sabeon); 
		
	}
}
