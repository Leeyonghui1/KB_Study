#include<stdio.h>
// findBig�Լ��� a,b�� main�� a,b�� �ƹ� ����� ����. 
void findBig(int a, int b)
{
	if (a >= b)
	{
		printf("%d\n", a);
		return;
	}
	printf("%d\n", b);
}

int findBigReturn(int a, int b)
{
	if (a >= b)
		return a;
	//else // b�� a���� Ŭ��� else �������
	return b;
}

int main()
{
	// �� �� �� ū �� ���
	int a, b;
	printf("���� �� �� �Է�\n");
	scanf_s("%d %d", &a, &b);
	//���� ������
	// a��b���� ũ�ų� ������ a��� �ƴϸ� b���
	a >= b ? printf("%d\n", a) : printf("%d\n", b);

	//���׿����� ���� �ϱ�
	if (a >= b)
		printf("%d\n", a);
	else
		printf("%d\n", b);


	findBig(a, b); // a�� b�߿� �� ū �� ���
	int result = findBigReturn(a, b);
	printf("%d\n", result);


	return 0;

}