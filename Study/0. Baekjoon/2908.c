#include<stdio.h>
int main()
{
	int a, b;
	scanf("%d %d", &a, &b);
	int A = (((a % 100) % 10) * 100) + (((a % 100) / 10) * 10) + (a / 100);
	int B = (((b % 100) % 10) * 100) + (((b % 100) / 10) * 10) + (b / 100);
	if (A > B)
		printf("%d", A);
	else
		printf("%d", B);
	return 0;
}