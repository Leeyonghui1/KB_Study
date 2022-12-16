#include<stdio.h>
struct Rectangle
{
	int width;
	int height;
}typedef Rectangle; // 다른 함수에서 Rectangle을 사용할 때 struct을 생략가능하게 해줌

int area(Rectangle r)
{
	return r.width * r.height;
}


int main()
{
	struct Rectangle r1;
	r1.width = 50;
	r1.height = 10;
	printf("넓이 : %d\n", r1.width * r1.height);
	
	Rectangle r2; // typedef 때문에 struct을 생략할수있다. 만약 typedef를 안썼다면 struct를 항상 붙여야한다.
	scanf_s("%d %d", &r2.width, &r2.height);
	printf("넓이 : %d\n", r2.width * r2.height);
	printf("넓이 : %d\n", area(r2)); // 함수호출

	Rectangle recs[3];
	recs[0] = r1;
	recs[1] = r2;
	recs[2].width = r1.width;
	recs[2].height = r2.height;
	

	return 0;
}