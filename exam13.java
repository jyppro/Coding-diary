package week05;
interface clickListener {
	public void print();
}

public class exam13 {

	public static void main(String[] args) {
		
		clickListener listener = (new clickListener() {
			public void print() {
				System.out.println("Ŭ�� �������Դϴ�.");
			}
		});	

		listener.print();
	}

}
