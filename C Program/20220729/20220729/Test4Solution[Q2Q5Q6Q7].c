#include<stdio.h>
//2. 3D 게임 캐릭터 좌표 저장하는 구조체
struct Gamge3DPos
{
	int x;
	int y;
	int z;
}typedef Game3DPos;
//typedef : struct Game3DPos를 Game3DPos로 정의한 것 - 즉 변수타입 struct 안적어도 됨

int main()
{
	Game3DPos g1 = { 10,20,30 };
	printf("z1 = %d x1 = %d y1 = %d\n", g1.z, g1.x, g1.y);
	
	Game3DPos g2 = { .z = 20, .x = 40, .y = 60 };
	printf("x2 = %d y2 = %d z2 = %d\n", g2.x, g2.y, g2.z);
	
	Game3DPos g3;
	g3.y = 10;
	g3.z = 15;
	g3.x = 20;
	printf("x3 = %d y3 = %d z3 = %d\n", g3.x, g3.y, g3.z);
	
	Game3DPos g4;
	scanf_s("%d %d %d", &g4.x, &g4.y, &g4.z);
	printf("x4 = %d y4 = %d z4 = %d\n", g4.x, g4.y, g4.z);
	
	return 0;
}