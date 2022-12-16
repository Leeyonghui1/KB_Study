#include<stdio.h>
int main() {
	int a;
	scanf_s("%d", &a);
	int count = 0;
	int ar[100] = { 0, };
	int ars[100] = { 0, };
	ar[0] = 1;
	for (int i = 0; i < a; i++) 
	{
		int j = 0, k = 0, l = 1;
		while (1)
		{
			printf("%d\n", ar[i]);
			{
				ars[i] = ar[i];
				ars[i + 1] = count;
				printf("%d %d\n", ars[i], ars[i+1]);
				break;
			}

		}
	}
	return 0;
}

			



