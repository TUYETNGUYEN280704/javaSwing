import java.util.Scanner;

public class c6_string_cac_ham {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println(" nhập vào chuỗi :");
		s = sc.nextLine();
		System.out.println(" ------ ");

		// hàm length() -> lấy độ dài chuỗi
		System.out.println(s.length());

		int dodai = s.length();
		// hàm charAt (vi trí) -> lấy ra 1 ký tự tại vị trí
		for (int i = 0; i < dodai; i++) {
			System.out.println(" vị trí " + i + " là " + s.charAt(i));
			
		}
		  // HÀM getchars -> lấy toàn bộ ra 
		//( vtri bắt đầu , vtr kêt thúc , mảng lưu dl ,  vtri bắt đầu lưu của mảng ) 
		char[] arraychar = new char[10];
		s.getChars(2, 5, arraychar, 0);
	//	s.getChars(arraychar, dodai, null, arraychar);
		for ( int i = 0; i< arraychar.length ; i++) {
			System.out.println(" giá trị của mảng tại "+i+" là: ");
		}
		
		
		// hàm getBytes
		//*có 3 cách lấy ra giá trị của các ký tự 
		// ví dụ như a là 10 
		 
		 
		byte[] arraybyte = s.getBytes();
		for (byte b : arraybyte) {
			System.out.println(b);
		}
		
		
	}
}
