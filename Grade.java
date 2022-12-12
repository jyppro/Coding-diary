
public class Grade {
	private int math;
	private int science;
	private int english;
	public int getMath() {
		return this.math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getscience() {
		return this.science;
	}
	public void setscience(int science) {
		this.science = science;
	}
	public int getenglish() {
		return this.english;
	}
	public void setenglish(int english) {
		this.english = english;
	}
	public double average() {
		
		double ave = (this.math + this.science + this.english) / 3;
		return ave;
	}
	public Grade() {
		this(0,0,0);
	}
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
}
