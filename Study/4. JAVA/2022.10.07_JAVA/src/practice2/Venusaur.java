package practice2;

public class Venusaur extends Ivysaur {
	@Override
	public void Move() {
		super.Run();
		System.out.println("¾îµò°¡ Â¡±×·¯¿ò");
	}
	
	@Override
	public void Grow() {
		System.out.println("µîµüÀÇ ²É ÀÚ¶÷");
	}
	
	@Override
	public void Charming() {
		System.out.println("²É²É²É~ ÀÌ»óÇØ²É~");
	}
}
