#include<stdio.h>
void no_changeValue(int a, int b)   // �Լ� ����
{
	a = b;
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
	scanf_s("%d", &a);
	return a;
}

void printNum(int a)
{
	printf("%d\n", a);
}

int main()
{
	// 1.
	/* 
	int a = 3;
	no_changeValue(a, 300);    // �Լ� ȣ��
	printf("a = %d\n", a);
	*/

	// 2.
	/* 
	int a = 3;
	int b = 5;
	swap(&a, &b);
	printf("%d %d\n", a, b);
	*/

	// 3.
	/* 
	int a, b;
	printf("a b �Է��ض�.\n");
	scanf_s("%d %d", &a, &b);
	swap(&a, &b);
	printf("a = %d, b = %d\n", a, b);
	*/

	// 4.

	int a = inputNum();
	int b = inputNum();
	printNum(a);
	printNum(b);
	swap(&a, &b);
	printNum(a);
	printNum(b);


	return 0;
}