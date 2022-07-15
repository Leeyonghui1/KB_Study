#include <stdlib.h>
#include <stdio.h>
#include <time.h>
#include <windows.h>
#define MAX 45 //로또 숫자 범위
#define SIZE 6 //로또 개수

void setting();

int main(void)
{
	//setting();

	int i;
	int lotto[SIZE];

	srand(time(NULL));

	//로또 난수 생성
	for (i = 0; i < SIZE; i++) {
		lotto[i] = (rand() % MAX) + 1; //1~45 중 랜덤
		//로또 중복 제거
		for (int j = 0; j < i - 1; j++) {
			if (lotto[i] == lotto[j]) {
				i--; //중복 발생 시 i번째 난수 재생성
				break;
			}
		}
	}


	//오름차순 정렬 (버블 정렬)
	for (int k = 0; k < SIZE; k++) {
		for (i = 0; i < SIZE - 1; i++) {
			if (lotto[i] > lotto[i + 1]) {
				int tmp = lotto[i];
				lotto[i] = lotto[i + 1];
				lotto[i + 1] = tmp;
			}
		}
	}

	//로또 번호 출력
	printf("\n\n		생성된 로또 번호는 [");
	for (i = 0; i < SIZE; i++)
		printf("%d ", lotto[i]);
	printf("] 입니다");

	system("pause>>null");
	return 0;
}

/*
void setting() {
	//콘솔창 설정
	system("title 로또 번호 생성기");
	system("mode con cols=80 lines=5");

	//커서 설정
	HANDLE consoleHandle = GetStdHandle(STD_OUTPUT_HANDLE);
	CONSOLE_CURSOR_INFO ConsoleCursor;
	ConsoleCursor.dwSize = 1;
	ConsoleCursor.bVisible = 0; //커서 숨기기
	SetConsoleCursorInfo(consoleHandle, &ConsoleCursor);
}
*/