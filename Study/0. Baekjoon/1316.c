#include<stdio.h>
int main()
{
	int N;
	scanf("%d", &N);
	char str[101];
	int group_Num = 0;
	for (int i = 0; i < N; i++)
	{
		scanf("%s", str);
		int len_str = 0;
		for (int i1 = 0; str[i1] != NULL; i1++)
		{
			len_str = i1 + 1;
		}
		int count = 0;
		for (int j = 0; j < len_str; j++)
		{
			for (int k = 0; k < j; k++)
			{
				if (str[j] == str[k] && str[j - 1] != str[k])
				{
					count = 1;
					break;
				}
			}
		}
		if(count == 0)
			group_Num++;
	}
	printf("%d", group_Num);
	return 0;
}