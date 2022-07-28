#include<stdio.h>
#include<string.h>
int main()
{
	int alpha[26] = { 0 };
	static char arr[1000005] = { '\0' };
	scanf("%s", arr);  //gets(arr)
	int size;  // int size = 0 ;
	size = strlen(arr);
	/*
	for (int i = 0; arr[i] != '\0'; i++)
		size++;
	*/
	int number = 0;
	for (int i = 0; i < size; i++)
	{
		if (arr[i] >= 'a' && arr[i] <= 'z')
			number = arr[i] - 'a';
		if (arr[i] >= 'A' && arr[i] <= 'Z')
			number = arr[i] - 'A';
		alpha[number]++;
	}
	int max = alpha[0];
	int point = 0;
	for (int i = 0; i < 26; i++)
	{
		if (alpha[i] > max)
		{
			max = alpha[i];
			point = i;
		}
		else
			continue;
	}
	int same = 0;
	for (int i = 0; i < 26; i++)
	{
		if (alpha[i] == max)
			same++;
	}
	if (same > 1)
		printf("?");
	else
		printf("%c", point + 'A');
	return 0;
}