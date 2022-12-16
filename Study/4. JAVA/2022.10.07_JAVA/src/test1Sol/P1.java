package test1Sol;

public class P1 {

	public static void main(String[] args) {
		
		Food f1 = new Food("쫄면",5000);
		Food f2 = new PorkCutlet("생선까쓰",8000);
		PorkCutlet f3 = new PorkCutlet("돈까스",9000);
		
		f1.eat(); // Food 클래스의 eat 호출
		f2.eat(); // PorkCutlet 클래스의 eat 호출
		f3.eat(); // PorkCutlet 클래스의 eat 호출
		
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat(5);
		}
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat("초고추장");
		}
		
		f3.eat(10);
		f3.eat("초콜릿");
		
		Food f4 = new Pasta("빠네파스타",500000);
		((Pasta)f4).eat();
	}

}
