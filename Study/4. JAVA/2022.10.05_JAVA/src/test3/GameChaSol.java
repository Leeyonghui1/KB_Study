package test3;

public class GameChaSol {
	private String Id; // ĳ���� ID
	private String _Class; // ĳ���� ����
	private int Level; // ĳ���� ����
	private static int Count; // �� ĳ���� ��
	
	// ������
	public GameChaSol() {
		// ĳ���͸� �����Ҷ����� �� ĳ���� �� ����
		Count++;
	}
	public GameChaSol(String id, String _Class) {
		Id = id;
		this._Class = _Class;
		Count++;
	}
	
	// �޼ҵ�
	public String getId() {return Id;}
	public void setId(String id) {Id = id;}
	public String get_Class() {return _Class;}
	public void set_Class(String _Class) {this._Class = _Class;}
	public int getLevel() {return Level;}
	public void setLevel(int level) {Level = level;}
	// �� �ο���(Count)�� �б⸸ �����ϰ� ĳ���� �߰�(�ν��Ͻ� ����)�Ҷ� �ڵ� ����
	public static int getCount() {return Count;}
	
	
	public static void sayHello()
	{
		System.out.println("�ȳ�~~");
	}
	
	public void attack()
	{
		if(_Class.contains("����"))
		{
			System.out.println("��������");
		}
		else if(_Class.contains("����"))
		{
			System.out.println("��������");
		}
		else
		{
			System.out.println(Level+"lv "+_Class+"�� ������");
		}
	}
}
