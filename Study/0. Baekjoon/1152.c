#include<stdio.h>
int main()
{
	char str[1000001];
	gets(str);
	int spacenum = 0;
	for (int i = 0; str[i] != NULL; i++)
	{
		if (str[i] == ' ')
		{
			if (str[i + 1] == NULL)
				break;
			spacenum++;
		}
	}
	if (str[0] == ' ')
		spacenum--;
	int word = spacenum + 1;
	printf("%d", word);
	return 0;
}