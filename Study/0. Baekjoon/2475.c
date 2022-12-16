#include<stdio.h>
int main()
{
	int N;
	int sum = 0;
	for (int i = 0; i < 5; i++)
	{
		scanf("%d", &N);
		sum += (N * N);
	}
	printf("%d", sum%10);
	return 0;
}