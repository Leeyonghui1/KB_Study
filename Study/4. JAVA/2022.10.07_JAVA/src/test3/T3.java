package test3;

public class T3 {

	public static void main(String[] args) {
		LeagueOfLegends Champ1 = new DrMundo();
		Champ1.setName("���� �ڻ�");
		Champ1.setRuneterra("�ڿ�");
		
		LeagueOfLegends Champ2 = new Malphite();
		Champ2.setName("������Ʈ");
		Champ2.setRuneterra("�ż�");
		
		System.out.println("è�Ǿ�� : "+Champ1.getName());
		System.out.println("�Ҽ� : "+Champ1.getRuneterra());
		Champ1.Q();
		Champ1.W();
		Champ1.E();
		Champ1.R();
		System.out.println();
		System.out.println("è�Ǿ�� : "+Champ2.getName());
		System.out.println("�Ҽ� : "+Champ2.getRuneterra());
		Champ2.Q();
		Champ2.W();
		Champ2.E();
		Champ2.R();
		System.out.println();
		
		LeagueOfLegends Champ3 = new LeagueOfLegends() {
			@Override
			public void Q() {
				System.out.println("Q ��ų�� : ���� ������");
			}
			@Override
			public void W() {
				System.out.println("W ��ų�� : ���� �г�");
			}
			@Override
			public void E() {
				System.out.println("E ��ų�� : ���� ��ġ��");
			}
			@Override
			public void R() {
				System.out.println("R ��ų�� : ���� ����");
			}
		};
		Champ3.setName("�׶󰡽�");
		Champ3.setRuneterra("�������");
		
		System.out.println("è�Ǿ�� : "+Champ3.getName());
		System.out.println("�Ҽ� : "+Champ3.getRuneterra());
		Champ3.Q();
		Champ3.W();
		Champ3.E();
		Champ3.R();
	}
}
