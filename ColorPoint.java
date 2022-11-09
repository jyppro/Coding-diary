package week04;

class ColorPoint extends Point {
	private String color; //정의 색
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { //컬러 정의 좌표 출력
		System.out.println(color);
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}
