#include<stdio.h>
#define MAX 1024 // 매크로 상수선언
// 배열크기를 미리 지정
int main()
{
	//알파벳 최초 등장위치
	char input[MAX] = { NULL, };
	printf("문자열 입력하세요.\n");
	gets(input);
	int charAlpha[26] = { 0 };

	for (int i = 0; input[i] != NULL; i++) 
	{
		if (input[i] >= 'A' && input[i] <= 'Z')
			input[i] += ('a' - 'A');
		if (input[i] < 'a' || input[i] > 'z')
			continue; //영문자만 체크 나머지 스킵
		else
		{
			if (charAlpha[input[i] - 'a'] == 0) //최초등장시
				charAlpha[input[i] - 'a'] = i + 1;
			//첫번째 등장시 0이아닌 1이 나와야하므로
			//i+1이어야한다
		}
	}

	for (int i = 0; i < 26; i++)
	{
		if (charAlpha[i] != 0)
			printf("%c는 %d번째 최초등장\n", 'a' + i, charAlpha[i]);
	}
	return 0;
}