#include<stdio.h>
int main()
{
	//알파벳 등장 횟수
	char input[1024] = { NULL, }; //input 배열에 NULL값으로 채우기
	//input[1024] = { 1, }; 은 첫번째칸에만 '1'
	printf("문자열 입력하세요.\n");
	gets(input);
	int charAlpha[26] = { 0 }; // 배열 전부 '0'으로채움
	// = { 0 }없으면 쓰레기값
	// 각 스펠링의 개수를 의미
	// [0]에10-> a가 10개 , [3]에5->d가5개
	for (int i = 0; input[i] != NULL; i++)
	{
		if (input[i] >= 'A' && input[i] <= 'Z')
		{
			input[i] += ('a' - 'A');
		}
		if (input[i] < 'a' || input[i] >'z')
		{
			// continue;
			printf("종료\n");
			return 0;
		}
		else {
			charAlpha[input[i] - 'a']++;
		}
	}
	for (int i = 0; i < 26; i++)
	{
		if (charAlpha[i] != 0) {
			printf(" '%c'는 %d글자입니다.\n",
				'a' + i, charAlpha[i]);
		}
	}

	return 0;
}