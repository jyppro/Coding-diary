
public interface Shape {
	final double PI = 3.14;
	abstract void draw();
	double getArea();
	default public void redraw() {
		System.out.println("-- �ٽ� �׸��ϴ�.");
		draw();
	}
}
