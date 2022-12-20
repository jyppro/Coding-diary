public class Rect implements Shape {
	private int width, height; //가로와 세로
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
		System.out.println(width + "x" + height + "의 사각형입니다.");
	}

	@Override
	public double getArea() {
		
		return width*height;
	}
}
