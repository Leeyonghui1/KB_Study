package test3;

public class T3Solution {

	public static void main(String[] args) {
		// ������ �����Ƿ� ���� ���� �߻�
		// ���� ������ �ٽ� ��� ���� ����
		CircleSolution c1 = new CircleSolution();
		c1.setR(3);
		System.out.println(c1.getArea());
		System.out.println(c1.getRound());
		
		CircleSolution c2 = new CircleSolution();
		c1.setR(-3);
		System.out.println(c2.getArea());
		System.out.println(c2.getRound());
		if(c2.getArea() != 0)
		{
			System.out.println(c2.getArea());
		}
		else
		{
			System.out.println("c2 ������ Ȯ���ʿ�");
		}
		
		// �Ű������� �ִ� �����ڸ� ���� ��ü����
		CircleSolution m1 = new CircleSolution(4);
		if(m1.getArea() != 0)
			System.out.println(m1.getArea());
		System.out.println(new CircleSolution(5).getArea());
	}
}
