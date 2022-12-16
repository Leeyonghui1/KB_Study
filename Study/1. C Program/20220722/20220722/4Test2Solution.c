#include<stdio.h>
//실습4 1&2번 문제풀이
struct Mystruct
{
	int width;
	int height;
}typedef Rectangle; // 원래 이름이 뭔지 상관없고 정의된 이름으로 부르거나 원래 이름으로 부를 수 있다.


int main()
{

	Rectangle recs[5];
	for (int i = 0; i < 5; i++)
	{
		printf("사각형의 width와 height 입력하기");
		scanf_s("%d %d", &recs[i].width, &recs[i].height);
	}
	Rectangle maxRec = recs[0];
	for (int i = 0; i < 5; i++)
	{
		// 음수 예외처리1
		if (recs[i].width < 0 || recs[i].height < 0)
			continue;
		int area = recs[i].width * recs[i].height;
		int maxRecArea = maxRec.width * maxRec.height;
		if (maxRecArea < area)
			maxRec = recs[i];
	}
	// 음수 예외처리2
	if (maxRec.width >= 0 && maxRec.height >= 0)
	{
		printf("가장 넓은 사각형의 width:%d, height:%d\n",
		maxRec.width, maxRec.height);
	}



	return 0;
}