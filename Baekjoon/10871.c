#include<stdio.h>
int main()
{
	int n,x;
	scanf("%d %d", &n, &x);
	static int a[10000];
	for (int i = 0; i < n; i++)
	{
		scanf("%d", &a[i]);
		if (a[i] < x)
			printf("%d ", a[i]);
		else
			continue;
	}
	return 0;
}