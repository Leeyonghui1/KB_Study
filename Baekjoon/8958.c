#include<stdio.h>
//���ع����� ������Ʈ �Ӽ� -> c/c++ sdl�˻� "�ƴϿ�"
//scanf���
int main()
{
	char a[80];
	int n;
	int i = 0;
	scanf("%d", &n);
	while (i < n)
	{
		scanf("%s",a);
		if (i < n)
		{
			int sum = 0;
			int count = 0;
			for (int j = 0; a[j] != NULL; j++)
			{
				if (a[j] == 'O')
				{
					count++;
					sum += count;
				}
				if (a[j] == 'X')
				{
					count = 0;
				}
			}
			printf("%d", sum);
			if (i != n - 1)
				printf("\n");
			i++;
		}
	}
	return 0;
}