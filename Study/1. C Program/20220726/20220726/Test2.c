#include<stdio.h>
void swap(int* a, int* b, int* c)
{
	int temp = *a;
	*a = *b;
	*b = *c;
	*c = temp;
}
int main()
{
	int a, b, c;
	scanf_s("%d %d %d", &a, &b, &c);
	printf("Ω√¿€ a = %d, b = %d, c= %d\n", a, b, c);
	
	int* pa = &a;
	int* pb = &b;
	int* pc = &c;
	for (int i = 0; i < 3; i++)
	{
		swap(pa, pb, pc);
		printf(" a = %d, b = %d, c= %d\n", a, b, c);
	}

	printf("≥° a = %d, b = %d, c= %d\n", a, b, c);

	return 0;
}