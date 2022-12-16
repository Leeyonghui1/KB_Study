package test1Sol;
// Comparable :: 비교에 사용되는 인터페이스
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
	

	// 출력용
	@Override
	public String toString() {
		return String.format("이름:%s, 성별:%s, 나이%d, 번호:%d",this.name,this.gender,this.age,this.number);
	}
	
	// 중복체크용
	@Override
	public boolean equals(Object obj) {
		/*
		 KBStudent k = (KBStudent)obj;
		 return k.getNumber() == number;
		*/
		return ((KBStudent)obj).getNumber() == this.number;
	}

	// 정렬용
	@Override
	public int compareTo(KBStudent o) {
		return this.age - o.getAge(); // 오름차순 정렬에 쓰임
	}
	
}
