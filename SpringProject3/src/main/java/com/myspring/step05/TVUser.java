package com.myspring.step05;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class TVUser {

	public static void main(String[] args) {
		
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		TV tv = (TV) factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();

		// 3. Spring 컨테이너를 종료한다.
		factory.close();
	}
}
