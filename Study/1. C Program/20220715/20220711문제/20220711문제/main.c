#include<stdio.h>
int calcul()
{
	int a, b, c;
	printf("1. \n");
	printf("a = ");
	scanf_s("%d", &a);
	printf("b = ");
	scanf_s("%d", &b);
	printf("c = ");
	scanf_s("%d", &c);
	
	int sum = 0;
	for (int i = a; i <= b; i++)
	{
		if (i % c == 0)
			continue;
		sum += i;
	}
	printf("sum=%d\n", sum);

}
int time()
{
	int t, h, m;
	m = 0;
	printf("\n2.Sec(초)를 입력 : ");
	scanf_s("%d", &t);
	if (t >= 3600)
	{
		printf("오류\n");
		return m;
	}
	if (t % 60 == 0)
	{
		h = t / 60;
		printf("%d분\n", h);
	}
	else
	{
		h = t / 60;
		m = t % 60;
		printf("%d분 %d초\n", h, m);
	}
}
void ColorChange()
{
	printf("\n3.\n");
	system("color a0");
}
void ColorSet()
{
	printf("\n4.");
	char a, b;
	char attr[10] = "color ";
	rewind(stdin);
	a = getchar();
	b = getchar();
	attr[6] = a;
	rewind(stdin);
	attr[7] = b;
	system(attr);
}
void Sum()
{
	printf("\n5.\n");
	int sum = 0;
	for (int i = 1; i <= 100; i++)
	{
		sum += i;
		if (i < 100)
			printf("%d+", i);
		else
			printf("%d", i);
	}
	printf("\ntotal = %d\n", sum);
	return sum;
}
int mul(int a, int b)
{
	printf("\n6.\n");
	int mul = 1;
	for (int i = a; i <= b; i++)
	{
		mul *= i;
		if (i < b)
			printf("%dx", i);
		else
			printf("%d", i);
	}
	printf("\ntotal = %d\n", mul);
	return 0;
}
int cal(int a, int b, int c)
{
	int sum = 0;
	int mul = 1;
	printf("\n7.\n");
	if (c == '+')
	{
		for (int i = a; i <= b; i++)
		{
			sum += i;
			if (i < b)
				printf("%d+", i);
			else
				printf("%d", i);
		}
		printf("\ntotal = %d\n", sum);
	}
	else if (c == '*' || c == 'x' || c == 'X')
	{
		for (int i = a; i <= b; i++)
		{
			mul *= i;
			if (i < b)
				printf("%dx", i);
			else
				printf("%d", i);
		}
		printf("\ntotal = %d\n", mul);
	}
	else
	{
		printf("\n예외\n");
	}

}
int pro1(int n)
{
	int mul = 1;
	printf("\n8.\n");
	for (int i = 1; i <= n; i++)
	{
		mul *= i;
		if (i < n)
			printf("%dx", i);
		else
			printf("%d", i);
	}
	printf("\ntotal = %d\n", mul);

}
int pro2(int n)
{
	if (n == 1)
		return 1;
	return n * pro2(n - 1);
}
int pattern(int n)
{
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	if (n > 1)
		return pattern(n - 1) + pattern(n - 2);
}
int main()
{
	int result1 = calcul(); //p1
	
	int trans = time(); //pr2
	
	ColorChange();   //pr3
	
	ColorSet(); //pr4
	
	Sum();  //pr5
	
	mul(1, 5); //pr6
    
    cal(1, 5, 'x');  //pr7

	pro1(5); //pr8

	//pr9
	int result2 = pro2(5);
	printf("\n9.\ntotal = %d\n", result2);
	
	
	//10
	printf("\n10.\n");
	int n;
	scanf_s("%d", &n);
	int result3 = pattern(n);
	printf("\n result = %d\n", result3);
	
	
	return 0;

}