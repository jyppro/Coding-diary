#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define MAX_CNUM 50

void selection_sort(int a[], int n);
void print_data(int a[], int n);

void main(){
	int list[] = { 40, 30, 80, 70, 100, 10, 90, 20, 170, 60, 80 };
	int n = sizeof(list) / sizeof(int);
	print_data(list, n);
	selection_sort(list, n);
	printf("\n --------------------------------  \n");
	print_data(list, n);
} /* main */

void print_data(int a[], int n){
	int i;
	for (i = 0; i < n; i++)
		printf("%d [%d] \n", i, a[i]);
} /* display */

void selection_sort(int list[], int n) {
	int s, m, j;
	int temp;

	for (s = 0; s < n-1; s++) {
		m = s;
		for (j = s + 1; j < n; j++) {
			if (list[j] < list[m]) m = j;
		}
		temp = list[s]; list[s] = list[m]; list[m] = temp;
	} /* for */
} /* sort */



typedef struct member {
	int id;
	char name[20];
	float score;
} example;

void over40(example * a, int n);
example find_max(example * a, int n);

void main() {
	example onep, exmember[20];
	int i, n;

	printf("\nInput the number of data: ");
	scanf("%d", &n);

	for (i = 0; i < n; i++) {
		printf("데이터 입력: ");
		scanf("%d  %s  %f", &exmember[i].id, exmember[i].name, &exmember[i].score);
	}
	over40(exmember, n);
	onep = find_max(exmember, n);

	printf("Information of the highest score student  = %d: %s: %.2f\n", onep.id, onep.name, onep.score);
}

void over40(example a[], int n) {
	int k;

	printf("List of high score students(over 4.0)\n ");
	for (k = 0; k < n; k++)
		if (a[k].score > 4.0)
			printf("%d -- %s\n", a[k].id, a[k].name);
}

example find_max(example a[], int n) {
	int k, max_index;

	max_index = 0;

	for (k = 1; k < n; k++)
		if (a[k].score > a[max_index].score)
			max_index = k;

	return a[max_index];
}



typedef struct course {
	char courseid[10];
	char tname[20];
	unsigned snum;
	unsigned roomnum;
} cinform;

void main(int argc, char * argv[]) {
	int i = 0, dnum;
	char sprof[20];
	unsigned sroomnum;
	cinform cdb[MAX_CNUM];
	FILE * coursedb;

	if ((coursedb = fopen(argv[1], "r")) == NULL) {
		printf("데이터 파일을 열 수 없습니다 \n");
		exit(1);
	}
	while (fscanf(coursedb, "%s %s %u %u", cdb[i].courseid, cdb[i].tname, &(cdb[i].snum), &(cdb[i].roomnum)) != EOF)
		i++;
	dnum = i;
	printf("수강인원이 40명 이상인 강좌 코드 번호를 출력하시오.\n");
	for (i = 0; i < dnum; i++)
		if (cdb[i].snum >= 40) printf("%s\n", cdb[i].courseid);

	printf("검색하고자 하는 교수이름 입력: ");
	scanf("%s", sprof);
	printf("%s 교수가 강의하는 강좌 코드와 강의실 번호를 출력하시오.\n", sprof);

	for (i = 0; i < dnum; i++)
		if (!strcmp(cdb[i].tname, sprof))
			printf("%s\t%u\n", cdb[i].courseid, cdb[i].roomnum);

	printf("검색하고자 하는 강의실 번호 입력: ");
	scanf("%u", &sroomnum);
	printf("%u 강의실에서 수업하는 강좌 코드와 담당 교수를 출력하시오.\n", sroomnum);


	for (i = 0; i < dnum; i++)
		if (cdb[i].roomnum == sroomnum)
			printf("%s\t%s\n", cdb[i].courseid, cdb[i].tname);
	fclose(coursedb);
}