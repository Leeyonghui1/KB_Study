#include<stdio.h>
#include<stdlib.h>
#define MAX 1024 // 매크로 상수 : 스텍영역보다 먼저 처리되기 때문에 이것을 이용해서 배열크기 정하는건 가능

//문제]배열 안에 숫자를 넣고 거기서 가장 큰 값, 그리고 그 큰 값의 인덱스 출력(main에 풀기)
int main()
{
	int numbers[5];
	// int mynumbers[MAX];  // 매크로상수를 이용한 배열크기 지정
	/*
	int num = 5;
	int numbers2[num]; 
	 * 변수로 배열크기 지정할 수 없다. 그래서 동적배열(malloc, calloc)을 사용한다.
	 * 왜냐? 변수 num, 배열 numbers2 모두 스택영역에 존재한다
	   하지만 무엇을 우선적으로 할당하는지 명확하지가 않아서 'numbers2[num];'를 처리하지 못한다.
	 * 그래서 배열을 다른영역에 할당해야하는데 그 곳이 힙(Heep)영역이며 거기에 동적할당을 한다.
	*/

	int size = sizeof(numbers) / sizeof(int);
	for (int i = 0; i < size; i++)
	{
		printf("%d번째 숫자 입력", i);
		scanf_s("%d", &numbers[i]);
	}
	int max = numbers[0]; // 첫번째 숫자를 가장 크다고 가정
	int max_index = 0;
	for (int i = 0; i < size; i++)
	{
		if (max < numbers[i])
		{
			max = numbers[i];
			max_index = i;
		}
	}
	printf("최댓값은 [%d]에 있습니다.\n", max_index);




	return 0;
}