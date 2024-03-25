import java.util.Scanner;

public class c_Vonglap_chuyenSoThapPhan_sang_NhiPhan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println(" nhập vào số nguyên n: ");
		n = sc.nextInt();

		// thực hiện
		String nhiPhan = "";
		while (n > 0) {
			nhiPhan = (n % 2) + nhiPhan;
			n = n / 2;

		}
		System.out.println(" số nhị phân  là " + nhiPhan);
 
		
	}
}

