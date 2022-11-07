public class CircleArray{
	public static void main(String[] args) {
		Circle5[] c;
		c = new Circle5[5];
		
		for(int i = 0; i < c.length; i++)
			c[i] = new Circle5(i);
				
		for(int i = 0; i < c.length; i++)
			System.out.print((int)(c[i].getArea()) +" ");
	}
}