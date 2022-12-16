#include<stdio.h>
int main()
{
	//포인터
	/*
	int a = 10;
	int* ptr_a = &a;
	//다중 포인터
	int** pp_aa = &ptr_a; // 주소값의 주소를 지정
	*/
	// 다중포인터 이용해서 배열에 있는 값 가르키기
	// ex)4칸짜리 1차원 배열 3개 관리하는 2차원배열
	int numbers[3][4] = {
		{10, 20, 30, 40},
		{50, 60, 70, 80},
		{90, 100, 110, 120}
	}; 
	//int** ptr = numbers;  //불량코딩
	printf("%d\n", numbers[0][0]);
	//printf("%d", ptr[0][0]); // 불량코딩
	//4칸짜리 배열을 가르키는 배열포인터 만들어야함
	int(*nptr)[4] = numbers;
	printf("%d\n", nptr[0][0]);

	//배열은 포인터, 포인터 앞 별을 붙이면 그안에 들어간 값 출력가능
	printf("%d\n", **numbers); //10
	printf("%d\n", **(numbers+1)); //50
	printf("%d\n", *(*numbers+1)); //20

	/*
	//배열
	int numbers[5] = { 1,20,50,30,4 };
	//다차원배열 = 다중 포인터에서 파생
	int multi_dim[3][2] //2차원배열 3행2열
		= {
			{3,4}, {1,2}, {99,22}
	       };

	

	// 305호 학생나이
	int room[5] = { 30, 22, 25, 29, 27 };
	// 3층에 교실 3개, 각 교실마다 학생나이
	int r_room[3][5];
	//int** rr = r_room;
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 5; j++)
			r_room[i][j] = i + j + 10;
		    
	}
	for(int i=0;i<3;i++)
	{
		for (int j = 0; j < 5; j++)
			printf("%d\n", r_room[i][j]);
		   
	}
	*/
	return 0;

}