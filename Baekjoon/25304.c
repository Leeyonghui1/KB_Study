#include<stdio.h>
int main()
{
	int X, N, a, b;
	scanf("%d %d", &X, &N);
	int sum = 0;
	for (int i = 1; i <= N; i++)
	{
		scanf("%d %d", &a, &b);
		sum += a * b;
	}
	if (X == sum)
		printf("Yes");
	else
		printf("No");
	return 0;
}