#include<stdio.h>
int calcul()
{
	int a, b, c;
	printf("1.a부터 b까지의 합[c의 배수는 제외] \n");
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
	printf("\n3.반환값과 매개변수없이 화면 색 바꾸기(color A0)\n");
	system("color A0");
}

void ColorSet()
{
	printf("\n4.반환값 없고 매개변수 이용하여 화면 색 바꾸기\n");
	char a, b;
	char attr[9] = "color ";
	rewind(stdin);
	printf("attr[6] = ");
	a = getchar();
	rewind(stdin);
	printf("\nattr[7] = ");
	b = getchar();
	rewind(stdin);
	attr[6] = a;
	rewind(stdin);
	attr[7] = b;
	rewind(stdin);
	attr[8] = NULL;
	
	system(attr);
}

int Sum()
{
	printf("\n5.1부터100까지 합(과정출력)\n");
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

int mul()
{
	printf("\n6.a부터 b까지 곱셈(과정출력)\n");
	int a;
	int b;
	printf("a = ");
	scanf_s("%d", &a);
	printf("b = ");
	scanf_s("%d", &b);
	
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
	return mul;
}

void cal()
{
	int a;
	int b;
	char c;
	int sum = 0;
	int mul = 1;

	printf("\n7.5&6번 함수이용 a부터b까지 계산\n");
	printf("a = ");
	scanf_s("%d", &a);
	printf("b = ");
	scanf_s("%d", &b);
	rewind(stdin);

	printf("사칙연산을 입력하세요\n");
	printf("사칙연산 = ");
	c = getchar();
	rewind(stdin);

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
		printf("예외\n");
}

void pro1()
{
	int mul = 1;
	int n;
	printf("\n8.1부터 n까지의 곱(반복문)\n");
	printf("n = ");
	scanf_s("%d", &n);
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
	calcul(); //p1
	
	time(); //pr2

	ColorChange();   //pr3

	ColorSet(); //pr4

	Sum();  //pr5

	mul(); //pr6

	cal();  //pr7

	pro1(); //pr8

	//pr9
	int n9;
	printf("\n9.1부터 n까지의 곱(재귀함수)\n");
	printf("n = ");
	scanf_s("%d", &n9);
	printf("total = %d\n", pro2(n9));


	//pr10
	printf("\n10. 규칙을 갖는 함수\nn = ");
	int n10;
	scanf_s("%d", &n10);
	int result = pattern(n10);
	printf("result = %d\n", result);


	return 0;

}