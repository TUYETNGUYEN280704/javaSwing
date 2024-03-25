// b19 CÂU LỆNH RẺ NHÁNH
// bài tập kiểm tra thứ

// CÚ PHÁP 
/*
 * switch ( integer expression )
 * { case integer expression:
 * 	statement(s)
 * break;
 * ....
 * default:
 * statement(s)
 * break;
 */
// nhập vào 1 con số nguyên từ 2-> 8 và xuất ra các ngày tương ưng s
/**2 -> thứ 2, 3->  thứ 3... 8 -> chủ nhật 
 * nếu nhập ngoài 2-> 8   nhập lỗi
 * **/

import java.util.Scanner;

public class b6_Switch_case {
public static void main(String[] args) {
	int n; 
	Scanner sc= new Scanner(System.in);
	System.out.println(" nhập dl từ 0-> 8");
	n = sc.nextInt();
	
	switch (n) {
	case 2: {
		System.out.println(" thứ 2");
		break;
	}
	case 3: {
		System.out.println(" thứ 3: ");
		break;
	}// tiếp tục đến 4 5 6 7 
	case 8:{
		System.out.println(" chủ nhật : ");
		break;
	}
	default:
		System.out.println(" dl nhập vào ko thỏa --> hãy nhập lại :");
	}
}	
	
}
 