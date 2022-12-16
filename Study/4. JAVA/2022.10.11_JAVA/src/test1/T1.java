package test1;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pikachu p = new Pikachu();
		Bulbasaur b = new Bulbasaur();
		Weepinbell w = new Weepinbell();
		
		p.charming();
		b.fight();
		w.grow();
		
		Animalable p2 = new Animalable() {

			@Override
			public void charming() {
				// TODO Auto-generated method stub
				System.out.println("ÆÄÀÌ¸®~");
			}
		};
		p2.charming();
		
		}

}
