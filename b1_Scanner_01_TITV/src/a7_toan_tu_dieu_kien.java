/*
 * import java.util.Scanner;
 * 
 * public class toan_tu_dieu_kien { public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println(" nhập vào số a : "); int a = sc.nextInt();
 * 
 * String ketQua = (a % 2 == 0) ? " số chẵn" : " số lẽ"; System.out.println(a +
 * " là " + ketQua); } }
 */

import java.util.Scanner;

public class a7_toan_tu_dieu_kien {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println(" nhập vào số a : ");
		a = sc.nextInt();

		String ketQua = (a % 2 == 0) ? " số chẵn" : " số lẽ";
		System.out.println(a + " là " + ketQua);
	}
}
