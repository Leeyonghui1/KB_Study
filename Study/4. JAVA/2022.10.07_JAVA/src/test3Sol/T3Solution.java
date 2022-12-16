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
				System.out.println("파열");
			}
			public void W() {
				System.out.println("울부짖음");
			}
			public void E() {
				System.out.println("가시");
			}
			public void R() {
				System.out.println("잡아먹기");
			}
		};
		chogas.Q();
		chogas.W();
		chogas.E();
		chogas.R();
		
		new Lol() {
			public void dance() {
				System.out.println("다함께춤을");
			}
			@Override
			public void Q() {}
			public void W() {}
			public void E() {}
			public void R() {}
		}.dance();
		
		
		
	}

}
