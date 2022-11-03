public class Car {
	String color;
	int speed;
	
	// (static)객체에 속하지 않고, 클래스에 속함
	static int carCount = 0;
	final static int MAXSPEED = 200;
	final static int MINSPEED = 0;
	
	static int currentCarCount() {
		return carCount;
	}
	
	Car(String color, int speed){
		this.color = color;
		this.speed = speed;
		carCount++;  //this. 안씀
	}
	
	Car(int speed){
		this.speed = speed;
	}
	
	Car(){
		
	}
	
	public static void main(String args[]) {
		Car myCar1 = new Car("빨강",0);
		
		Car myCar2 = new Car("파랑",0);
		
		Car myCar3 = new Car("초록",0);
		
	myCar1.upSpeed(50);
	System.out.println("자동차1의 색상은" + myCar1.getColor()
	+ "이며, 속도는 " + myCar1.getSpeed() + "km입니다.");
	
	myCar2.upSpeed(20);
	System.out.println("자동차2의 색상은" + myCar2.getColor()
	+ "이며, 속도는 " + myCar2.getSpeed() + "km입니다.");
	
	myCar3.upSpeed(250);
	System.out.println("자동차3의 색상은" + myCar3.getColor()
	+ "이며, 속도는 " + myCar3.getSpeed() + "km입니다.");
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