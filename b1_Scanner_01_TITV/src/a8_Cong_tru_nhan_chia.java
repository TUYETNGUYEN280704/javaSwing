import java.util.Scanner;

public class a8_Cong_tru_nhan_chia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// nhập dl

		int a, b; // khai báo biến

 		System.out.println("nhập vào a :");
		a = sc.nextInt();
		System.out.println(" nhập vào b :");
		b = sc.nextInt();

		int tong = a + b;
		System.out.println(a + "+" + b + "=" + tong);

		int hieu = a - b;
		System.out.println(a + "-" + b + "=" + hieu);

		int nhan = a * b;
		System.out.println(a + "*" + b + "=" + nhan);

		float thuong = a / b;
		System.out.println(a + "/" + b + "=" + thuong);

	}
} 
