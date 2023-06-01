package com.myspring.step02_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {

	private Speaker speaker;

	@Autowired //setter메소드에 주입!
	public void setSpeaker(Speaker speaker) {
		System.out.println("===> setSpeaker 메소드 호출");
		this.speaker = speaker;
	}
	
	public LgTV() {
		System.out.println("===> LgTV 객체 생성");
	}

	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
