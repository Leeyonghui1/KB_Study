package test1_1;

public class GameCharacter {
	private String Id; 
	private String _Class; 
	private int Level; 
	private static int Count; 
	
	public GameCharacter(String id, String _Class) {
		Count++; 
		Id = id;
		this._Class = _Class;
	}
	public GameCharacter() {
		Count++; 
	}

	public String getId() {return Id;}
	public void setId(String id) {Id = id;}
	public String get_Class() {return _Class;}
	public void set_Class(String _Class) {this._Class = _Class;}
	public int getLevel() {return Level;}
	public void setLevel(int level) {Level = level;}
	
	public static int getCount() {return Count;}
	public static void sayHello() {
		System.out.println("안녕~~");
	}
	public void attack() 
	{
		if(_Class.contains("전사")) {
			System.out.println("물리어택");
		} else if(_Class.contains("마법")) {
			System.out.println("마법 공격");
		} else {
			System.out.println(Level+"lv "+_Class+"의 때리기");
		}
	}
	
	public void printInfo()
	{
		System.out.println(this.Id+"의 직업은 " + this._Class);
		System.out.println("Lv : " + this.Level);
	}

}
