// CStudy13 실습2
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
	printf("숫 자 입 력");
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
	
	//1. no_changeValue가 아무 효과가 없는 것을 확인해보세요.
	int ex = 10;
	no_changeValue(ex, 100);   // ex값을 100으로 바꾸기를 희망한다.
	printf("ex = %d\n", ex);   // 하지만 ex값은 10으로 바뀌지 않았다.

	//2. 변수 a = 3, b = 5일 때 2개의 값을 바꾸는 함수를 작성한다. main에서 바뀌기 전과 후의 값을 출력한다.
	a = 3;
	int* aa = &a;
	b = 5;
	int* bb = &b;
	printf("바뀌기 전\n");
	printf("a = %d, b = %d\n", a, b);
	swap(aa, bb);
	printf("바뀌기 후\n");
	printf("a = %d, b = %d\n", a, b);
	
	
	//3.2번에서 작성한 함수를 사용하되,a와 b 값을 scanf로 입력받고 나서 main에서 바뀌기 전과 후의 값을 출력한다.
	
	printf("a = ");
	scanf_s("%d", &a);
	printf("b = ");
	scanf_s("%d", &b);
	printf("바뀌기 전\n");
	printf("a = %d, b = %d\n", a, b);
	swap(&a, &b);
	printf("바뀌기 후\n");
	printf("a = %d, b = %d\n", a, b);
	
	
	//4.
	int a = inputNum();
	int b = inputNum();
	printNum(a);
	printNum(b);
	swap(&a, &b);
	printf("바뀌기 후\n");
	printNum(a);
	printNum(b);


	return 0;
}