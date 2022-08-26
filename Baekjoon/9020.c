#include<stdio.h>

int main()
{
	static int arr[10001] = { 0 };
	arr[1] = 1;
	for (int i = 2; i <= 10000; i++)
	{
		for (int j = 2; i * j <= 10000; j++)
			arr[i * j] = 1;
	}
	int T,N;
	scanf("%d", &T);
	for (int i = 0; i < T; i++)
	{
		scanf("%d", &N);
		if (N % 2 != 0)
			continue;
		for (int j = N/2 ; j > 0; j--)
		{
			if (arr[j] != 1 && arr[N - j] != 1) 
			{
				printf("%d %d\n", j, N - j);
				break;
			}
		}
	}
	return 0;
}