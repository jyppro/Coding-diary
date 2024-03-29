package com.myspring.step02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	@Autowired     //생성자나 메소드, 필드 위에 모두 사용 가능!
	private Speaker speaker;
	
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
