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

	printf("�簢��1�� ���� = %d * %d\n", r.width, r.height);
	return r.width * r.height;
}

int area_Rectangle2()
{
	struct Rectangle r;
	printf("�簢��2�� width : ");
	scanf_s("%d", &r.width);
	printf("�簢��2�� height : ");
	scanf_s("%d", &r.height);

	printf("�簢��2�� ���� = %d * %d\n", r.width, r.height);
	return r.width * r.height;
}


int main()
{
	printf("�簢��1�� ���̴� %3d�Դϴ�.\n", area_Rectangle1());

	printf("�簢��2�� ���̴� %3d�Դϴ�.\n", area_Rectangle2());
	return 0;
}