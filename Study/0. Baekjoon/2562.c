#include<stdio.h>
int main()
{
	int n[9];
	for (int i = 0; i < 9; i++)
		scanf("%d\n", &n[i]);
	int max = n[0];
	int number = 0;
	for (int i = 0; i < 9; i++)
	{
		if (n[i] > max)
		{
			max = n[i];
			number = i;
		}
	}
	printf("%d\n%d", max,number+1);	
	return 0;
}