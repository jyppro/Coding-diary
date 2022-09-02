#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>


int main() {
	int i, answer, score = 0, num, correct;
	for (i = 0; i < 5; i++) {
		correct = 0;
		num = 0;
		while (num < 3 && !correct) {
			printf("%d + %d = ", i*i, i * 10);
			scanf("%d", &answer);
			if (answer == (i*i) + (i * 10)) {
				printf("Correct!!\n");
				correct = 1;
				score += (20 - num * 3);
			}
			else {
				if (num != 2) printf("Try Again!!\n");
				else printf("Answer = %d\n", (i*i) + (i * 10));
			}
			num++;
		}
	}
	printf("덧셈성적은 %d\n", score);
}
