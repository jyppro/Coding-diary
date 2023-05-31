package com.myspring.step02;

public class SamsungTV implements TV {
	private Speaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV1(step2) 객체 생성");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("===> SamsungTV2(step2) 객체 생성");
		this.speaker = speaker;
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