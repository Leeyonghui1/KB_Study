#include<stdio.h>
//반환값,매개변수 없음
void enterKey()
{
	printf("\n");
}

//매개변수만 있음
void printPowerNumber(int n)
{
	printf("%d", n * n);
}

// 반환값만 있음
int inputNum()
{
	int n;
	printf("숫자 입력해요 ");
	scanf_s("%d", &n);
	return n;
}

//반환값, 매개변수 둘다 있음
int PowerNum(int n, int p)   //n : 숫자, p:제곱수(승수)
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
	//1번
	printf("1.모든 함수 호출");
	enterKey();
	int num = inputNum();
	printPowerNumber(num);
	enterKey();
	printPowerNumber(inputNum());
	enterKey();
	printf("PowerNum return값 = %d",PowerNum(2, 5));
	enterKey();
	enterKey();
	
	//2번
	printf("2.printNumber호출");
	enterKey();
	printNumber(5);
	enterKey();
	enterKey();
	
	//3번
	printf("3.PowerNum return값");
	enterKey();
	printNumber(PowerNum(2, 5));
	enterKey();
	enterKey();
	
	//4번
	printf("4. inputNum활용해서 PowerNum return값");
	enterKey();
	int a = inputNum();
	int b = inputNum();
	int result = PowerNum(a, b);
	printNumber(result);

	
	return 0;

}