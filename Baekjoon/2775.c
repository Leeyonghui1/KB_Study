#include<stdio.h>
int main()
{
	int floor[15][15] = {0,};
	for (int i = 0; i < 15; i++)
		floor[0][i] = i;
	for (int i = 1; i < 15; i++)
	{
		for (int j = 1; j < 15; j++)
			floor[i][j] = floor[i - 1][j] + floor[i][j - 1];
	}
	int T, k, n;
	scanf("%d", &T);
	for (int i = 0; i < T; i++)
	{
		scanf("%d %d", &k, &n);
		printf("%d\n", floor[k][n]);
	}
	return 0;
}