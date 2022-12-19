import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	static ArrayList<Phone> pList;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ο��� >>");
		int su = scan.nextInt();
		pList = new ArrayList<Phone>();
		for (int i = 0; i < su; i++) {
			System.out.print("�̸��� ��ȭ��ȣ �Է��Ͻÿ� >>");
			String name = scan.next();
			String tel = scan.next();
			pList.add(new Phone(name, tel));
		}
		System.out.println("����Ǿ����ϴ�.....");
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String inname = scan.next();
			if (inname.equals("�׸�")) break;
			String tel = search(inname);
			if (tel == null) {
				System.out.println(inname + "�� �����ϴ�.");
			} else {
				System.out.println(inname + "�� ��ȣ�� " + tel + "�Դϴ�.");
			}
		}
		scan.close();
	}
	
	static String search(String name) {
		for (int i = 0; i < pList.size(); i++) {
			Phone phone1 = pList.get(i);
			if(phone1.getName().equals(name))
				return phone1.getTel();
		}
		return null;
	}

}
