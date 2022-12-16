package test5;

public class T5 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("이용희");
		s1.setAge(20);
		s1.study();
		
		KBStudent kbs1 = new KBStudent();
		kbs1.setName("차승화");
		kbs1.setAge(25);
		kbs1.setGender("남");
		kbs1.setEducation("대졸");
		kbs1.setAttend(1);
		kbs1.Attend(kbs1.getAttend());
		KBStudent kbs2 = new KBStudent();
		kbs2.setName("장태연");
		kbs2.setAge(28);
		kbs2.setGender("남");
		kbs2.setEducation("대학생3학년");
		kbs2.setAttend(2);
		kbs2.Attend(kbs2.getAttend());
		
		Sphere sp1 = new Sphere(3);
		System.out.println("sp1의 반지름 : " + sp1.getR());
		System.out.println("sp1의 넓이 : " + sp1.getArea());
		System.out.println("sp1의 부피 : " + sp1.getVolume());
		
		Cuboid c1 = new Cuboid();
		c1.setH(2);
		c1.setW(5);
		c1.setZ(10);
		System.out.println("c1의 H : " + c1.getH());
		System.out.println("c1의 W : " + c1.getW());
		System.out.println("c1의 Z : " + c1.getZ());
		System.out.println("c1의 부피 : " + c1.getCuboidVolume());
	}
}
