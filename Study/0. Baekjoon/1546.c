#include<stdio.h>
int main()
{
	int N;
	scanf("%d", &N);
	double score[1000] ={0.};
	for (int i = 0; i < N; i++)
	{
		scanf("%lf", &score[i]);
	}
	double M = score[0];
	for (int i = 0; i < N; i++)
	{
		if (score[i] > M)
			M = score[i];
	}
	for (int i = 0; i < N; i++)
	{
		score[i] = (score[i] / (double)M) * 100;
	}
	double sum = 0.;
	for (int i = 0; i < N; i++)
	{
		sum += score[i];
	}
	printf("%lf", sum/N);
	return 0;
}