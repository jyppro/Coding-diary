//#include <stdio.h>
//
//void insertion(int a[], int n);
//
//
//void main()
//{
//    int list[] = { 12, 17, 25, 33, 48, 52, 86, 37, 100, 70 };
//    int i, n;
//
//    n = sizeof(list) / sizeof(int);
//    insertion(list, n);
//    printf("정렬된 데이터 리스트: \n");
//    for (i = 0; i < n; i++)
//        printf("%d ", list[i]);
//}
//
//
//void insertion(int a[], int n)
//{
//    int i, j, idata;
//
//    for (i = 1; i <= n - 1; i++) {
//        idata = a[i];
//        j = i - 1;
//        while (a[j] > idata && j >= 0) {
//            a[j + 1] = a[j];
//            j--;
//        }
//        a[j + 1] = idata;
//    }
//}
