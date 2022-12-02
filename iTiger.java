package week05;

class iTiger extends Animal implements iAnimal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("멧돼지를 잡아먹는다");
	}

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("네 발로 이동한다");
	}
	
}
