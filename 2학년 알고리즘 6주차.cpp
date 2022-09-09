#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>


int bsearch(int a[], int n, int key) { // 오름차순
	int mid;
	int left = 0, right = n - 1;
	while (left <= right) {
		mid = (left + right) / 2;
		if (key < a[mid]) mid = right - 1;
		else if (key > a[mid]) mid = left + 1;
		else return mid;
	}
	return -1;
}