#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int number;

static int min;
static int max;

void setNumber();
void printHead();
void printHigher(int x);
void printLower(int x);
void printAnswer();

int main()
{
	srand(time(NULL));
	setNumber();

	int input;

	while (1) {

		printHead();
		scanf_s("%d", &input);

		if (input == number) {
			printAnswer();
			break;
		}
		else {
			if (input > number) {
				printHigher(input);
			}
			else {
				printLower(input);
			}
		}
	}

	return 0;
}

void setNumber() {
	number = rand() % 100 + 1;
}

void printHead() {
	printf("1~100 사이의 숫자를 입력하세요.\n");
}

void printHigher(int x) {
	max = x;
	printf("%d 보다 작습니다.\n", x);
}
void printLower(int x) {
	min = x;
	printf("%d 보다 큽니다.\n", x);
}
void printAnswer(int x) {
	min = x;
	printf("정답입니다.\n");
}

