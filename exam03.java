public class exam03 {
	public static void main(String[] args) {
		int count = 85;
		if(count >= 90) {
			System.out.println("if�� : �հ� (���л�)");
		}else if (count >= 60) {
			System.out.println("if�� : �հ�");
		}else {
			System.out.println("if�� : ���հ�");
		}
		
		
		int jumsu = (count / 10) * 10;
		switch (jumsu) {
		 case 100:
		 case 90:
			System.out.println("switch�� : �հ� (���л�)");
			break;
		 case 80:
		 case 70:
		 case 60:
		 	System.out.println("switch�� : �հ�");
		 	break;
		 default:
			System.out.println("switch�� : ���հ�");
			break;
		}
	}
}