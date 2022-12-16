package tset2;

public class T2 {

	public static void main(String[] args) {
		Unicorn u = new Unicorn();
		u.setName("이용휘니콘");
		u.setAge(300);
		
		u.printInfo();
		u.FlapWing();
		u.Fly();
		u.Jog();
		u.Run();
		u.sleep();
		System.out.println("=============");
		Dragon d = new Dragon();
		d.setName("이용드래곤");
		d.setAge(500);
		
		d.printInfo();
		d.FlapWing();
		d.Fly();
		d.Jog();
		d.Run();
		d.sleep();
		
		System.gc();
	}
}
