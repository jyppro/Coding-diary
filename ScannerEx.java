import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.print("�̸���" + name + ", ");
		String city = scanner.next();
		System.out.print("���ô�" + city + ", ");
		int age = scanner.nextInt();
		System.out.println("���̴�" + age + ", ");
		double weight = scanner.nextDouble();
		System.out.println("ü����" + weight + ", ");
		boolean single = scanner.nextBoolean();
		System.out.println("���ſ��δ�" + single + "�Դϴ�.");
		scanner.close();
	}

}
