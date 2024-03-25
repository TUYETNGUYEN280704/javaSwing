// bài 16 lớp math và các hàm toán học trong java 

import java.util.Scanner;

public class a6_math_ham_toan_hoc {
public static void main(String[] args) {
	double a,b;
	Scanner sc = new Scanner(System.in);
	System.out.println(" nhập vào số a : ");
	a = sc.nextDouble();
	System.out.println(" nhập vào số b : ");
	b= sc.nextDouble();
	
	// hàm tính giá trị tuyệt dối 
	System.out.println(" |a| "+ Math.abs(a));
	
	// hàm tính min 
	System.out.println("min (a,b)"+ Math.min(a, b));
	
	//hàm tính maxx tương tự min 
	// hàm ceil   tìm sắp sỉ lên 9.5 thành 10
	System.out.println("ceil a"+Math.ceil(a));
	
	// hàm floor tìm sắp sỉ xuống 9,5 thành 9 
	System.out.println(" floor a "+ Math.floor(a));
	
	// hàm tính căn bậc 2
	System.out.println(" sqrt(a) "+ Math.sqrt(a));
	
	// hàm tĩnh a^b
	System.out.println(" a^b "+Math.pow(a, b));
}
}