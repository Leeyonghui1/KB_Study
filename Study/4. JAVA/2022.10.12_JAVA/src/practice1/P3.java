package practice1;

public class P3 {

	// s�ܺ��� e�ܱ��� ������ ��� �޼ҵ�
	// throws Exception :: ���� �޽����� ����� ���ɼ��� ����
	public static void mul(int s, int e) throws Exception
	{
		if(s>e)
			throw new Exception("�߸��� �Ű�����! s�� �� ŭ");
		for(int i = s ; i <= e ; i++)
		{
			for(int j = 1 ; j <= 9 ; j++)
			{
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}
	
	public static void main(String[] args) {
		try {
			mul(2,9);
			mul(9,2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
