#include<stdio.h>
int main()
{
	int n[10];
	int i;
	for (i = 0; i < 10; i++)
	{
		scanf("%d", &n[i]);
		n[i] %= 42;
	}
	int result = 0;
	for (i = 0; i < 10; i++)
	{
		int count = 0;
		for (int j = 0; j < i; j++)
		{
			if (n[j] == n[i])
				count++;
		}
		if (count == 0)
			result++;
	}	
	printf("%d", result);
	return 0;
}