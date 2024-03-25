import javax.print.DocFlavor.STRING;

public class c7_string_ham_so_sanh {
	public static void main(String[] args) {
		// ví dụ
		String s1 = " titv.vn";
		String s2 = " TITV.vn";
		String s3 = " titv.vn";
		// hàm equals -> so sánh 2 chuỗi giống nhau ,
		// phân biệt chữ viêt hoa và viết thường
		System.out.println(" s1 equals s2: " + s1.equals(s2));
		System.out.println(" s1 equals s2: " + s1.equals(s3));

		// hàm equalsIgnoreCase -> so sánh 2 chuỗi giống nhau
		// ko phân biệt hoa thường
		System.out.println(" s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println(" s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s3));

		// hàm compareTo -> so sánh vs chuỗi
		String sv1 = " Nguyễn Văn A ";
		String sv2 = " Nguyễn Văn B ";
		String sv3 = " Nguyễn Văn";
		String sv4 = " Nguyễn Văn A ";

		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv4));

		// Hàm compareToIgnoreCase -> tương tự hàm compareTo , nhưng ko phân biệt hoa
		// thường

		// Hàm regionMatches -> hàm so sánh 1 đoạn
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		/*
		 * 2: r1 bắt đầu từ kí tự thứ 2 
		 * r2: so sánh ở chuỗi r2 
		 * 0: r2 bắt đầu từ kí tự thứ 0 
		 * 4: lấy 4 ký tự
		 */

		System.out.println(check);
		
		// Hàm startWith -> hàm ktra chuỗi bắt đầu của chuỗi
		String sdt = "0396479004";
		System.out.println(sdt.startsWith("039"));
		System.out.println(sdt.startsWith("04"));
		
		// hàm endWith -> ktra chuỗi kthuc bằng...
		String tenFile = " i love u.JPG";
		String tenFile2 = " học java.PDF";
		
		if (tenFile.endsWith(".JPG")) {
			System.out.println("file là 1 hình ảnh");
		}
			else if(tenFile.endsWith("PDF")) {
				System.out.println(" file là 1 file pdf! ");
			}
			// tenfile2 cz tương tự và nó là file pdf

		if (tenFile2.endsWith(".JPG")) {
			System.out.println("file là 1 hình ảnh");
		}
			else if(tenFile2.endsWith("PDF")) {
				System.out.println(" file là 1 file pdf! ");
			}
		}


	}

