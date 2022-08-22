#include "pch.h"
#include <stdio.h>

int main()
{
	double height;
	double weight;
	double bmi;

	printf("********* BMI(체질량 지수) ***********\n\n");

	printf("체중(kg) 입력:");
	scanf_s("%lf", &weight);
	printf("키(m^2) 입력:");
	scanf_s("%lf", &height);

	height = height / 100;
	bmi = weight / (height * height);

	if (bmi < 18.6)
		printf("당신의 BMI는%.1f이므로, 저체중 입니다.\n", bmi);
	else if (bmi < 23)
		printf("당신의 BMI는%.1f이므로, 정상 입니다.\n", bmi);
	else if (bmi < 25)
		printf("당신의 BMI는%.1f이므로, 과체중 입니다.\n",bmi);
	else if (bmi < 30)
		printf("당신의 BMI는%.1f이므로, 비만 입니다.\n",bmi);
	else if (bmi < 40)
		printf("당신의 BMI는%.1f이므로, 고도비만 입니다.\n",bmi);
	

	return 0;
}
