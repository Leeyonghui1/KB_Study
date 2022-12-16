#include<stdio.h>
//배열을 함수의 매개변수로 넘길 때는 배열의 크기도 같이 넘겨줘야 함
// 매개변수는 int numbers[] 라고 해도 되고 int* numbers라고 해도됨(배열은 포인터라서)
/* 매개변수 'size'는 왜 필요한가 ?
배열은 포인터이다. 'numbers[]'는 배열의 시작점만 알려주고 끝을 모른다. 
그래서 종료시점을 알려주기 위해서 배열의 크기인 'size' 를 같이 넘겨야한다
*/

void printArr(int numbers[], int size)  // 'numbers[]'는 시작위치만 알고 종료시점을 몰라서 'size'값이 필요하다
{
	for (int i = 0; i < size; i++)  
		printf("%d\n", numbers[i]);

}

int arrReturn(int numbers[], int size)
{
	int max, min;
	max = min = numbers[0];

	for (int i = 0; i < size; i++)
	{
		if (numbers[i] > max)
		{
			max = numbers[i];
		}
		if (numbers[i] < min)
		{
			min = numbers[i];
		}
	}
	printf("최소값 = %d\n", min);
	return max;
}

void signChange(int numbers[], int size)
{
	for (int i = 0; i < size; i++)
	{
		numbers[i] = -numbers[i];
		printf("%3d", numbers[i]);
	}
}

int main()
{
	//배열
	// 1개의 변수가 여러 개의 값을 관리

	int numbers1[5] = { 5,4,10,-2,1 };
	
	int numbers2[3];
	numbers2[0] = 100;
	numbers2[1] = 200;
	numbers2[2] = -300;

	/*
	for (int i = 0; i < sizeof(numbers1) / sizeof(int); i++) // sizeof(numbers1) : 20byte / sizeof(int) : 4byte  
		printf("%d\n", numbers1[i]);
	*/

	//1. printArr를 호출
	printArr(numbers1, 5);   // 'numbers1'이름 자체는 배열 시작점 위치값 1개만 저장한다
	
	//2. 배열 안의 최댓값은 반환하고 최솟값은 printf로 출력하는 함수 만들고 호출
	printf("최대값 = %d\n",arrReturn(numbers1, 5));

	//3. 배열 값의 부호를 전부 뒤집는 함수 만들고 호출
	signChange(numbers1, 5);

	return 0;

}