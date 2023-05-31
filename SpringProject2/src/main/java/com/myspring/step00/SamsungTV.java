package com.myspring.step00;

class SamsungTV implements TV {
	SamsungTV(){
		System.out.println("SamsungTV 객체 생성");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---전원 켠다.");
	}

	public void powerOff() {
		System.out.println("SamsungTV---전원 끈다.");
	}

	 public void volumeUp() {
		System.out.println("SamsungTV---소리 올리다.");
	}

	public void volumeDown() {
		System.out.println("SamsungTV---소리 내리다.");
	}
	

}