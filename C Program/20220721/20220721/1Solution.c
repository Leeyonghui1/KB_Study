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
	printf("숫자 입력해요 ");
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

//2. printNumber함수 선언
void printNumber(int n)
{
	printf("%d", n);
}

int main()
{
	//1.호출해보기
	printPowerNumber(3);  
	enterKey();
	enterKey();
	int mynum = inputNum();
	int result = PowerNum(mynum, 3);
	//printf("%d", result);

	//2. printNumber함수 호출
	//enterKey();
	//printNumber(30);
	printNumber(result);
	enterKey();

	//3.
	//입력한 숫자 반환 - inputNum()
	enterKey();
	printNumber(PowerNum(inputNum(), 2));
	enterKey();
	
	//4.
	/* 입력순서 n, p가 아닌 p, n으로 인식
	   추천하지 않는 방법
	printNumber(PowerNum(inputNum(), inputNum()));
	 */
	enterKey();
	int num = inputNum();
	int power = inputNum();
	printNumber(PowerNum(num, power));

	return 0;

}