#include<stdio.h>
#include<string.h>

int stack[10001];
int number = 0;

void push(int X)
{
	stack[number] = X;
	number++;
}
void pop()
{
	if (number == 0)
		printf("-1\n");
	else
	{
		number--;
		printf("%d\n", stack[number]);
	}
}
void size()
{
	printf("%d\n", number);
}
void empty()
{
	if (number == 0)
		printf("1\n");
	else
		printf("0\n");
}
void top()
{
	if (number == 0)
		printf("-1\n");
	else
		printf("%d\n", stack[number - 1]);
}

int main()
{
	int N, X;
	scanf("%d", &N);
	char arr[10] = { 0 };
	for (int i = 0; i < N; i++)
	{
		scanf("%s", arr);
		if (strcmp(arr, "push") == 0)
		{
			scanf("%d", &X);
			push(X);
		}
		else if (strcmp(arr, "pop") == 0)
			pop();
		else if (strcmp(arr, "size") == 0)
			size();
		else if (strcmp(arr, "empty") == 0)
			empty();
		else if (strcmp(arr, "top") == 0)
			top();
	}
	return 0;
}