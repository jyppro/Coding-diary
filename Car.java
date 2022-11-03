public class Car {
	String color;
	int speed;
	
	// (static)��ü�� ������ �ʰ�, Ŭ������ ����
	static int carCount = 0;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	
	static int currentCarCount() {
		return carCount;
	}
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
		carCount++;  //this. �Ⱦ�
	}
	
	Car(int speed){
		this.speed = speed;
	}
	
	Car(){
		
	}
	
	public static void main(String args[]) {
		Car myCar1 = new Car("����",0);
		
		Car myCar2 = new Car("�Ķ�",0);
		
		Car myCar3 = new Car("�ʷ�",0);
		
	myCar1.upSpeed(50);
	System.out.println("�ڵ���1�� ������" + myCar1.getColor()
	+ "�̸�, �ӵ��� " + myCar1.getSpeed() + "km�Դϴ�.");
	
	myCar2.upSpeed(20);
	System.out.println("�ڵ���2�� ������" + myCar2.getColor()
	+ "�̸�, �ӵ��� " + myCar2.getSpeed() + "km�Դϴ�.");
	
	myCar3.upSpeed(250);
	System.out.println("�ڵ���3�� ������" + myCar3.getColor()
	+ "�̸�, �ӵ��� " + myCar3.getSpeed() + "km�Դϴ�.");
	}
	int getSpeed() {
		return speed;}
	void upSpeed(int value) {
		if(speed + value >= 200)
			speed = 200;
		else
			speed = speed + value;}
	void downSpeed(int value) {
		if(speed - value <= 0)
			speed = 0;
		else
			speed = speed - value;}
	String getColor() {
		return color;
		}
}