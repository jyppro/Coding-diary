#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

#define MAX 5

typedef struct {
	int job_num; //100, 90...
	char grade;  //A, B...
} element;

element queue[MAX];

int rear = 0;
int front = 0;

void caddq(element item);
element cdeleteq();

void caddq(element item)
{
	int next_rear = (rear + 1) % MAX;
	if (next_rear == front)
		printf("Queue is Full!!");
	else
	{
		rear = next_rear;
		queue[rear] = item;
	}
}

element cdeleteq()
{
	if (front == rear)
		printf("Queue is Empty!!");
	else
	{
		front = (front + 1) % MAX;
		return queue[front];
	}
}

int main()
{
	int n, i, out, cond = 1;
	element temp;
	while (cond)
	{
		printf("완료한 작업 수는?");
		scanf("%d", &n);
		printf("작업번호와 상태 입력: \n");
		for (i = 0; i < n; i++)
		{
			scanf("%d %c", &temp.job_num, &temp.grade);
			caddq(temp);
		}
		printf("출고할 작업 갯수?");
		scanf("%d", &out);
		for (i = 0; i < out; i++)
		{
			temp = cdeleteq();
			printf("%d %c 를 삭제함\n", temp.job_num, temp.grade);
		}
		printf("front = %d :: rear = %d\n", front, rear);
		printf("계속?(0/1)");
		scanf("%d", &cond);
	}
	return 0;
}
