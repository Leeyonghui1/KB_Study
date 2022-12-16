#include<stdio.h>
#include "Mystructs.h" // 구조체관련 헤더파일을 만들어서 사용

// 8번 .구조체 변수를 매개변수로 하는 함수형식
void printAnimal(Animal ani)
{
	printf("동물명 : %s\n", ani.name);
	printf("동물종 : %s\n", ani.species);
	printf("동물코드 : %s\n", ani.code);

}

// 9번. 리턴값이 구조체인 함수
Food FoodTruck()   // 반환값 구조체타입 | 함수명 FoodTruck | 매개변수 없음
{
	Food f;  // 구조체타입 변수 f
	printf("음식의 가격은?");
	scanf_s("%d", &f.price);
	printf("음식명?");
	rewind(stdin);
	gets(f.name);

	return f;
}

int main()
{
	//3번
	Animal a1 = { "햄토리", "뉴트리아","0001" };
	Animal a2 = { .name = "흰둥이", .species = "개",.code = "0002" };
	Animal a3;
	// 배열에 문자열을 입력할 때 'strcpy'함수 이용하기
	strcpy(a3.name, "피카츄");
	strcpy(a3.species, "쥐");
	strcpy(a3.code, "025");
	Animal a4;
	// 문자열 입력할 때 사용하는 'gets'
	gets(a4.name);
	gets(a4.species);
	gets(a4.code);

	printf("%s %s %s\n", a1.name, a1.species, a1.code);
	printf("%s %s %s\n", a2.name, a2.species, a2.code);
	printf("%s %s %s\n", a3.name, a3.species, a3.code);
	printf("%s %s %s\n", a4.name, a4.species, a4.code);
	// 8번 .구조체 변수를 매개변수로 하는 함수이용한 출력
	printAnimal(a1);
	printAnimal(a2);
	printAnimal(a3);
	printAnimal(a4);


	// 4번. 만들고 싶은 나만의 구조체(Food) 이용
	Food f1 = { 5500, "학식" };
	Food f2 = { .price = 70000, .name = "일식" };
	Food f3;
	f3.price = 50000;
	strcpy(f3.name, "한식");
	Food f4;
	scanf_s("%d", &f4.price);
	rewind(stdin);
	gets(f4.name);
	printf("음식 = %s, 가격 = %d\n", f1.name, f1.price);
	printf("음식 = %s, 가격 = %d\n", f2.name, f2.price);
	printf("음식 = %s, 가격 = %d\n", f3.name, f3.price);
	printf("음식 = %s, 가격 = %d\n", f4.name, f4.price);

	printf("푸드트럭 등장\n");
	Food myfood = FoodTruck();  // 구조체타입 변수 myfood = 함수 FoodTruck의 리턴값(구조체)
	printf("음식 = %s, 가격 = %d\n", myfood.name, myfood.price);

	return 0;
}