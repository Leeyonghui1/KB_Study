#include<stdio.h>
int main()
{
	int T,H,W,N;
	scanf("%d", &T);
	for (int i = 0; i < T; i++)
	{
		// H : ���� 
		// W : ȣ��
		// N : ���°�մ�
		scanf("%d %d %d", &H, &W, &N);
		// �մ��� ����
		int x = N % H;
		if (x == 0)
			x = H;
		// �մ��� ȣ��
		int y = (N / H) + 1;
		if (N % H == 0)
			y -= 1;
		printf("%d%02d\n", x, y);
	}
	return 0;
}