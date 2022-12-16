package test3;

public class GameCharacter {
	private String id;
	private String job;
	private int lev;
	private static int count;
	
	// 생성자
	public GameCharacter() {
		count++;
	}

	public GameCharacter(String iD, String job) {
		this.id = iD;
		this.job = job;
		count++;
	}
	// 메소드
	public static int getCount() {return count;}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getJob() {return job;}
	public void setJob(String job) {this.job = job;}
	public int getLev() {return lev;}
	public void setLev(int lev) {this.lev = lev;}
	
	public void sayAttack()
	{
		if(job == "전사")
		{
			System.out.println(job+" : 물리어택");
		}
		else if(job == "마법사")
		{
			System.out.println(job+" : 마법공격");
		}
		else
		{
			System.out.println(job+" : 기본공격");
		}
	}
	
	public static void sayHello(String id1, String id2, String id3)
	{
		System.out.println(id1+" : 안녕~~");
		System.out.println(id2+" : 안녕~~");
		System.out.println(id3+" : 안녕~~");	
	}
	

}
