#include<stdio.h>
int calcul()
{
	int a, b, c;
	printf("1.a���� b������ ��[c�� ����� ����] \n");
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
	printf("\n2.Sec(��)�� �Է� : ");
	scanf_s("%d", &t);
	if (t >= 3600)
	{
		printf("����\n");
		return m;
	}
	if (t % 60 == 0)
	{
		h = t / 60;
		printf("%d��\n", h);
	}
	else
	{
		h = t / 60;
		m = t % 60;
		printf("%d�� %d��\n", h, m);
	}
}

void ColorChange()
{
	printf("\n3.��ȯ���� �Ű��������� ȭ�� �� �ٲٱ�(color A0)\n");
	system("color A0");
}

void ColorSet()
{
	printf("\n4.��ȯ�� ���� �Ű����� �̿��Ͽ� ȭ�� �� �ٲٱ�\n");
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
	printf("\n5.1����100���� ��(�������)\n");
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
	printf("\n6.a���� b���� ����(�������)\n");
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

	printf("\n7.5&6�� �Լ��̿� a����b���� ���\n");
	printf("a = ");
	scanf_s("%d", &a);
	printf("b = ");
	scanf_s("%d", &b);
	rewind(stdin);

	printf("��Ģ������ �Է��ϼ���\n");
	printf("��Ģ���� = ");
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
		printf("����\n");
}

void pro1()
{
	int mul = 1;
	int n;
	printf("\n8.1���� n������ ��(�ݺ���)\n");
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
	printf("\n9.1���� n������ ��(����Լ�)\n");
	printf("n = ");
	scanf_s("%d", &n9);
	printf("total = %d\n", pro2(n9));


	//pr10
	printf("\n10. ��Ģ�� ���� �Լ�\nn = ");
	int n10;
	scanf_s("%d", &n10);
	int result = pattern(n10);
	printf("result = %d\n", result);


	return 0;

}