#include<stdio.h>
int main()
{
	static int arr[300000] = { 0 };
	arr[1] = 1;
	while (1)
	{
		int n;
		scanf("%d", &n);
		if (n == 0)
			break;
		for (int i = 2; i <= 2 * n ; i++)
		{
			for (int j = 2; i * j <= 2 * n; j++)
				arr[i * j] = 1;
		}
		int count = 0;
		for (int i = n+1 ; i <= 2 * n; i++)
		{
			if (arr[i] == 0)
				count++;
		}
		printf("%d\n", count);
	}
	return 0;
}