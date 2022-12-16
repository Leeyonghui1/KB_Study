#include<stdio.h>
// findBig함수의 a,b는 main의 a,b와 아무 상관이 없다. 
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
	//else // b가 a보다 클경우 else 안적어도됨
	return b;
}

int main()
{
	// 둘 중 더 큰 거 출력
	int a, b;
	printf("숫자 두 개 입력\n");
	scanf_s("%d %d", &a, &b);
	//삼항 연산자
	// a가b보다 크거나 같으면 a출력 아니면 b출력
	a >= b ? printf("%d\n", a) : printf("%d\n", b);

	//삼항연산자 없이 하기
	if (a >= b)
		printf("%d\n", a);
	else
		printf("%d\n", b);


	findBig(a, b); // a와 b중에 더 큰 거 출력
	int result = findBigReturn(a, b);
	printf("%d\n", result);


	return 0;

}