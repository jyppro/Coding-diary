import java.util.Scanner;
/*
 * 20190816 ���翵
 */
public class Ex4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ 3���� ������ �Է��Ͻÿ�.");
		int ma = scanner.nextInt();
		int sc = scanner.nextInt();
		int en = scanner.nextInt();
		Grade me = new Grade(ma, sc, en);
		System.out.println("���� �����" + me.average());
		System.out.println("����������" + me.getMath() + "����������" + me.getscience() + "����������" + me.getenglish());
		Grade haha = new Grade();
		System.out.println("������ �����" + haha.average());
		System.out.println("����������" + me.getMath() + "����������" + me.getscience() + "����������" + me.getenglish());
		scanner.close();
	}

}
