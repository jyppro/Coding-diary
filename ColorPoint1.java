package week04;

public class ColorPoint1 extends Point1{
	private String color; //���� ��
	public ColorPoint1(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { //�÷� ���� ��ǥ ���
		System.out.println(color);
		showPoint(); // Point Ŭ������ showPoint() ȣ��
	}
}
