package test3Sol;

public class T3Solution {

	public static void main(String[] args) {
		Drmundo d = new Drmundo();
		d.Q();
		d.W();
		d.E();
		d.R();
		
		Cogmo c = new Cogmo();
		c.Q();
		c.W();
		c.E();
		c.R();
		c.passive();
		
		Lol chogas = new Lol() {
			public void Q() {
				System.out.println("�Ŀ�");
			}
			public void W() {
				System.out.println("���¢��");
			}
			public void E() {
				System.out.println("����");
			}
			public void R() {
				System.out.println("��ƸԱ�");
			}
		};
		chogas.Q();
		chogas.W();
		chogas.E();
		chogas.R();
		
		new Lol() {
			public void dance() {
				System.out.println("���Բ�����");
			}
			@Override
			public void Q() {}
			public void W() {}
			public void E() {}
			public void R() {}
		}.dance();
		
		
		
	}

}
