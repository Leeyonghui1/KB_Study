#include<stdio.h>
int main()
{
	int T;
	scanf("%d", &T);
	for (int i = 0; i < T; i++)
	{
		int R;
		scanf("%d", &R);
		char S[21] ={NULL};
		scanf("%s", &S);
		for (int j = 0; S[j] != NULL ; j++)
		{
			for(int k = 1; k <= R ; k++)
				printf("%c", S[j]);
		}
		printf("\n");
	}
	return 0;
}