#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
	int n, i, x, allzero = 1;
	long mult = 1;

	printf("Enter the number of to be processed :");
	scanf("%d", &n);
	printf("Enter %d numbers : ", n);
	for (i = 0; i < n; i++) {
		scanf("%d", &x);
		if (x != 0) {
			mult *= x;
			allzero = 0;
		}
	}
	if (allzero) mult = 0;
	printf("Answer = %d\n", mult);
}


#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define DMAX 100

void main() {
	int scores[DMAX], n, i, sum, over_count;
	double avg;

	sum = 0;
	printf("The number of data to be processed\n");
	scanf("%d", &n);
	printf("Enter %d data : \n", n);
	for (i = 0; i < n; i++) {
		scanf("%d", &scores[i]);
		sum = sum + scores[i];
	}
	avg = (double)sum / n;
	printf("Average = %.2f\n", avg);

	over_count = 0;
	for (i = 0; i < n; i++) {
		if (scores[i] > avg) over_count++;
	}
	printf("over average = %d\n", over_count);
}

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define NUM 100

void main() {
	int i, scores[NUM][2], sid, jumsu, rank, n;
	printf("Enter n :");
	scanf("%d", &n);
	printf("Input id and score : \n");
	for (i = 0; i < n; i++)
		scanf("%d %d", &scores[i][0], &scores[i][1]);
	printf("Input student id to be search :");
	scanf("%d", &sid);
	for (i = 0; i < n; i++)
		if (sid == scores[i][0]) {
			jumsu = scores[i][1];
			break;
		}
	rank = 0;
	for (i = 0; i < n; i++)
		if (scores[i][1] > jumsu) rank++;
	printf("%d번의 점수 : %d\n", sid, jumsu);
	printf("%d번의 등수 : %d\n", sid, rank + 1);
}


#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

long example(int n) {
	int i, x, allzero = 1;
	long mult = 1;

	for (i = 0; i < n; i++) {
		scanf("%d", &x);
		if (x != 0) {
			mult *= x;
			allzero = 0;
		}
	}
	if (allzero) mult = 0;
	return mult;
}

int pcount(int a[]) {
	int j, result = 0;
	for (j = 0; j < 10; j++) {
		if (a[j] > 0) {
			result++;
		}
		return result;
	}
}

void main() {
	int data[10], k;

	printf("Enter 10 data :");
	for (k = 0; k < 10; k++) {
		scanf("%d", &data[k]);
		printf("양의 갯수는 %d\n", pcount(data));
	}
}


#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define DNUM 100
int pcount(int a[], int n);
double avg(int a[], int n);
int large(int a[], int n);
int small(int a[], int n);

void main() {
	int data[DNUM], k, n;
	printf("처리할 데이터의 수 :");
	scanf("%d", &n);
	printf("%d개의 정수를 입력하세요. ", n);
	for (k = 0; k < n; k++) {
		scanf("%d", &data[k]);
	}
	printf("양의 갯수는 %d\n", pcount(data, n));
	printf("데이터 평균 %.2f\n", avg(data, n));
	printf("최대값 = %d\n", large(data, n));
	printf("최소값 = %d\n", small(data, n));
}

int small(int a[], int n) {
	int imin = a[0], i;
	for (i = 1; i < n; i++) {
		if (a[i] < imin) {
			imin = a[i];
		}
	}
	return imin;
}

int large(int a[],int n) {
	int i, max;
	max = a[0];
	for (i = 1; i < n; i++) {
		if (a[i] > max) {
			max = a[i];
		}
	}
	return max;
}

int pcount(int a[], int n) {
	int j, result = 0;
	for (j = 0; j < n; j++) {
		if (a[j] > 0) {
			result++;
		}
	}
	return result;
}

double avg(int a[], int n) {
	int i, sum = 0;

	for (i = 0; i < n; i++) {
		sum = sum + a[i];
	}
	return (double)sum / n;
}

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define NUM 30
double find_avg(int sdata[][2],int n);
int find_max(int sdata[][2],int n);
int find_rank(int sdata[][2], int n, int sid);

void main() {
	int scores[NUM][2], i, n, sid;
	printf("성적을 입력할 학생의 수를 입력하시오 :");
	scanf("%d", &n);
	printf("학번과 성적을 입력하시오 :\n");
	for (i = 0; i < n; i++) {
		scanf("%d %d", &scores[i][0], &scores[i][1]);
	}
	printf("성적의 평균 : %.2f\n", find_avg(scores, n));
	printf("성적의 최고점 : %d\n", find_max(scores, n));

	printf("등수를 검색할 학생의 학번을 입력하시오 :");
	scanf("%d", &sid);
	printf("%d학번의 등수 : %d등\n", sid, find_rank(scores, n, sid));
}

double find_avg(int sdata[][2], int n) {
	int i;
	double avg = 0;

	for ( i = 0; i < n; i++){
		avg = avg + sdata[i][1];
	}
	avg = avg / n;
	return avg;
}

int find_max(int sdata[][2], int n) {
	int i, max;

	max = sdata[0][1];
	for (i = 0; i < n; i++) {
		if (sdata[i][1] > max) {
			max = sdata[i][1];
		}
	}
	return max;
}

int find_rank(int sdata[][2], int n, int sid) {
	int i, jumsu, rank = 1;

	for (i = 0; i < n; i++) {
		if (sid == sdata[i][0]) {
			jumsu = sdata[i][1];
			break;
		}
	}
		for (i = 0; i < n; i++) {
			if (sdata[i][1] > jumsu) {
				rank++;
			}
		}
	return rank;
}