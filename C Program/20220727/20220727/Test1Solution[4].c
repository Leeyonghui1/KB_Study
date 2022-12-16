#include<stdio.h>
//4. 매개변수로 받아온 문자열의 길이를 리턴해보세요. (한글제외하고 영문이나 숫자만 생각할 것)
int length(char* str)
{
	// 문자열의 길이를 구하려면, 그 문자열이 끝날때 까지 반복문 돌림
	// 영문, 숫자, 특수문자, 공백은 모두 1byte
	// 한글이나 한자는 1글자당 2byte
	int len = 0;
	while (str[len] != '\0')
		len++;
	return len;
}

int main()
{
	char len[100];
	printf("문자열 입력 : ");
	gets(len);
	printf("문자열 길이 = %d", length(len));
	return 0;
}