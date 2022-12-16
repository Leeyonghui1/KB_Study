#pragma once
// 3. 동물병원 구조체
// 동물 이름, 동물 종류, 동물 고유 코드
struct MyStruct
{
	char name[100]; // 동물 이름
	char species[100]; // 개, 고양이 등..
	char code[100];
	// 코드 : 동일 이름 or 동일 종류일때 구분하기 위한 번호개념
	/*   왜 code는 char 타입으로 문자열로 선언했는가?
	- 만약 코드번호가 '00007' 일 때
	int타입 경우 '7' 혹은 이상한 값이 들어간다
	그래서 char타입으로 문자열로 설정하여 '00007'을 입력할수있다.
	*/
}typedef Animal;

// 4. 만들고 싶은 아무 구조체
struct Food
{
	int price;
	char name[100];
}typedef Food;
struct StudentScore
{
	int kor;
	int eng;
	int math;
}typedef StudentScore;

// 0729 실습용 구조체 KBStudent
/* 
1. KBStudent 라는 구조체를 만든다. 안에 들어가는 내용은 아래와 같다.
int cScore, int javaScore, char name[100]
*/
struct KBStudent
{
	int cScore;
	int javaScore;
	char name[100];
}typedef KBStudent;