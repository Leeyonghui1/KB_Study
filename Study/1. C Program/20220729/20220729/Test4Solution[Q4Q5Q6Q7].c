#include<stdio.h>
#include"Mystructs.h"
int main()
{
	// 학생 1명일 때
	StudentScore s1 = { .kor = 100, .eng = 0, .math = 50 };
	printf("국어 = %d, 영어 = %d, 수학 = %d\n", s1.kor, s1.eng, s1.math);

	// 학생 3명일 때 ( = 구조체타입 배열을 만들 때)
	StudentScore students[3]
		= {
			{.kor = 10, .eng = 20, .math = 30},
			{.kor = 20, .eng = 40, .math = 60},
			{.kor = 30, .eng = 60, .math = 90},
	};
	
	for(int i = 0 ; i <3;i++)
		printf("국어 = %d, 영어 = %d, 수학 = %d\n", students[i].kor, students[i].eng, students[i].math);

	// 배열의 특정 한 지점만 데이터 변경 가능
	printf("students[0] 변경 전 국어 = %d\n", students[0].kor);
	students[0].kor = 50;
	printf("students[0] 변경 후 국어 = %d\n", students[0].kor);

	// 배열 각 지점의 값 동시 출력 가능
    printf("[1]국어 = %d, [2]영어 = %d, [0]수학 = %d\n", students[1].kor, students[2].eng, students[0].math);

	
	return 0;
}