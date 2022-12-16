// 0729 실습 문제풀이
#include<stdio.h>
#include"Mystructs.h"
int main()
{
	// 2번. 학생 1명을 만들어 본다. 코드로 값 대입, scanf로도 값 대입
	// 구조체 변수에 값넣기 방법 (1)
	KBStudent k1 = { 50, 100, "이동준" }; //c,java,이름
	printf("%d %d %s\n", k1.cScore, k1.javaScore, k1.name);
	// 구조체 변수에 값넣기 방법 (2)
	KBStudent k2 = { .cScore = 10, .javaScore =  20, "이유나" };
	printf("%d %d %s\n", k2.cScore, k2.javaScore, k2.name);
	// 구조체 변수에 값넣기 방법 (3)
	KBStudent k3;
	k3.cScore = 20;
	k3.javaScore = 40;
	strcpy(k3.name, "김동준");
	printf("%d %d %s\n", k3.cScore, k3.javaScore, k3.name);
	// 구조체 변수에 값넣기 방법 (4)
	KBStudent k4;
	scanf_s("%d %d", &k4.cScore, &k4.javaScore);
	rewind(stdin);
	gets(k4.name);
	printf("%d %d %s\n", k4.cScore, k4.javaScore, k4.name);

	return 0;
}