#include<stdio.h>
int hansu(int N)
{
	if (N < 100)
		return N;
	int count = 0;
	for (int i = 100; i <= N; i++)
	{
		if (i == 1000)
			continue;
		int n1 = i / 1000;
		int n2 = (i % 1000) / 100;
		int n3 = ((i % 1000) % 100) / 10;
		int n4 = ((i % 1000) % 100) % 10;
		if ((n2 - n3) == (n3 - n4))
			count++;
	}
	return (99+count);
}

int main()
{
	int N;
	scanf("%d", &N);
	int count = hansu(N);
	printf("%d", count);
	return 0;
}
