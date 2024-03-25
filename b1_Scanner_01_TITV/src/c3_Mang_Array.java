import java.util.Iterator;
import java.util.Scanner;

public class c3_Mang_Array {
	public static void main(String[] args) {
		// có 2 cách khai báo mảng
		double[] mang1; // c1
		double[] mang2;// c2
		// có 2 cách để khai báo 1 cái mảng chính
		// cách 1
		mang1 = new double[5];// số lượng phần tử m muốn
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < mang1.length; i++) {
			System.out.println(" nhập phần tử thứ " + i + ":");
			mang1[i] = sc.nextDouble();
		}
		// ví dụ 1 hàm tính tổng trong mảng
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			//tong += mang1[i];			// đc
			 tong = tong + mang1[i]; // đc
		}
		System.out.println("tong = " + tong);

		
		//cách 2
		System.out.println(" mang2:");
		mang2 = new double[] {1,2,3};// khi đã bt phần tử đó là gì
		for (int i = 0; i < mang2.length; i++) {
			System.out.println(mang2[i]);
		}
	}
}
