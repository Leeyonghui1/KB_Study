#include<stdio.h>
// void printYourName(char n[])  // 매개변수가 배열일때
void printYourName(char* n)  // 위와 동일한 의미 , 다른 표기방법
{
	printf("당신의 이름은 %s입니다.\n", n);
}

char* printABC()
{
	return "abc";
}

// 매개변수 없이 문자열을 입력받아서 리턴하고 싶을 땐?
char* returnMyInfo()
{
	static char mbti[5]; // static 없으면 오류 , static 있으면 정상출력
	printf("mbti?");
	gets(mbti);
	/* 
	'static' 없을때 mbti[5]는 스택영역에 존재한다. 함수가 끝나면 mbti[5]가 사라지기 때문에 return이 정상작동하지 않는다.
	'static' 있으면 데이터영역에 존재한다. 데이터영역에 존재하는것들은 프로그램이 끝날때 사라지기 때문에 return이 정상작동한다.
	*/
	return mbti;
}

char* returnMyMBTI(char* mbti)
{
	return mbti; // 매개변수로 받은 걸 그대로 리턴해보기
}

char* change(char name[]) // 또 다른 해결방법 , 함수안에서 다시 입력하기
{
	gets(name);
	return name;
}

int main()
{
	printf("이름 입력: ");
	char name[100];   //문자배열
	gets(name);       //문자입력
	printYourName(name);
	printf("%s\n", printABC());
	printf("%s\n", returnMyInfo());   // 쓰레기값이 나온다
	printf("%s\n", returnMyMBTI("ENFP"));
	printf("%s\n", returnMyMBTI(name));
	printf("%s\n", change(name));





	 printf("%c", print1ABC());  // char 함수 - %c  || char* 함수 - %s
	return 0;
}


 
char print1ABC()     // char타입 함수는 %c로 출력을 해야 오류가 안난다.
{
	return "abcD\n";
}
