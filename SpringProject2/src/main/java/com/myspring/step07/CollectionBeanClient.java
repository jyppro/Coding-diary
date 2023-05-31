package com.myspring.step07;

import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {
	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContextStep07.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		
		Map<String, String> addressList = bean.getAddressList();		
		
		for( String key : addressList.keySet() ){
            System.out.println( String.format("키 : %s, 값 : %s", key, addressList.get(key)) );
        }
		
		factory.close();
	}
}
