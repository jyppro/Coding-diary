package com.myspring.step00;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class TVUser {

	public static void main(String[] args) {
		AbstractApplicationContext factory =new GenericXmlApplicationContext("applicationContext.xml");
		TV tv1=(TV) factory.getBean("tv");
		tv1.powerOn();
		tv1.volumeUp();
		tv1.volumeDown();
		tv1.powerOff();
		factory.close();
    }
}
