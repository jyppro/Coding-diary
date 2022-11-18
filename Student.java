package week04;

public class Student extends Person {
	public void set() {
	age = 30;  // 슈퍼클래스의 디폴트 멤버 접근 가능
	name = "홍길동";  // 슈퍼클래스의 public 멤버 접근 가능
	height = 175;  // 슈퍼클래스의 protected 멤버 접근 가능
	//weight = 99;  // 오류, 슈퍼클래스의 private 접근 불가
	setWeight(99);  // private 멤버 weight는 setWeight() 으로 간접 접근
	}
}
