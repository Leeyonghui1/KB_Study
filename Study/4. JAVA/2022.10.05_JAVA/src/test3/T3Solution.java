package test3;

public class T3Solution {

	public static void main(String[] args) {
		System.out.println("�� �ο� : "+ GameChaSol.getCount());
		GameChaSol g1 = new GameChaSol();
		System.out.println("�� �ο� : "+ GameChaSol.getCount());
		g1.set_Class("��ũ����");
		g1.setId("��ũ��ũ����");
		
		GameChaSol g2 = new GameChaSol("�ְ�������","�߱�������");
		System.out.println("�� �ο� : "+ GameChaSol.getCount());
		GameChaSol g3 = new GameChaSol("�ְ�������","�߱�������");
		g3.set_Class("���Ʊ���");
		g3.setId("�����޽����������");
		g3.setLevel(34);
		System.out.println("�� �ο� : "+ GameChaSol.getCount());
		
		GameChaSol.sayHello();
		// ������ ���� �ٸ� ���
		System.out.print(g1.getId()+"�� ");
		g1.attack();
		g2.attack();
		g3.attack();
		

	}

}
