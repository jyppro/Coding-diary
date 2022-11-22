package week05;
class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}
public class Ex5_5 {
	public static void main(String[] args) {
		Line line = new Line();
		line.draw();
		Shape shape1 = new Shape();
		shape1.draw();
		Shape shape = new Line();
		shape.draw();
		Rect rect = new Rect();
		rect.draw();
		Circle circle = new Circle();
		circle.draw();
	}
}