#include<stdio.h>
/*1.*/
int sum_a_to_b(int a, int b, int c)
{
	int sum = 0;
	for (int i = a; i <= b; i++)
	{
		if (i % c != 0) //c�� ��� ����
			sum += i;
	}
	return sum;
}
int main()
{
	printf("1���� 100������ ��(3 ��� ����) = %d\n", sum_a_to_b(1, 100, 3));
	/*
	int x, y, z;
	printf("a,b,c ���� �Է��ϼ���.");
	scanf_s("%d %d %d", &x,&y,&z);
	printf("%d���� %d������ ��(%d ��� ����)\n", x, y, z);
	int result = sum_a_to_b(x, y, z);
	printf("��� = %d\n", result);
	*/
	return 0;

}