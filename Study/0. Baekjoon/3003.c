#include<stdio.h>
int main()
{
	int p[6] = {1,1,2,2,2,8};
	int n[6] = {0};
	for (int i = 0; i < 6; i++)
	{
		scanf("%d", &n[i]);
		printf("%d ", p[i] - n[i]);
	}
	return 0;
}