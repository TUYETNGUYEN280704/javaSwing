// lệnh rẻ nhánh thường gặp 
/*
 * continue, break, return
 * 
 * continue và breal có thể dùng cùng vs label or ko
 * label : dùng để chỉ định chỗ cho các lệnh continue và break
 * 
 * 
 * lệnh -> break có 2 dạng 
 * + unlabeled form : dùng để thoat ra khỏi vòng lặp như 
 * (switch , for, while , do while 
 * + labeled form : di chuyển tới vùng đặt label 
 * 
 * lệnh -> continue
 * + dùng để nhảy qua (skip) vòng lặp( for, while, dowhile, ...}
 * + có 2 dạng ( có label , và ko có label)
 * 
 * 
 */

public class c1_CauLenhReNhanh_Break_continue_return {
	public static void main(String[] args) {
		// ----------------------BREAK------------------------------------
		// ví dụ cho vòng lặp KHÔNG có label

//		int out, in = 0;
//		for (out = 0; out < 10; out++) {
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break ;
//			}
//			System.out.println(" bên trong vòng lặp : out = " + out + ", in = " + in);
//		}
//		System.out.println(" bên ngoài vòng lặp : out = " + out + ", in = " + in);

		// ---------------------------------------------------------
		// ví dụ cho vòng lặp CÓ label
		// label là ta đặt tên cho vòng for ví dụ outer: for ()--> có nghĩ là vòng lặp
		// for này tên là outer

//		int out, in = 0;
//		outer: for (out = 0; out < 10; out++) { // outer là label
//			for (in = 0; in < 20; in++) {
//				if (in > 10)
//					break outer ; // có label thì breack phải chỉ rõ nó
//			}
//			System.out.println(" bên trong vòng lặp : out = " + out + ", in = " + in);
//		}
//		System.out.println(" bên ngoài vòng lặp : out = " + out + ", in = " + in);

		// ----------------------CONTINUE------------------------------------
		// LỆNH chạy đến dòng continue thì sẽ ko chạy đoạn dưới continue nữa
		// ...mà sẽ chạy vòng lên trên , cho tới khi nào ko thỏa dk trước continue nữa
		// thì ms chạy dòng phía dưới continue
		// ví dụ KHÔNG có label

//		int max = 100;
//		 for (int i =0; i<max; i++) {
//			if(i<50) // chạy mãi cho tới thi i>= 50 thì nó mới xuất ra
//				continue;
//			System.out.println(i); // ...xuất ra bằng dòng này
//		}

		// ví dụ CÓ label áp dụng với bài bảng cửu chương
//		outer: for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 10; j++) {
//				if (i > 5) // có thể thử < > <= >=
//					continue outer;
//				System.out.println(i + "x" + j + " = " + (i * j));
//			}
//			System.out.println("---");
//		}

		// -------------------------RETURN------------------------------------
		// ---> RETURN -> NGƯNG LUN chương trình
		// có 2 dạng
		/*
		 * trả về 1 giá trị : return ++count; -> gtr trả về phải phù hợp vs dk trả về
		 * của hàm ko trả về giá trị nào cả: return; -> kiểu trả về của hàm phải là VOID
		 */
		// ví dụ RETURN áp dụng với bài bảng cửu chương
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i > 5) // có thể thử < > <= >=
					return; // khi dùng return r thì nó sễ ngưng ko chạy đoạn sau nx mà nó chỉ chạy hết dk
							// trong vòng lặp thôi
				System.out.println(i + "x" + j + " = " + (i * j));
			}
			System.out.println("---");
		}

	}
}
