package test1Sol;

public class P2 {

	public static void main(String[] args) {
		Food f = new Food("��Ʈ�����ɟ�",15000);
		Food f2 = new FishAndChips("��緥��ǥ��Ĩ",50000);
		FishAndChips f3 = new FishAndChips("��ġ��Ĩ��",7500);
		
		f.eat();
		f2.eat();
		f3.eat();
		((FishAndChips)f2).eat();
	}

}
