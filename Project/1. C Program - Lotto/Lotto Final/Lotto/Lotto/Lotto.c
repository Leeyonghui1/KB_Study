#include<stdio.h>
#include <stdlib.h>
#include <time.h>
#include<Windows.h>

// 매크로상수 선언
#define size 6
#define max 7

// 전역변수 설정
int lotto[size];
int sum = 0;
int average = 0;
int win_Lotto[max];
int count = 0;
int m;

void setColor(int colorNum) //텍스트 색깔 넣기
{
	SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), colorNum);
}

int choice_Mode()  // 모드 1,2를 선택하세요
{
	printf(" 다음 중 하나를 선택하세요.\n");
	printf(" 1. 이번 회차 당첨 확인\n");
	printf(" 2. 다음 회차 번호 생성\n");
	printf(" 모드 선택 (1 or 2)");
	scanf_s("%d", &m);

	return m;
}

void enter_MyNum()  // 나의 로또 번호 입력
{
	for (int i = 0; i < size; i++)
	{
		scanf_s("%d", &lotto[i]);
	}
}

void start_Lottery(int m)    // choice_Mode 함수에서 얻은 반환값 'm'값을 매개변수로 하는 함수
{
	if (m == 1)   // 이번 회차 로또 당첨 확인 모드
	{
		system("cls");
		printf("                        이번 회차 로또 당첨 번호\n");
		printf("\n---------------------------------------------------------------------------\n");
		for (int i = 0; i < max; i++)
		{
			scanf_s("%d", &win_Lotto[i]);
		}
		for (int i = 0; i < max; i++)
		{
			if (i == 6)
			{
				printf(" 보너스번호 = %d \n", win_Lotto[6]);
			}
			else
			{
				printf(" %d번 = %d ", i + 1, win_Lotto[i]);
			}
		}
		printf("\n---------------------------------------------------------------------------\n");
	}
	if (m == 2)  // 다음 회차 로또 번호 생성 모드
	{
		system("cls");
		printf("                        이전 회차 로또 당첨 번호\n");
		printf("\n---------------------------------------------------------------------------\n");
		for (int i = 0; i < max; i++)
		{
			scanf_s("%d", &win_Lotto[i]);
		}
		for (int i = 0; i < max; i++)
		{
			if (i == 6)
			{
				printf(" 보너스번호 = %d ", win_Lotto[6]);
			}
			else
			{
				printf(" %d번 = %d ", i + 1, win_Lotto[i]);
			}
		}
		printf("\n---------------------------------------------------------------------------\n");
	}
}

void make_Lotto() // 랜덤 로또번호 생성함수(중복제거포함)
{
	for (int i = 0; i < size; i++)
	{   // 로또번호 랜덤생성
		lotto[i] = (rand() % 45) + 1;
		// 중복제거
		for (int j = 0; j < i ; j++)
		{
			if (lotto[i] == lotto[j])
			{
				i--;
				break;
			}
		}
	}
}

void limit_Num() // 한자리 숫자는 최대 2개
{
	while (lotto[2] < 10)
	{
		lotto[2] = (rand() % 45) + 1;
	}
}

void change_OdEv()  // 로또 번호 4번째에서 이전 회차 대비 홀짝 변화
{
	if (win_Lotto[3] % 2 != 0)  // 만약 이전 회차 4번 숫자가 홀수인데
	{
		if (lotto[3] % 2 != 0)  // 생성된 다음 회차 로또 4번 숫자도 홀수라면
		{
			while (lotto[3] % 2 != 0)  // 짝수가 나올 때 까지 번호 생성 반복
			{
				lotto[3] = (rand() % 45) + 1;
			}
		}
	}
	else              // 이외에 이전 회차 4번 숫자가 짝수고
	{
		if (lotto[3] % 2 == 0) // 생성된 다음 회차 로또 4번 숫자가 짝수라면
		{
			while (lotto[3] % 2 == 0) // 홀수가 나올 때 까지 번호 생성 반복
			{
				lotto[3] = (rand() % 45) + 1;
			}
		}
	}
}

void bubble_Lotto() // 버블정렬(오름차순정렬)
{
	for (int k = 0; k < size; k++)
	{
		for (int i = 0; i < size - 1; i++)
		{
			if (lotto[i] > lotto[i + 1])
			{
				int tmp = lotto[i];
				lotto[i] = lotto[i + 1];
				lotto[i + 1] = tmp;
			}
		}
	}
}

void del_Lotto()  // 중복 제거
{
	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < i; j++)
		{
			if (lotto[j] == lotto[i])
			{
				i--;
				break;
			}
		}
	}
}

int check_average_Lotto() // 숫자 6개 평균값 확인 
{
	for (int i = 0; i < 6; i++)
	{
		sum += lotto[i];
		average = sum / 6;
	}
	printf("평균값 = %d  ", average);
	return average;
}

void replay_Lotto(int average)  // 목표 평균값범위는 14이상 34이하, 범위 벗어나면 다시 번호 생성
{
	if (average < 14 || average > 34)
	{
		for (int i = 0; i < size; i++)
		{
			lotto[i] = 0;
		}
		system("cls");
		printf("번호 생성을 다시 시작합니다.\n");
		printf("                            로또 당첨 번호\n");
		printf("\n---------------------------------------------------------------------------\n");
		for (int i = 0; i < max; i++)
		{
			if (i == 6)
			{
				printf(" 보너스번호 = %d ", win_Lotto[6]);
			}
			else
			{
				printf(" %d번 = %d ", i + 1, win_Lotto[i]);
			}
		}
		printf("\n---------------------------------------------------------------------------\n");
	}
}

void print_Num_m1() // 모드1번 번호 출력
{
	for (int i = 0; i < size; i++)
	{
		printf(" %d번 = %d ", i + 1, lotto[i]);
	}
}

void print_Num_m2() // 모드2번 번호 출력
{
	for (int i = 0; i < size; i++)
	{
		printf("%d번 = %d ", i + 1, lotto[i]);
		if (win_Lotto[3] % 2 != 0)
		{
			if (lotto[3] % 2 != 0)
			{
				system("cls");
				printf("번호 생성을 다시 시작합니다.\n");
				printf("                            로또 당첨 번호\n");
				printf("\n---------------------------------------------------------------------------\n");
				for (int i = 0; i < max; i++)
				{
					if (i == 6)
					{
						printf(" 보너스번호 = %d ", win_Lotto[6]);
					}
					else
					{
						printf(" %d번 = %d ", i + 1, win_Lotto[i]);
					}
				}
				printf("\n---------------------------------------------------------------------------\n");
			}
		}
		else
		{
			if (lotto[3] % 2 == 0)
			{
				system("cls");
				printf("번호 생성을 다시 시작합니다.\n");
				printf("                            로또 당첨 번호\n");
				printf("\n---------------------------------------------------------------------------\n");
				for (int i = 0; i < max; i++)
				{
					if (i == 6)
					{
						printf(" 보너스번호 = %d ", win_Lotto[6]);
					}
					else
					{
						printf(" %d번 = %d ", i + 1, win_Lotto[i]);
					}
				}
				printf("\n---------------------------------------------------------------------------\n");
			}
		}
	}
}

int end_Lottoery() // 맞춘 숫자 개수 확인
{
	for (int i = 0; i < size; i++)
	{
		if (lotto[i] == win_Lotto[6])
		{
			setColor(2);
			printf("\n보너스 번호");
			setColor(7);
			printf(" 맞춤 ");
		}
		for (int j = 0; j < size; j++)
		{
			if (lotto[i] == win_Lotto[j])
			{
				count += 1;
			}
		}
	}
	printf("\n%d개 맞춤 ", count);
	return count;
}

void rank_Lotto(int count)  //등수 확인
{
	switch (count)
	{
	case 6:setColor(6); printf("1등"); setColor(7); printf("입니다."); break;
	case 5:setColor(2); printf("2등 or 3등"); setColor(7); printf("입니다.[");
		setColor(2); printf("보너스번호 "); setColor(7); printf("확인하세요] ."); break;
	case 4:setColor(9); printf("4등"); setColor(7); printf("입니다."); break;
	case 3:setColor(8); printf("5등"); setColor(7); printf("입니다."); break;
	default: setColor(4); printf("꽝"); setColor(7); printf("입니다."); break;
	}
}


int main()
{
	srand(time(NULL));  // 현재시간을 변수로 하여 새로운 난수생성
	choice_Mode();  // 모드 1,2 선택하기
	start_Lottery(m); // 당첨된 로또 번호 입력

	while (m == 1) // 이번 회차 로또 당첨 확인
	{
		printf("\n                      나의 로또 번호  ");
		printf("\n******************************************************************\n");

		enter_MyNum();   // 나의 번호 입력
  		print_Num_m1();    // 숫자 출력
		end_Lottoery();  // 맞춘 개수 확인
		rank_Lotto(count);  // 등수 확인 및 출력

		printf("\n******************************************************************\n");
		break;
	}
	while (m == 2) // 다음 회차 로또 번호 생성
	{
		printf("\n                        나의 생성 로또 번호  ");
		printf("\n******************************************************************\n");

		sum = 0;
		average = 0;
		count = 0;

		make_Lotto();    // 로또 번호 생성
		bubble_Lotto();  // 오름차순 정렬
		change_OdEv();  // 나만의 조건[1] : 로또 번호 4번에서 이전 회차 대비 홀짝 변화필요
		del_Lotto();    // 중복제거
		bubble_Lotto(); // 오름차순 정렬
		limit_Num();     // 나만의 조건[2] : 한 자리 숫자는 최대 2개
		del_Lotto();    // 중복제거
		bubble_Lotto(); // 오름차순 정렬
		check_average_Lotto();  // 생성된 로또 번호 6개의 평균값 확인
		print_Num_m2();     // 숫자 출력
		printf("\n******************************************************************\n");
		replay_Lotto(average);  // 나만의 조건[3] : 평균값 목표범위는 14이상 34이하
		
		system("pause");
	}
	return 0;
}
