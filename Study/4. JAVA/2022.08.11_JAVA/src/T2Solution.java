// 클래스 선언
class student_Ans{
	// 멤버 변수 선언
	private String name;
	private int num;
	private String gender;
	
	// 생성자 선언 : 초기화
	public student_Ans(String n, int num , String g) {
		this.name = n;
		this.num = num;
		this.gender = g;
	}
	
	//멤버 함수 선언
	public String getName() {return this.name;}
	public int getNum() {return this.num;}
	public String getGender() {return this.gender;}
	public void setName(String n) {this.name = n;}
	public void setNum(int num) {this.num = num;}
	public void setGender(String g) {this.gender = g;}
}


public class T2Solution {
	public static void main(String args[]){
		//객체 배열 선언
		student_Ans stu[] = new student_Ans[3];
		// 각 배열에 관한 객체(student_Ans) 생성
		stu[0] = new student_Ans("이동준",2009038033,"남");
		stu[1] = new student_Ans("이제영",2007012034,"여");
		stu[2] = new student_Ans("박준현",2002012034,"남");
		
		// 특정 객체 배열 데이터 변경
		for(int i = 0 ; i < 3 ; i++)
		{
			if((stu[i].getName()).equals("이동준"))
			{
				stu[i].setNum(2019038033);
			}
		}
		stu[2].setName("이용희");
		stu[2].setNum(123456);
		stu[2].setGender("남");
		
		// 객체 배열 출력
		for(int i = 0 ; i < 3 ; i++)
		{
			System.out.println((i+1) + "번째 학생");
			System.out.println("이름: " + stu[i].getName());
			System.out.println("학번: " + stu[i].getNum());
			System.out.println("성별: " + stu[i].getGender());
			System.out.println();
			
		}
	}

}
