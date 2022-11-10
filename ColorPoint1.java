package week04;

public class ColorPoint1 extends Point1{
	private String color; //정의 색
	public ColorPoint1(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { //컬러 정의 좌표 출력
		System.out.println(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}
