import java.util.Scanner;

public class a4_gan_phep_toan_congbang {
	public static void main(String[] args) {
		// nhap dl từ bàn phím
		Scanner sc = new Scanner(System.in);
		float a;
		System.out.println(" nhap vào số  a :");
		a = sc.nextFloat();
		System.out.println(" a= " + a);
		//-----
	 

		a += 3; // a = a+3
		System.out.println("+=3 :" + a);

		a %= 3; // a = a%3
		System.out.println("%=3 :" + a);
		
		a /= 3; // a = a/3
		System.out.println("/6=3 :"+a);
	}

}
//bài 13
