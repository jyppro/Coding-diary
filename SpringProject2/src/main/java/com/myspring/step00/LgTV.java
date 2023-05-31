package com.myspring.step00;

public class LgTV implements TV{
	LgTV(){
		System.out.println("LgTV 객체 생성");
	}
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		System.out.println("LgTV---소리 올리다.");
	}

	public void volumeDown() {
		System.out.println("LgTV---소리 내린다.");
	}
}
