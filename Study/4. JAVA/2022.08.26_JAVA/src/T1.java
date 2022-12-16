abstract class Phone{
	abstract public String getNum();
	abstract public String getName();
	abstract public void print();
}

class CellPhone extends Phone{
	private String num;
	private String name;
	
	public CellPhone(String num, String name)
	{
		this.num = num;
		this.name = name;
	}
	
	public String getNum() {return this.num;}
	public String getName() {return this.name;}
	public void print()
	{
		System.out.println("CellPhone의 정보");
		System.out.println("번호: " + getNum());
		System.out.println("이름: " + getName());
	}
}

class SmartPhone extends CellPhone{
	private int androidver;
	private String account;
	
	public SmartPhone(String num, String na, int ver, String ac)
	{
		super(num,na);
		this.androidver = ver;
		this.account = ac;
	}
	
	public void print()
	{
		System.out.println("SmartPhone의 정보");
		System.out.println("번호: " + getNum());
		System.out.println("이름: " + getName());
		System.out.println("OS: Android." + this.androidver);
		System.out.println("계정: " + this.account);
	}
}
public class T1 {
	public static void main(String args[]) {
		CellPhone c= new CellPhone("010-111-2222","롤리팝");
		SmartPhone sm = new SmartPhone("010-4444-6666","S20",13,"더워요");
		
		c.print();
		sm.print();
	}
}
