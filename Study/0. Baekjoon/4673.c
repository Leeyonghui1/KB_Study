#include<stdio.h>
void self_number()
{
	static int arr[10001] = { 0 };
	int exc = 0;
	for (int i = 0; i < 10000; i++)
	{
		arr[i] = i;
	}
	for (int i = 0; i < 10000; i++)
	{
		if (i < 10)
		{
			exc = i + i;
			arr[exc] = 0;
		}
		else if (i >= 10 && i < 100)
		{
			exc = i + (i / 10) + (i % 10);
			arr[exc] = 0;
		}
		else if (i >= 100 && i < 1000)
		{
			exc = i + (i / 100) + ((i % 100) / 10) + ((i % 100) % 10);
			arr[exc] = 0;
		}
		else if (i >= 1000 && i < 10000)
		{
			exc = i + (i / 1000) + ((i % 1000) / 100) + (((i % 1000) % 100) / 10) + (((i % 1000) % 100) % 10);
			arr[exc] = 0;
		}
	}
	for (int i = 0; i < 10000; i++)
	{
		if (arr[i] == 0)
			continue;
		else
			printf("%d\n", arr[i]);
	}
}
int main()
{
	self_number();
	return 0;
}