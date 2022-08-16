#include<stdio.h>
int main()
{
	char str[101] = { 0 };
	gets(str);
	int count = 0;
	
	for (int i = 0; str[i] != NULL; i++)
	{
		if (str[i] == 'c' || str[i] == 's' || str[i] == 'z')
		{
			if (str[i + 1] == '=' || str[i + 1] == '-')
			{
				count++;
				i++;
			}
			else
				count++;
		}
		else if (str[i] == 'n' || str[i] == 'l')
		{
			if (str[i + 1] == 'j')
			{
				count++;
				i++;
			}
			else
				count++;
		}
		else if (str[i] == 'd')
		{
			if (str[i + 1] == '-')
			{
				count++;
				i++;
			}
			else if (str[i + 1] == 'z' && str[i + 2] == '=')
			{
				count++;
				i += 2;
			}
			else
				count++;
		}
		else
			count++;
	}
	printf("%d", count);
	return 0;
}