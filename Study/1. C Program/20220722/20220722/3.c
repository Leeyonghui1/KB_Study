#include<stdio.h>
#include<stdlib.h> // 동적 배열할때
// malloc -> 메모리 초기화가 안됨
// calloc -> 0으로 초기화해줌
int main()
{
	// 10칸짜리 배열, 값이 쓰레기값이 들어가있다(자동초기화가 안되어있다) 
	int* dynamic_arr = (int*)malloc(3 * sizeof(int));   // 'malloc'앞 '(int*)' 생략가능
	for (int i = 0; i < 3; i++)
		printf("%d\n", dynamic_arr[i]);
	
	int size;
	printf("배열 사이즈 적기");
	scanf_s("%d", &size);
	int* dynamic_arr2 = (int*)malloc(size * sizeof(int));
	// dynamic_arr2 배열에 값을 초기화 하는 for구문
	for (int i = 0; i < size; i++)
		dynamic_arr2[i] = i + 10;
	// dynamic_arr2 배열에 값을 증가시키는 for구문
	for (int i = 0; i < size; i++)
		printf("%d\n", dynamic_arr2[i]);


	//10칸짜리 숫자배열, 값이 0으로 초기화상태
	int* mynumbers = (int*)calloc(10, sizeof(int));
	for (int i = 0; i < 10; i++)
		printf("%d\n", mynumbers[i]);

	//동적메모리는 프로그래머가 수동으로 할당한 것이라
	//다 썼다면 free로 없애줘야함
	//만약 없애지 않으면 메모리 누수 (memory leak) 문제가 발생(메모리 낭비)
	//프로그램이 이대로 끝난다면 굳이 free를 적을필요는 없지만
	//프로그램이 계속 진행되고, 더 이상 동적배열을 안쓴다면 free를 해야한다
	
	free(mynumbers);
	free(dynamic_arr);
	free(dynamic_arr2);

	
	return 0;
}