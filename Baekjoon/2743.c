#include<stdio.h>
int main()
{
	char arr[101];
	gets(arr);
	int count = 0;
	for (int i = 0; arr[i] != NULL; i++)
	{
		if (arr[i] != 0)
			count++;
	}
	printf("%d", count);
	return 0;
}