#include<stdio.h>
//3��. 2���� ���ڸ� ���� �ٲٱ�(���������� ����� ���)
int a;
int b;

void g_swap()
{
	int temp = a;
	a = b;
	b = temp;
}

void swap(int* a, int* b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}

int main()
{
	printf("���� 2�� �Է�\n");
	scanf_s("%d %d", &a, &b);
	printf("a=%d b=%d\n", a, b);
	int temp = a;
	a = b;
	b = temp;
	printf("a=%d b=%d\n", a, b);
	g_swap();
	printf("a=%d b=%d\n", a, b);

	int num1, num2;
	printf("num1, num2�� �� �ֱ�\n");
	scanf_s("%d %d", &num1, &num2);
	swap(&num1, &num2); // num1, num2�� �ּ���
	printf("%d %d\n",num1,num2);



	return 0;
}