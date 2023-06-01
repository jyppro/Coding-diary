package com.myspring.step04_1;

import org.springframework.stereotype.Component;


public class SamsungTV implements TV {
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 메소드 호출");
		this.speaker = speaker;
	}

	public SamsungTV() {
		System.out.println("===> SamsungTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
	
}