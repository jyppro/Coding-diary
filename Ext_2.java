package week13;

class Person {
	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public Person(String name, String address, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	String name;
	String address;
	String phone;
}

class Customer extends Person {
	public Customer(String name, String address, int customerNumber, int mileage) {
		super(name, address);
		this.customerNumber = customerNumber;
		this.mileage = mileage;
		System.out.println(name + ", " + address + ", " + customerNumber + ", " + mileage);
	}
	public Customer(String name, String address, String phone) {
		super(name, address, phone);
		System.out.println(name + ", " + address + ", " + phone);
	}
	int customerNumber;
	int mileage;
}

public class Ext_2 {
	public static void main(String[] args) {
		Customer C1 = new Customer("박재영", "서울특별시 고척동 경인로", 77, 13);
		Customer C2 = new Customer("박재영", "서울특별시 고척동 경인로", "010-7257-6010");
	}
}