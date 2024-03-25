public class a3_Epkieu {
	public static void main(String[] args) {
		int a = 90;
		int b = 91;
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		// Ep kiểu ngầm định
		float c = a;
		float d = b;

		System.out.println("c = " + c);
		System.out.println("d = " + d);

		// ép kiểu tường minh
		float e = 9.6f;
		float f = 10.5f;
		System.out.println("e = " + e);
		System.out.println("f = " + f);

		int g = (int) e;
		int h = (int) f;
		System.out.println("g = " + g);
		System.out.println("h = " + h);

		// ép kiểu giữa biến nguyên thủy và đối tượng
		final int x = new Integer(12);
		System.out.println("x = " + x);
	 
	}
}
