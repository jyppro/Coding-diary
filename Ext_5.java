package week13;

class Phone {
	public Phone(String maker, int price, int type) {
		super();
		this.maker = maker;
		this.price = price;
		this.type = type;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	protected String maker;
	protected int price;
	protected int type;
}

class SmartPhone extends Phone {
	public String getOs() {
		return os;
	}
	public SmartPhone(String maker, int price, int type, String os,
			String version, int memory, boolean hasCamera, boolean hasBluetooth) {
		super(maker, price, type);
		this.os = os;
		this.version = version;
		this.memory = memory;
		this.hasCamera = hasCamera;
		this.hasBluetooth = hasBluetooth;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public boolean isHasCamera() {
		return hasCamera;
	}
	public void setHasCamera(boolean hasCamera) {
		this.hasCamera = hasCamera;
	}
	public boolean isHasBluetooth() {
		return hasBluetooth;
	}
	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
	private String os;
	private String version;
	private int memory;
	private boolean hasCamera;
	private boolean hasBluetooth;
	
	public String toString(){
		return "SmartPhone의 정보\n제조사 : "+this.getMaker()+"\n가격 : "+
	this.getPrice()+"\n타입 : "+this.getType()+"\n버전 : "+this.getVersion()
	+"\n메모리 : "+this.getMemory()+"\n카메라유무 : "+this.hasCamera+"\n블루투스 유무 : "+this.hasBluetooth;
	}
}

public class Ext_5 {
	public static void main(String[] args) {
		SmartPhone SP1 = new SmartPhone("애플", 1300000, 4, "ios",
									"1.043ver", 256, true, true);
		SmartPhone SP2 = new SmartPhone("0", 1, 1, "0", "0", 1, true, true);
		
		SP2.setMaker("삼성");
		SP2.setPrice(190000);
		SP2.setType(3);
		SP2.setOs("android");
		SP2.setVersion("3.003ver");
		SP2.setMemory(32);
		SP2.setHasCamera(true);
		SP2.setHasBluetooth(false);
		
		System.out.println(SP1+"\n");
		System.out.println(SP2);
	}
}
