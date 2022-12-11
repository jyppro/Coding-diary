import java.util.Scanner;
/*
 * 20190816 박재영
 */
public class Ex4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수학, 과학, 영어 순으로 3개의 점수를 입력하시오.");
		int ma = scanner.nextInt();
		int sc = scanner.nextInt();
		int en = scanner.nextInt();
		Grade me = new Grade(ma, sc, en);
		System.out.println("나의 평균은" + me.average());
		System.out.println("수학점수는" + me.getMath() + "과학점수는" + me.getscience() + "영어점수는" + me.getenglish());
		Grade haha = new Grade();
		System.out.println("하하의 평균은" + haha.average());
		System.out.println("수학점수는" + me.getMath() + "과학점수는" + me.getscience() + "영어점수는" + me.getenglish());
		scanner.close();
	}

}
