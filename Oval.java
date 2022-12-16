public class Oval implements Shape {
	private int width, height; //가로와 세로 반지름
	public Oval(int width, int height) {
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
		System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		
		return PI*width*height;
	}

}
