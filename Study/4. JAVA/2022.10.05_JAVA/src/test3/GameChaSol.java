package test3;

public class GameChaSol {
	private String Id; // 캐릭터 ID
	private String _Class; // 캐릭터 직업
	private int Level; // 캐릭터 레벨
	private static int Count; // 총 캐릭터 수
	
	// 생성자
	public GameChaSol() {
		// 캐릭터를 생성할때마다 총 캐릭터 수 증가
		Count++;
	}
	public GameChaSol(String id, String _Class) {
		Id = id;
		this._Class = _Class;
		Count++;
	}
	
	// 메소드
	public String getId() {return Id;}
	public void setId(String id) {Id = id;}
	public String get_Class() {return _Class;}
	public void set_Class(String _Class) {this._Class = _Class;}
	public int getLevel() {return Level;}
	public void setLevel(int level) {Level = level;}
	// 총 인원수(Count)는 읽기만 가능하고 캐릭터 추가(인스턴스 증가)할때 자동 증가
	public static int getCount() {return Count;}
	
	
	public static void sayHello()
	{
		System.out.println("안녕~~");
	}
	
	public void attack()
	{
		if(_Class.contains("전사"))
		{
			System.out.println("물리어택");
		}
		else if(_Class.contains("마법"))
		{
			System.out.println("마법공격");
		}
		else
		{
			System.out.println(Level+"lv "+_Class+"의 때리기");
		}
	}
}
