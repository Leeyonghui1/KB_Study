#include<stdio.h>
/*1.*/
int sum_a_to_b(int a, int b, int c)
{
	int sum = 0;
	for (int i = a; i <= b; i++)
	{
		if (i % c != 0) //c의 배수 제외
			sum += i;
	}
	return sum;
}
int main()
{
	printf("1부터 100까지의 합(3 배수 제외) = %d\n", sum_a_to_b(1, 100, 3));
	/*
	int x, y, z;
	printf("a,b,c 값을 입력하세요.");
	scanf_s("%d %d %d", &x,&y,&z);
	printf("%d부터 %d까지의 합(%d 배수 제외)\n", x, y, z);
	int result = sum_a_to_b(x, y, z);
	printf("결과 = %d\n", result);
	*/
	return 0;

}