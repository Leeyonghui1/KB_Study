// 추상 클래스
abstract class Animals{
	// 추상 메소드
	abstract String getName();
	abstract void printcry();
}

class Cats extends Animals{
	private String name;
	public Cats() {this.name = "고양이";}
	public String getName() {return this.name;}
	public void printcry() {System.out.print("야오오옹");}
}

class Dogs extends Animals{
	private String name;
	public Dogs() {this.name = "강아지";}
	public String getName() {return this.name;}
	public void printcry() {System.out.print("월월월");}
}


public class T1Solution {
	public static void main(String args[]) {
		// 객체 생성
		Cats c = new Cats();
		Dogs d = new Dogs();
		
		System.out.print("\"" + c.getName() + "\"" + "의 울음소리는 " + "\"");
		c.printcry();
		System.out.println("\"");
		
		System.out.print("\"" + d.getName() + "\"" + "의 울음소리는 " + "\"");
		d.printcry();
		System.out.println("\"");
	}
}
