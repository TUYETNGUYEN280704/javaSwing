
// do while -> thực hiện câu lệnh trước , suống dưới gặp điều kiện while thì tính sau 
// do while sẽ thực thi câu lệnh chưa xét điều kiện ít nhất 1 lần 
// nhạp vào số nhỏ hơn 0 , nếu lớn hơn thì dưng 
import java.util.Scanner;

public class b9_VongLap_Do_While {
public static void main(String[] args) {
	int n ;
	Scanner sc = new Scanner(System.in);
	//n = sc.nextInt();
	
	do {
		System.out.println(" nhập n yêu cầu n > 0 ");
		n = sc.nextInt();

		
	} while (n<=0 );
}
}
