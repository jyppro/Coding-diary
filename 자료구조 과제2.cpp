
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

typedef struct member {
	int id;
	char name[20];
	float score;
} example;

int over40(example* a, int n);
example find_max(example* a, int n);

void main() {
	example onep, exmember[20];
	int i, n;

	printf("Input the number of data : ");
	scanf("%d", &n);
	for (i = 0; i < n; i++)
	{
		printf("학번_이름_점수: ");
		scanf("%d %s %f", &exmember[i].id, exmember[i].name, &exmember[i].score);
	}
	printf("40점이 넘는 학생은 %d명입니다\n", over40(exmember, n));
	onep = find_max(exmember, n);
	printf("Highest score student: %d %s %.2f\n", onep.id, onep.name, onep.score);
}

int over40(example * a, int n)
{
	int i, count = 0;
	for (i = 0; i < n; i++)
	{
		if (a[i].score > 40)
		{
			count += 1;
		}
	}
	return count;
}

example find_max(example * a, int n)
{
	int idx = 0;
	int i;
	for (i = 1; i < n; i++)
	{
		if (a[i].score > a[idx].score)
		{
			idx = i;
		}
	}
	return a[idx];
}
