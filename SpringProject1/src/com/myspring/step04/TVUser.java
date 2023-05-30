package com.myspring.step04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TVUser {

	public static void main(String[] args) throws FileNotFoundException {
		  FileInputStream fis=new FileInputStream("src/com/myspring/step04/diSetting.txt");
		   Scanner scan=new Scanner(fis);
		   String className=scan.nextLine();
		   
		   BeanFactory factory = new BeanFactory();
		   TV tv=(TV)factory.getBean(className);
		   tv.powerOn();
		   tv.volumeUp();
		   tv.volumeDown();
		   tv.powerOff();
	}
}
