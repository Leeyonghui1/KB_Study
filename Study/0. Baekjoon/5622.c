#include<stdio.h>
int main()
{
	char str[16] = { 0 };
	gets(str);
	for (int i = 0; i < str[i] != NULL; i++)
	{
		if (str[i] == 'A' || str[i] == 'B' || str[i] == 'C')
			str[i] = '2';
		else if (str[i] == 'D' || str[i] == 'E' || str[i] == 'F')
			str[i] = '3';
		else if (str[i] == 'G' || str[i] == 'H' || str[i] == 'I')
			str[i] = '4';
		else if (str[i] == 'J' || str[i] == 'K' || str[i] == 'L')
			str[i] = '5';
		else if (str[i] == 'M' || str[i] == 'N' || str[i] == 'O')
			str[i] = '6';
		else if (str[i] == 'P' || str[i] == 'Q' || str[i] == 'R' || str[i] == 'S')
			str[i] = '7';
		else if (str[i] == 'T' || str[i] == 'U' || str[i] == 'V')
			str[i] = '8';
		else if (str[i] == 'W' || str[i] == 'X' || str[i] == 'Y' || str[i] == 'Z')
			str[i] = '9';
	}
	int time = 0;
	for (int i = 0; i < str[i] != NULL; i++)
	{
		if (str[i] == '2')
			time += 3;
		else if (str[i] == '3')
			time += 4;
		else if (str[i] == '4')
			time += 5;
		else if (str[i] == '5')
			time += 6;
		else if (str[i] == '6')
			time += 7;
		else if (str[i] == '7')
			time += 8;
		else if (str[i] == '8')
			time += 9;
		else if (str[i] == '9')
			time += 10;
	}
	printf("%d", time);
	return 0;
}