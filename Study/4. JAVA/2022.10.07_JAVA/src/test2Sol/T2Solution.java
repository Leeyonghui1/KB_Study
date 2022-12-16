package test2Sol;

public class T2Solution {
	public static void main(String[] args) {
		Teacher t = new MathTeacher();
		MathTeacher m = new MathTeacher();
		ProgramingTeacher p = new ProgramingTeacher();
		JavaProgramingTeacher j = new JavaProgramingTeacher("이동준","임베디드");
		
		t.Teach();
		m.Teach();
		p.Teach();
		j.Teach();
		
		Teacher t2 = new Teacher() {
			public void Teach() {
				System.out.println("물리적 폭력과 함께 물리 강의");
			}
		};
		t2.Teach();
		
		ProgramingTeacher p2 = new ProgramingTeacher() {
			public void Teach() {
				System.out.println(getName()+"쌤이 C언어 교육");
			}
		};
		p2.setName("이유나");
		p2.Teach();
	}
}
