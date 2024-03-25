 
//while (condition) { // điều kiện 
//	Statement(s) }// khối lệnh

import java.util.Scanner;

public class b9_VongLap_While {
public static void main(String[] args) {
	int x = 1;
	Scanner sc = new Scanner(System.in);
	/// vòng lặp 
	while ( x != 0) {
		System.out.println(" nhập x=0 sẽ out >< nhập số khác để típ tục:");
		x = sc.nextInt();
		
	}
	
	
	//Vòng lặp vô tận
	int i = 0 ;
	while (true) {
		System.out.println(i);
		i++;
		if(i==10) /// dòng này để ngăn chạn chạy quá nhiều-đến 10 là dừng lun
			break;
	}
}
}
