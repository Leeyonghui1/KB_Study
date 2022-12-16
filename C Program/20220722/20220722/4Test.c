#include<stdio.h>
struct Rectangle
{
	int width;
	int height;
};

int area_Rectangle1()
{
	struct Rectangle r;
	r.width = 3;
	r.height = 5;

	printf("사각형1의 넓이 = %d * %d\n", r.width, r.height);
	return r.width * r.height;
}

int area_Rectangle2()
{
	struct Rectangle r;
	printf("사각형2의 width : ");
	scanf_s("%d", &r.width);
	printf("사각형2의 height : ");
	scanf_s("%d", &r.height);

	printf("사각형2의 넓이 = %d * %d\n", r.width, r.height);
	return r.width * r.height;
}


int main()
{
	printf("사각형1의 넓이는 %3d입니다.\n", area_Rectangle1());

	printf("사각형2의 넓이는 %3d입니다.\n", area_Rectangle2());
	return 0;
}