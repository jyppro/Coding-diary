package week13;

class Food{				
	private int cal;
	private int cost;
	private int kg;
	
	public Food(int cal, int cost, int kg){
		this.cal = cal;
		this.cost = cost;
		this.kg = kg;
		}
	public Food(){
		this.cal = 0;
		this.cost = 0;
		this.kg = 0;
		}
	
	public void setCal(int cal){
		this.cal = cal;
		}
	public void setCost(int cost){
		this.cost = cost;
		}
	public void setKg(int kg){
		this.kg = kg;
		}
	
	public int getCal(){
		return cal;
		}
	public int getCost(){
		return cost;
		}
	public int getKg(){
		return kg;
		}
}
class Melon extends Food{
	private String info;
						
	public Melon(int cal, int cost, int kg,String info) {
		super(cal, cost, kg);
		this.info = info;
		}
	public Melon(){
		super();
		info = "NULL";
		}	

	public void setInfo(String info){
		this.info = info;
		}
	public String getInfo(){
		return info;
		}
	
	public String toString(){
		return "Melon의 정보\n칼로리 : "+this.getCal()+"\n가격 : "+
		this.getCost()+"\n중량 : "+this.getKg()+"\n정보"+this.getInfo();
	}
}

public class Ext_4 {					//드라이버 클래스 작성
	public static void main(String[] args) {	

Melon m1 = new Melon(155,27,3,"jyp_farm");
		Melon m2 = new Melon(1,1,1,"0");
		
		m2.setCal(177);
		m2.setCost(222);
		m2.setKg(22);
		m2.setInfo("jyp_Test");
		
		System.out.println(m1+"\n");
		System.out.println(m2);
	}
}