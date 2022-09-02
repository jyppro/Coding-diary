#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <malloc.h>
#include <string.h>

typedef struct cnode *npointer;
struct cnode {
 int num;
 char score;
 npointer link;
};
npointer head = NULL;

void insert_front(npointer node)
{
 if (!head) {
  node->link = node;
  head = node;
 }
 else {
  node->link = head->link;
  head->link = node;
 }
}

void c_print(){
	npointer temp = head;
	if (head) {
		do {
			temp = temp->link;
			printf("%d : %c\n", temp->num, temp->score);
		} while (temp != head);
	}
}

int how_many(npointer head)
{
 npointer temp;
 int count = 0;

 if (head) {
  temp = head;
  do {
   count++;
   temp = temp->link;
  } while (temp != head);
 }
 return count;
}

int main()
{
 int cond = 1, i;
 npointer temp;

 while (cond) {
  temp = malloc(sizeof(struct cnode));
  printf("Enter id and score :");
  scanf("%d %c", &(temp->num), &(temp->score));
  insert_front(temp);
  printf("Countinue?(0/1) :");
  scanf("%d", &cond);
 }
 c_print();
 printf("노드개수 : %d\n", how_many(head));
 system("pause");
}









#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <malloc.h>

typedef struct node *node_pointer;

struct node {
	node_pointer llink;  //left node
	int id;
	char score;
	node_pointer rlink;  //right node
};
struct node head = { &head, 0, 0, &head };

void dinsert(node_pointer node, node_pointer newnode)
{
	/* newnode를 node의 오른쪽에 삽입*/
	newnode->llink = node;
	newnode->rlink = node->rlink;
	node->rlink->llink = newnode;
	node->rlink = newnode;
}

void ddelete(node_pointer node, node_pointer deleted)
{
	/*head node가 "node" 인 이중 연결 리스트에서 삭제*/
	if (node == deleted)
		printf("Deletion of head node not permitted.\n");
	else {
		deleted->llink->rlink = deleted->rlink;
		deleted->rlink->llink = deleted->llink;
		free(deleted);
	}
}

void dprint()
{
	node_pointer node = head.rlink;

	while (node != &head)
	{
		printf("%d %c\n", node->id, node->score);
		node = node->rlink;
	}
}

int main()
{
	node_pointer newnode;
	int i;

	//node 3개 입력
	for (i = 0; i < 3; i++)
	{
		newnode = (node_pointer)malloc(sizeof(struct node));
		printf("id와 score 입력: ");
		scanf("%d %c", &newnode->id, &newnode->score);
		dinsert(&head, newnode);
	}
	printf("삽입후 출력:\n");
	dprint();

	//node 1개 삭제
	printf("\n\n삭제후출력:\n");
	ddelete(&head, head.rlink);
	dprint();
}
