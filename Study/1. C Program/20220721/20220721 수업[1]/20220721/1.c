#include<stdio.h>
//��ȯ��,�Ű����� ����
void enterKey()
{
	printf("\n");
}

//�Ű������� ����
void printPowerNumber(int n)
{
	printf("%d", n * n);
}

// ��ȯ���� ����
int inputNum()
{
	int n;
	printf("���� �Է��ؿ� ");
	scanf_s("%d", &n);
	return n;
}

//��ȯ��, �Ű����� �Ѵ� ����
int PowerNum(int n, int p)   //n : ����, p:������(�¼�)
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
		for (int i = 0; i < p-1; i++)
			n *= num;
	}
	    return n;
}


void printNumber(int n) 
{
	printf("%d", n);
}

int main()
{   
	//1��
	printf("1.��� �Լ� ȣ��");
	enterKey();
	int num = inputNum();
	printPowerNumber(num);
	enterKey();
	printPowerNumber(inputNum());
	enterKey();
	printf("PowerNum return�� = %d",PowerNum(2, 5));
	enterKey();
	enterKey();
	
	//2��
	printf("2.printNumberȣ��");
	enterKey();
	printNumber(5);
	enterKey();
	enterKey();
	
	//3��
	printf("3.PowerNum return��");
	enterKey();
	printNumber(PowerNum(2, 5));
	enterKey();
	enterKey();
	
	//4��
	printf("4. inputNumȰ���ؼ� PowerNum return��");
	enterKey();
	int a = inputNum();
	int b = inputNum();
	int result = PowerNum(a, b);
	printNumber(result);

	
	return 0;

}