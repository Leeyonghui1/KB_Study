#include<stdio.h>
int main()
{
	/*
	1. 층별 강의실 각각에 학생의 수 저장해보기 층수, 강의실 수학생 수는 임의로 정할 것
	   2층 - 1개 / 3층 - 5개 / 5층 - 4개 / 6층 - 3개 / 7층 - 6개
	   총 층수는 5개
	   훈련생의 수는 scanf로 입력받는다고 가정
	*/

	int counts[3][4];  // 테스트위해 숫자 감소
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			printf("강의실 안 학생 수 입력 : ");
			scanf_s("%d", &counts[i][j]);
		}
	}

	//2번.
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			printf("%d\t", counts[i][j]);
		}
		printf("\n");
	}

	//3번문제. 층별 강의실 개수 입력하고 출력해보기 / 층, 강의실 개수는 임의대로 할 것
	//해석1) counts[0] ~ counts[i-1]번째 값을 가져와서 쓴다
	//해석2) 그냥 1차원 배열 만들고 그 안에 값 넣는다
	 
	int rooms[3]; // 총 3개의 층이라는 의미
	// 각 인덱스에 값을 넣으면 그게 각 층의 강의실 개수
	scanf_s("%d %d %d", &rooms[0], &rooms[1], &rooms[2]);
	printf("%d %d %d\n", rooms[0], rooms[1], rooms[2]);

	return 0;
}