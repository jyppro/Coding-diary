import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Hello");
		a.add("Hi");
		a.add("java");
		a.add(2, "Sahni");
		int n = a.size();
		for (int i = 0; i < n; i++) {
			System.out.println(a.get(i));
		}
		//a.clear();
		a.remove(1);
		for (String item : a) {
			System.out.println(item);
		}
		ArrayList<Integer> ai = new ArrayList<>();
		ai.add(100);
		ai.add(200);
		ai.add(300);
		for (Integer num : ai) {
			System.out.println(num);
		}
	}

}
