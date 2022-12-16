#include<stdio.h>
//구조체 : 하나의 변수에 여러개의 값을 넣는다
struct Student
{
	int math;
	int eng;
	int kor;
};

int main()
{
	struct Student s1;
	s1.math = 50;
	s1.eng = 60;
	s1.kor = 100;
	printf("%d %d %d\n", s1.math, s1.eng, s1.kor);

	struct Student s2;
	s2.math = 100;
	s2.eng = 50;
	s2.kor = 0;
	printf("%d %d %d\n", s2.math, s2.eng, s2.kor);

	struct Student s3;
	scanf_s("%d", &s3.math);
	scanf_s("%d", &s3.eng);
	scanf_s("%d", &s3.kor);
	printf("%d %d %d\n", s3.math, s3.eng, s3.kor);

	return 0;
}