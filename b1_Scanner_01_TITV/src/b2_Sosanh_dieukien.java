import java.util.Scanner;

public class b2_Sosanh_dieukien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.println("nhập a: ");
		a = sc.nextInt();

		System.out.println(" nhập vào b:");
		b = sc.nextInt();

		// xuất kết quả so sánh

		System.out.println(a + " ==" + b + ":" + (a == b));
		System.out.println(a + " <=" + b + ":" + (a <= b));
		System.out.println(a + " !=" + b + ":" + (a != b));
		System.out.println(a + " <" + b + ":" + (a < b));
		System.out.println(a + " >" + b + ":" + (a > b));

		System.out.println(" cả hai số là số chẵn: " + (a % 2 == 0 && b % 2 == 0));
		System.out.println(" có ít nhất 1 số chẵn: " + (a % 2 == 0 || b % 2 == 0));
	}
}
