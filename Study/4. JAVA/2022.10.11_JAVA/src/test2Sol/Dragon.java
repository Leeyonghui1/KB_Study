package test2Sol;

public class Dragon extends Cryptid implements Fliable, Runable {
	private String species;
	
	public String getSpecies() {return species;}
	public void setSpecies(String species) {this.species = species;}
	
	public void polymorph() {
		System.out.println(this.species+"드래곤 변신~");
	}
	
	@Override
	public void Run() {
		System.out.println("드래곤은 뛰지 않는다...");
	}

	@Override
	public void Jog() {
		System.out.println("귀찮군...");
	}

	@Override
	public void Fly() {
		System.out.println("한번 날아볼까");
	}

	@Override
	public void FlapWing() {
		System.out.println("변신해서 날개 없다.");
	}

	@Override
	public void sleep() {
		System.out.println("깨우면 혼난다.");
	}

}
