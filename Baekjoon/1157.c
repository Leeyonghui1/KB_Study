#include<stdio.h>
int main()
{

	
	static char arr[1000001];
	gets(arr);
	int a = 0; // ���� �ٸ� ���ĺ� üũ
	int b = 0; // ���� ���� ���ĺ� üũ
	int size = 0;
	for (int i = 0; arr[i] != '\0'; i++)
		size++;
	printf(" size = %d\n", size);

	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < i; j++)
		{
			
		}
	}

	printf(" a = %d, b = %d", a, b);
  
	
	 

	return 0;
}