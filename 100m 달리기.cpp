#include "pch.h"
#include <stdio.h>

int main()
{
	float pos = 0.0f; /*거리*/
	float speed = 1.0f; /*속도*/
	
	while (pos <= 100)
	{	pos += speed;
	 printf("현재 위치는 %.2fm입니다.\n", pos);
	 { if (pos <= 50) 
		 speed += 1.0f;
	   if (pos > 50)
		 speed -= 0.5f;
	 }
	}

	printf("최종 거리는 %.2fm입니다.\n", pos);
	return 0;
}