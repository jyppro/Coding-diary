public class Pen {
	private int amount;
	public int getAmount() {
		return this.amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
class SharpPencil extends Pen {
	private int width;
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
class BallPen extends Pen {
	private String color;
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
class FountainPen extends BallPen {
	public void refill(int n) {
		setAmount(n);
	}
}
