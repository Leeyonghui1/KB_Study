#include<stdio.h>
int main()
{
	int alpha[26];
	for (int i = 0; i < 26; i++)
		alpha[i] = -1;
	char S[101] = {NULL};
	gets(S);
	for (int i = 0; S[i] != NULL; i++)
	{
		if (alpha[S[i] - 'a'] == -1)
			alpha[S[i] - 'a'] = i;
	}
	for (int i = 0; i < 26; i++)
		printf("%d ", alpha[i]);
	return 0;
}