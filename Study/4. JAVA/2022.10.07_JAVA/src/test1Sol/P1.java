package test1Sol;

public class P1 {

	public static void main(String[] args) {
		
		Food f1 = new Food("�̸�",5000);
		Food f2 = new PorkCutlet("�����",8000);
		PorkCutlet f3 = new PorkCutlet("���",9000);
		
		f1.eat(); // Food Ŭ������ eat ȣ��
		f2.eat(); // PorkCutlet Ŭ������ eat ȣ��
		f3.eat(); // PorkCutlet Ŭ������ eat ȣ��
		
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat(5);
		}
		if(f2 instanceof PorkCutlet)
		{
			((PorkCutlet)f2).eat("�ʰ�����");
		}
		
		f3.eat(10);
		f3.eat("���ݸ�");
		
		Food f4 = new Pasta("�����Ľ�Ÿ",500000);
		((Pasta)f4).eat();
	}

}
