#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int gcd(int x, int y) {
	if (y == 0)
		return x;
	else
		return gcd(y, x%y);
}

void main() {

	int gvalue;
	int a, b, again = 1;

	while (again) {
		printf("최대공약수를 구할 두 수를 입력하세요. ");
		scanf("%d %d", &a, &b);
		gvalue = gcd(a, b);
		printf("gcd(%d, %d) = %d\n\n", a, b, gvalue);
		printf("계속하실래요?(1/0)");
		scanf("%d", &again);
	}
}

void main(int argc, char * argv[]) {
	int i;
	printf("프로그램 명령 인수의 갯수는 %d\n", argc);
	for (i = 0; i < argc; i++) {
		printf("%d : %s\n", i, argv[i]);
	}
}

void main(int argc, char *argv[]) {
	int a, b, result, answer;
	int correct = 0, i = 0;
	FILE *infile;
	if (argc != 2) {
		printf("실행인수를 잘못 주었습니다...\n");
		exit(1);
	}

	if ((infile = fopen(argv[1], "r")) == NULL) {
		printf("입력 파일을 열 수 없습니다. \n");
		exit(1);
	}

	while (fscanf(infile, "%d %d", &a, &b) != EOF) {
		printf("%d : gcd(%d, %d) = ", i + 1, a, b);
		scanf("%d", &answer);
		result = gcd(a, b);
		if (answer != result) {
			printf("Answer : gcd(%d, %d) = %d \n", a, b, result);
		}
		else {
			printf("Correct....\n");
		}
		i++;
	}

	printf("%d 문제 중에 %d 문제 통과하셨습니다....\n", i, correct);
}

void main(int argc, char * argv[]) {
	int a, b, result, answer;
	int correct = 0, i = 0;
	FILE * infile, *out;
	if (argc != 3) {
		printf("실행인수를 잘못 주었습니다...\n");
		exit(1);
	}

	if ((infile = fopen(argv[1], "r")) == NULL) {
		printf("입력 파일을 열 수 없습니다. \n");
		exit(1);
	}

	if ((out = fopen(argv[2], "w")) == NULL) {
		printf("출력 파일을 열 수 없습니다. \n");
		exit(1);
	}

	while (fscanf(infile, "%d %d", &a, &b) != EOF) {
		printf("%d : gcd(%d, %d) = ", i + 1, a, b);
		scanf("%d", &answer);
		result = gcd(a, b);
		if (answer != result) {
			fprintf(out, "%d, %d\n", a, b);
			printf("Answer : gcd(%d, %d) = %d \n", a, b, result);
		}
		else {
			printf("Correct....\n");
			correct++;
		}
		i++;
	}
	printf("%d 문제 중에 %d 문제 통과하셨습니다....\n", i, correct);
}

void hanoi(int n, char a, char c, char b);
long count = 0;

void main() {
	int n;
	printf("Input the number of disk:");
	scanf("%d", &n);
	if (n <= 0)
		printf("\n No disk!!\n");
	else
		hanoi(n, 'A', 'C', 'B');
	printf("Moving count = %ld\n", count);
}

void hanoi(int n, char a, char c, char b) {
	if (n == 1) {
		count++;
		printf("Move disk from %c to %c\n", a, c);
	}
	else {
		hanoi(n - 1, a, b, c);
		hanoi(1, a, c, b);
		hanoi(n - 1, b, c, a);
	}
}