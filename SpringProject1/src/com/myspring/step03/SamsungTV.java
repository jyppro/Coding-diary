package com.myspring.step03;

class SamsungTV implements TV {
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