#include<stdio.h>
long long sum(int* a, int n)
{
	long long sum = 0;
	for (int i = 0; i < n; i++)
	{
		sum += a[i];
	}
	return sum;
}
int main()
{
	static int a[1000001] = {0,};
	int n;
	scanf("%d", &n);
	long long total = sum(*a, n);
	return 0;
}