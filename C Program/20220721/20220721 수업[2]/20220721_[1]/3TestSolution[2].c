#include<stdio.h>
//3번. 2개의 숫자를 서로 바꾸기(전역변수를 사용한 방법)
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
	printf("숫자 2개 입력\n");
	scanf_s("%d %d", &a, &b);
	printf("a=%d b=%d\n", a, b);
	int temp = a;
	a = b;
	b = temp;
	printf("a=%d b=%d\n", a, b);
	g_swap();
	printf("a=%d b=%d\n", a, b);

	int num1, num2;
	printf("num1, num2에 값 넣기\n");
	scanf_s("%d %d", &num1, &num2);
	swap(&num1, &num2); // num1, num2의 주소지
	printf("%d %d\n",num1,num2);



	return 0;
}