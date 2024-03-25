package gameTaiSuu;

import java.util.Random;
import java.util.Scanner;

/*hiển thị tên trò chơi
cài  tổng số tiền hiện có

cho 1 biên choice, chọn 1 để bắt đầu , sô skhacs để thoát 
rồi cho ngta nhập số 

 cho phép cược trong phạm vi tiền trong ví
 
 
 */

public class tesst {
public static void main(String[] args) {
	double taikhoannguoichoi= 500000;
 	Scanner sc = new Scanner(System.in);
	
	

	int luachon =1;
	do {
		System.out.println(" Chào mừng bạn đến với trò chơi tài xỉu!");
		System.out.println(" Nhập 1 để bắt đầu chò chơi: || Nhập 0 để thoát game: "); );
		luachon = sc.nextInt();
		if(luachon ==1) {
			System.out.println("Bạn đã đồng ý chơi" );
			System.out.println("Tài khoản hiện có của bạn là: "+taikhoannguoichoi +"bạn muốn đặt cược bao nhiêu");
			double datcuoc = 0;
			do {
				System.out.println("Đặt cược với số tiền >0 và <= "+taikhoannguoichoi);
				datcuoc = sc.nextDouble();
			}while(datcuoc <=0 || datcuoc >taikhoannguoichoi);
			
			//lựa chọn tài sửu 
			int luachontaisuu =0;
			do {
				System.out.println(" chọn 1 -> tài || chọn 2  -> sửu :");
				luachontaisuu = sc.nextInt();
			}while (luachontaisuu != 1 && luachontaisuu != 2);
			
			//hàm random 
			Random xs1 = new Random();
			Random xs2 = new Random();
			Random xs3 = new Random();
			
			int giatri1 = xs1.nextInt();
			int giatri2 = xs2.nextInt();
			int giatri3 = xs3.nextInt();
			
			
			// tính kết qủa
			System.out.println("Kết quả sau khi lắc: " +giatri1 + " - " +giatri2 +" - "+ giatri3 +":");
			
			}
			
		}
	}
	while (luachon =0);
}

