
public class Circle implements Shape {
	private int radius; //반지름
	public int getRadius() {
		return this.radius;
	}
	public void setRadius() {
		this.radius = radius;
	}
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("반지름이" + radius + "인 원입니다.");		
	}

	@Override
	public double getArea() {
		return PI*radius*radius;
	}
	
}
