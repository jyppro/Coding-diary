
public class Phone {
	private String name;
	private String tel;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return this.tel;
	}
	public void settel(String tel) {
		this.tel = tel;
	}
	public Phone(String name, String tel) {
		this.name = name;
		this.tel =  tel;
	}
	public Phone() {
		this("noname", "000-0000");
	}
}
