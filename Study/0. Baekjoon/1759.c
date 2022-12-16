#include<stdio.h>
void completed_Pw(char* code, int L)
{
	int mo = 0;
	int ja = 0;
	for (int i = 0; i < L; i++)
	{
		if (code[i] == 'a' || code[i] == 'e' || code[i] == 'i' || code[i] == 'o' || code[i] == 'u')
			mo++;
		else
			ja++;
	}
	if (mo >= 1 && ja >= 2)
		printf("%s\n", code);
}


void make_Pw(int L, int C, char* alpha, char* code, int a, int b)
{
	if (a == L)
		completed_Pw(code, L);
	else
	{
		for (int i = b; i < C; i++)
		{
			code[a] = alpha[i];
			make_Pw(L, C, alpha, code, a + 1, i + 1);
		}
	}
}

int main()
{
	int L, C;
	scanf("%d %d", &L, &C);
	char alpha[16] = { NULL };
	for (int i = 0; i < C; i++)
	{
		getchar();
		scanf("%c", &alpha[i]);
	}

	for (int i = 0; i < C; i++)
	{
		for (int j = i + 1; j < C; j++)
		{
			if (alpha[i] > alpha[j])
			{
				char temp = alpha[i];
				alpha[i] = alpha[j];
				alpha[j] = temp;
			}
		}
	}

	char code[16] = { NULL };
	make_Pw(L, C, alpha, code, 0, 0);
	return 0;
}