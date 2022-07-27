#include<stdio.h>
int main()
{
	static int numbers[1000000];
	int n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++)
	{
		scanf("%d", &numbers[i]);
	}
	int max = numbers[0];
	int min = numbers[0];
	for (int i = 0; i < n; i++)
	{
		if (numbers[i] > max)
			max = numbers[i];
		if (numbers[i] < min)
			min = numbers[i];
	}
	printf("%d %d", min, max);
	return 0;
}