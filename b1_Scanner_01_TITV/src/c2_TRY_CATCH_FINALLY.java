import java.util.Scanner;

public class c2_TRY_CATCH_FINALLY {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = 0;
	try {
		System.out.println(" nhập vào số nguyên n : ");
		n = sc.nextInt();
	}
	catch (Exception e) { // nếu như ko nhập đúng số nguyên thì nó sẽ chạy catch
		System.out.println(" nhập dl ko đúng : ");
	}
	finally {
		System.out.println(" finally!"); // ko cos cz ko sao 
	}
	System.out.println(" gia tri nhap la "+ n);
	System.out.println(" kết thúc chương trình:oke baiii ");

 
}
}
// có thể dùng nhiều catch nó đc ví như những sự lựa chọn khác nhau vại
