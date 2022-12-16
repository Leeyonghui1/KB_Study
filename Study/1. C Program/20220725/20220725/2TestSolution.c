#include<stdio.h>
void no_changeValue(int a, int b)   // 함수 선언
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
	no_changeValue(a, 300);    // 함수 호출
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
	printf("a b 입력해라.\n");
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