package test1Sol;

public class FishAndChips extends Food{

	public FishAndChips(String name, int price) {
		super(name, price);
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("영국의 마지막 자존심");
	}
	
}
