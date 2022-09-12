//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//#include <stdlib.h>
//#define INUM 100
//int bsearch_stock(unsigned a[][2], int n, unsigned key);
//void print_item(char* heading, unsigned a[][2], int n);
//void bubble(unsigned a[][2], int n);
//
//void main(int argc, char* argv[])
//{
//	FILE* stockdb;
//	unsigned stock[INUM][2], item_code;
//	int k = 0, s;
//
//	if ((stockdb = fopen(argv[1], "r")) == NULL) {
//		printf("Cannot open read file.. ..\n"); exit(1);
//	}
//	while ((fscanf(stockdb, "%u %u", &stock[k][0], &stock[k][1])) != EOF)  k++;
//	print_item("임의로 저장된 물품코드 : \n", stock, k);
//
//	//물품코드의 내림차순으로 정렬
//	bubble(stock, k);
//	print_item("내림차순으로 정렬된 물품코드 : \n", stock, k);
//
//	// 검색
//	printf("검색할 item number 입력 : "); scanf("%u", &item_code);
//	s = bsearch_stock(stock, k, item_code);
//	if (s == -1) printf("재고물품이 없습니다\n");
//	else printf("%u의 재고개수 = %u\n", stock[s][0], stock[s][1]);
//
//}
//void print_item(char* heading, unsigned a[][2], int n)
//{
//	int i;
//	printf(heading);
//	for (i = 0; i < n; i++) printf("%u\n", a[i][0]);
//}
//
//int bsearch_stock(unsigned a[][2], int n, unsigned key)
//{
//	int left = 0, right = n - 1, mid;                   //선언문
//
//	while (left <= right) {
//		mid = (left + right) / 2;
//		if (key < a[mid][0]) left = mid + 1;
//		else if (key > a[mid][0]) right = mid - 1;
//		else return mid;              /* find */
//	} /* while */
//	return -1;     /* not exsit */
//} /* search */
//
//void bubble(unsigned a[][2], int n)
//{
//	int i = n - 1, j, flag = 1;
//	unsigned tmp0, tmp1;  //tmp 변수 하나만 사용해도 상관없음
//
//	while (flag && i != 0) {
//		flag = 0;
//		for (j = 0; j <= i - 1; j++) {
//			if (a[j][0] < a[j + 1][0]) {
//				flag = 1;
//				tmp0 = a[j][0]; a[j][0] = a[j + 1][0]; a[j + 1][0] = tmp0;
//				tmp1 = a[j][1]; a[j][1] = a[j + 1][1]; a[j + 1][1] = tmp1;
//			} //if
//		} //for
//		i--;
//	}
//}
//
//
//
