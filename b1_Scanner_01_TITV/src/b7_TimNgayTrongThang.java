/*
	 * bài 20 kiểm tra số ngày của tháng 
	 * tháng 1,3,5,7,8,10,12 có 31 ngày 
	 * tháng 4,6,9,11 có 30 ngày 
	 * tháng 2 , năm nhuận có 29 ngày , ko nhuận thì 28 ngày 
	 * 
	 * CÁCH TÍNH năm nhuận dương lịch 
	 * để tính ta lấy năm đó chia cho 4 
	 * + nếu chia hết cho 4 thì năm Dương lịch đó là năm nhuận
	 * + vs những năm tròn thế kỷ ( có 2 số 00 ở cuối ) thì lấy số năm chia cho 400
	 * + nếu chia hết cho 400 thì năm đó là năm nhuận 
	 * 
	 * ví dụ 2020, 2024 là những năm nhuận dương lịch vì chia hết cho 4
	 * 2021 ko là năm nhuận dương lịch vì chia 4 dư 1
	 * 2000 năm 2400 là các năm nhuận vì chia hết cho 400
	 * 
	 */

import java.util.Scanner;

public class b7_TimNgayTrongThang {
	public static void main(String[] args) {
		int thang, nam;
		Scanner sc = new Scanner(System.in);

		System.out.println(" nhập vào tháng: ");
		thang = sc.nextInt();
		System.out.println(" nhập vào năm: ");
		nam = sc.nextInt();

		switch (thang) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			System.out.println(" tháng có 31 ngày: ");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			System.out.println(" tháng có 30 ngày: ");
			break;
		}
		// t2: tháng 2 , năm nhuận có 29 ngày , ko nhuận thì 28 ngày
		case 2: {
			if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
				System.out.println(" năm nhuận có 29 ngày :");
			} else {
				System.out.println(" năm ko nhuận có 28 ngày :");
			}
		}break;

		default:
			System.out.println(" nhập dữ liệu bị sai -> nhập lại đi bồ iu:");
			break;
		}
	}
}

