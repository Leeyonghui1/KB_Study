package test3;

public class GameCharacter {
	private String id;
	private String job;
	private int lev;
	private static int count;
	
	// ������
	public GameCharacter() {
		count++;
	}

	public GameCharacter(String iD, String job) {
		this.id = iD;
		this.job = job;
		count++;
	}
	// �޼ҵ�
	public static int getCount() {return count;}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getJob() {return job;}
	public void setJob(String job) {this.job = job;}
	public int getLev() {return lev;}
	public void setLev(int lev) {this.lev = lev;}
	
	public void sayAttack()
	{
		if(job == "����")
		{
			System.out.println(job+" : ��������");
		}
		else if(job == "������")
		{
			System.out.println(job+" : ��������");
		}
		else
		{
			System.out.println(job+" : �⺻����");
		}
	}
	
	public static void sayHello(String id1, String id2, String id3)
	{
		System.out.println(id1+" : �ȳ�~~");
		System.out.println(id2+" : �ȳ�~~");
		System.out.println(id3+" : �ȳ�~~");	
	}
	

}
