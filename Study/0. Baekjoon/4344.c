#include<stdio.h>
int main()
{
	int C, N;
	scanf("%d", &C);
	for (int i = 0; i < C; i++)
	{
		int score[1001] = {0,};
		double sum = 0;
		double avg = 0;
		int count = 0;
		scanf("%d", &N);
		for (int j = 0; j < N; j++)
		{
			scanf("%d", &score[j]);
			sum += score[j];
			avg = sum / N;
		}
		for (int k = 0; k < N; k++)
		{
			if (score[k] > avg)
				count++;
		}
		printf("%.3lf%%\n", ((double)count / N) * 100);
	}
	return 0;
}