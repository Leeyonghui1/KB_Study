// CStudy13 �ǽ�2
#include<stdio.h>
int a;
int b;

void no_changeValue(int p, int v)
{
	p = v;
}

void swap(int* a, int* b)
{
	int temp = *a;
	*a = *b;
	*b = temp;
}

int inputNum()
{
	int a;
	printf("�� �� �� ��");
	scanf_s("%d", &a);
	rewind(stdin);
	
	return a;
}

void printNum(int a)
{
	char c = getchar();
	rewind(stdin);
	printf("%c = %d\n",c, a);
}

int main()
{
	
	//1. no_changeValue�� �ƹ� ȿ���� ���� ���� Ȯ���غ�����.
	int ex = 10;
	no_changeValue(ex, 100);   // ex���� 100���� �ٲٱ⸦ ����Ѵ�.
	printf("ex = %d\n", ex);   // ������ ex���� 10���� �ٲ��� �ʾҴ�.

	//2. ���� a = 3, b = 5�� �� 2���� ���� �ٲٴ� �Լ��� �ۼ��Ѵ�. main���� �ٲ�� ���� ���� ���� ����Ѵ�.
	a = 3;
	int* aa = &a;
	b = 5;
	int* bb = &b;
	printf("�ٲ�� ��\n");
	printf("a = %d, b = %d\n", a, b);
	swap(aa, bb);
	printf("�ٲ�� ��\n");
	printf("a = %d, b = %d\n", a, b);
	
	
	//3.2������ �ۼ��� �Լ��� ����ϵ�,a�� b ���� scanf�� �Է¹ް� ���� main���� �ٲ�� ���� ���� ���� ����Ѵ�.
	
	printf("a = ");
	scanf_s("%d", &a);
	printf("b = ");
	scanf_s("%d", &b);
	printf("�ٲ�� ��\n");
	printf("a = %d, b = %d\n", a, b);
	swap(&a, &b);
	printf("�ٲ�� ��\n");
	printf("a = %d, b = %d\n", a, b);
	
	
	//4.
	int a = inputNum();
	int b = inputNum();
	printNum(a);
	printNum(b);
	swap(&a, &b);
	printf("�ٲ�� ��\n");
	printNum(a);
	printNum(b);


	return 0;
}