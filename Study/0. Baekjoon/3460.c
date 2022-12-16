#include<stdio.h>
int main()
{
	int T, N;
	scanf("%d", &T);
	for (int i = 0; i < T; i++)
	{
		scanf("%d", &N);
		int count = 0;
		while ( N != 0)
		{
			if (N % 2 == 1)
				printf("%d ", count);
			N /= 2;
			count++;
		}
	}
	return 0;
}