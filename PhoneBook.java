import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
	static ArrayList<Phone> pList;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수 >>");
		int su = scan.nextInt();
		pList = new ArrayList<Phone>();
		for (int i = 0; i < su; i++) {
			System.out.print("이름과 전화번호 입력하시오 >>");
			String name = scan.next();
			String tel = scan.next();
			pList.add(new Phone(name, tel));
		}
		System.out.println("저장되었습니다.....");
		while(true) {
			System.out.print("검색할 이름>>");
			String inname = scan.next();
			if (inname.equals("그만")) break;
			String tel = search(inname);
			if (tel == null) {
				System.out.println(inname + "이 없습니다.");
			} else {
				System.out.println(inname + "의 번호는 " + tel + "입니다.");
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
