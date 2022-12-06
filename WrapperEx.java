
public class WrapperEx {

	public static void main(String[] args) {
		String x = "-123";
		String y = "10";
		System.out.println("x + y = ?");
		System.out.println(Integer.parseInt(x) + Integer.parseInt(y));
		
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("3.14"));
	}

}
