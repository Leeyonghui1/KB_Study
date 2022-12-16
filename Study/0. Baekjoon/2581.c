#include<stdio.h>
int main()
{
	int M, N;
	scanf("%d %d", &M, &N);
	static int arr[10001] = { 0 };
	arr[1] = 1;
	for (int i = 2; i <= N; i++)
	{
		for (int j = 2; i * j <= N; j++)
			arr[i * j] = 1;
	}
	int sum = 0;
	int min = 0;
	int check = 0;
	for (int i = M; i <= N; i++)
	{
		if (arr[i] == 0)
		{
			if (sum == 0)
				min = i;
			sum += i;
			check = 1;
		}
	}
	
	if (check == 0)
		printf("-1");
	else
	{
		printf("%d\n", sum);
		printf("%d\n", min);
	}
	
	return 0;
}