
public class Circle implements Shape {
	private int radius; //������
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
		System.out.println("��������" + radius + "�� ���Դϴ�.");		
	}

	@Override
	public double getArea() {
		return PI*radius*radius;
	}
	
}
