#pragma once
// 3. �������� ����ü
// ���� �̸�, ���� ����, ���� ���� �ڵ�
struct MyStruct
{
	char name[100]; // ���� �̸�
	char species[100]; // ��, ����� ��..
	char code[100];
	// �ڵ� : ���� �̸� or ���� �����϶� �����ϱ� ���� ��ȣ����
	/*   �� code�� char Ÿ������ ���ڿ��� �����ߴ°�?
	- ���� �ڵ��ȣ�� '00007' �� ��
	intŸ�� ��� '7' Ȥ�� �̻��� ���� ����
	�׷��� charŸ������ ���ڿ��� �����Ͽ� '00007'�� �Է��Ҽ��ִ�.
	*/
}typedef Animal;

// 4. ����� ���� �ƹ� ����ü
struct Food
{
	int price;
	char name[100];
}typedef Food;
struct StudentScore
{
	int kor;
	int eng;
	int math;
}typedef StudentScore;

// 0729 �ǽ��� ����ü KBStudent
/* 
1. KBStudent ��� ����ü�� �����. �ȿ� ���� ������ �Ʒ��� ����.
int cScore, int javaScore, char name[100]
*/
struct KBStudent
{
	int cScore;
	int javaScore;
	char name[100];
}typedef KBStudent;