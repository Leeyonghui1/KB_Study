#include<stdio.h>

void enterKey()
{
	printf("\n");
}


void printPowerNumber(int n)
{
	printf("%d", n * n);
}


int inputNum()
{
	int n;
	printf("���� �Է��ؿ� ");
	scanf_s("%d", &n);
	return n;
}

int PowerNum(int n, int p) 
{
	if (p <= 0)
	{
		return 1;
	}
	else if (p == 1)
	{
		return n;
	}
	else
	{
		int num = n;
		for (int i = 0; i < p - 1; i++)
			n *= num;
	}
	return n;
}

//2. printNumber�Լ� ����
void printNumber(int n)
{
	printf("%d", n);
}

int main()
{
	//1.ȣ���غ���
	printPowerNumber(3);  
	enterKey();
	enterKey();
	int mynum = inputNum();
	int result = PowerNum(mynum, 3);
	//printf("%d", result);

	//2. printNumber�Լ� ȣ��
	//enterKey();
	//printNumber(30);
	printNumber(result);
	enterKey();

	//3.
	//�Է��� ���� ��ȯ - inputNum()
	enterKey();
	printNumber(PowerNum(inputNum(), 2));
	enterKey();
	
	//4.
	/* �Է¼��� n, p�� �ƴ� p, n���� �ν�
	   ��õ���� �ʴ� ���
	printNumber(PowerNum(inputNum(), inputNum()));
	 */
	enterKey();
	int num = inputNum();
	int power = inputNum();
	printNumber(PowerNum(num, power));

	return 0;

}