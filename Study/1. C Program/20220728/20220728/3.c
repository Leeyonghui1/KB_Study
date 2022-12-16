#include<stdio.h>
struct Student
{
	int num;
	int score;
}typedef Student;

int main()
{
	/* 
	 학생관리 프로그램 
	 - 학생 1명당 해당 학생번호, 점수가 있어야 한다
	 - 학생 3명이 있다면 어떻게 관리 해야 하는가
	*/

	// 1. 변수를 학생 수 만큼 만든다
	int stu1 = 1;
	int stu2 = 2;
	int stu3 = 3;
	int stu1_score = 50;
	int stu2_score = 60;
	int stu3_score = 70;
	/* 
	   변수생성의 단점
	   학생이 새로 생길 때 마다 프로그램 수정해야함
	   데이터관리가 힘듦
	*/

	//2. 배열을 종류별로 만든다(번호 배열, 성적 배열)
	int stu[3];
	int stu_score[3];
	stu[0] = 1;
	stu[1] = 2;
	stu[2] = 3;
	stu_score[0] = 50;
	stu_score[1] = 60;
	stu_score[2] = 70;
	/*
	   배열생성의 단점
	   학생이 새로 생길 때 마다 각 배열들의 칸을 늘려야함
	   realloc 써야함
	   데이터관리가 힘듦(데이터 누락)
	   항목이 새로 추가 되면 변수 또 만들어야함 (학생 몸무게, 키 등등)
	*/

	// 3. 구조체를 이용한 데이터 관리
	Student s1 = { 1, 50 };
	Student s2 = { .num = 2, 60 };
	Student s3;
	s3.num = 3;
	s3.score = 70;
	/*
	  배열과의 차이점
	  구조체에는 인덱스라는 개념이 없다
	  num, score등은 속성이라고 한다.

	*/



	return 0;
}