public class Rect implements Shape {
	private int width, height; //���ο� ����
	public Rect(int width, int height) {
		this.width = width;
		this.height = height; 
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public void draw() {
		System.out.println(width + "x" + height + "�� �簢���Դϴ�.");
	}

	@Override
	public double getArea() {
		
		return width*height;
	}
}
