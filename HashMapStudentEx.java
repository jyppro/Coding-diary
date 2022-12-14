import java.util.HashMap;
import java.util.Scanner;

class Student {
	private int id;
	private String tel;
	public Student (int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}
public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		Student student1 = new Student(1, "010-1111-1111");
		map.put("Ȳ����", student1);
		map.put("���繮", new Student(2, "010-2222-2222"));
		map.put("�賲��", new Student(3, "010-3333-3333"));
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("�˻��� �̸�?");
		String name = scan.nextLine();
		if (name.equals("exit"))
			break;
		Student stu = map.get(name);
		if ( stu == null )
			System.out.println(name + "�� ���� ����Դϴ�.  ");
		else {
			System.out.println(stu.getId() + " " + stu.getTel());
		}
	}
	scan.close();
 }

}
