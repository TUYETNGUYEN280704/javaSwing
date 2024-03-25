package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luachon = 0;
		do {
			System.out.println("***MENU***");
			System.out.println("Vui lòng nhập lựa chọn: ");
			System.out.println(
			""
			+ "1. thêm sinh viên vào danh sách \n"
			+ "2. in dssv ra màn hình. \n"
			+ "3. ktra ds có rỗng hay ko. \n"
			+ "4. lấy ra số lượng sv trong ds. \n"
			+ "5. làm rỗng dssv \n"
			+ "6. ktra sv có tồn tại trong ds ko. \n"
			+ "7. xóa 1 sv khỏi ds dựa vào mssv. \n"
			+ "8. tìm kiếm all sv dựa trên tên được nhập từ keyboad. \n"
			+ "9. xuất ra dssv có điểm từ cao đến thấp. \n"
			+ "0. thoát khỏi nhen - the end \n");
			luachon = sc.nextInt();
			sc.nextLine();
			
			if(luachon ==1) {
				//"1. thêm sinh viên vào danh sách \
				System.out.println("--------------------------------------------");
				System.out.println(" nhập mssv"); 
				String mssv = sc.nextLine();
				System.out.println(" nhập họ và tên sv"); 
				String hoVaten = sc.nextLine();
				System.out.println(" nhập năm sinh"); 
				int namSinh = sc.nextInt();
				System.out.println(" nhập điểm"); 
				float diem = sc.nextFloat();
				SinhVien sv = new SinhVien(mssv, hoVaten, namSinh, diem);
				dssv.themSinhVien(sv);
				System.out.println("--------------------------------------------");
				
			}else if(luachon ==2) {
				//2. in dssv ra màn hình.
				System.out.println(" Danh sách sinh viên: ");
				dssv.indssv();
				System.out.println("--------------------------------------------");
 
			}else if(luachon ==3) {
				// ktra dssv có rỗng hay ko
				System.out.println("--------------------------------------------");
				System.out.println("  dssv  rỗng -> rỗng true|| ko rỗng false : =>>> " + dssv.ktrdsRong());
				//dssv.ktrdsRong();
				System.out.println("--------------------------------------------");
			}else if(luachon ==4) {
				//ktra solg sv có trong ds
				System.out.println("--------------------------------------------");
				System.out.println(" Số lượng hiện tại có [ " +dssv.laySoluongsv() +" ] sinh viên trong danh sách");
				System.out.println("--------------------------------------------");

			}else if(luachon ==5) {
				// làm rỗng dssv
				System.out.println("--------------------------------------------");
				System.out.println(" Danh sach sinh viên đã đc remove: ");
				dssv.lamRongds();
				System.out.println("--------------------------------------------");


			}else if(luachon ==6) {
				// 6. ktra sv có tồn tại k
				System.out.println("--------------------------------------------");
				System.out.println(" Nhập mssv: ");
				String mssv = sc.nextLine();
				SinhVien sv1 = new SinhVien(mssv);
				System.out.println(" Ktra sv có trong ds: "+dssv.ktraTonTai(sv1));
				System.out.println("--------------------------------------------");

			}else if(luachon ==7) {
				//7. xóa sv ra khỏi ds
				System.out.println("--------------------------------------------");
				System.out.println(" Nhập mssv: ");
				String mssv = sc.nextLine();
				SinhVien sv = new SinhVien(mssv);
				System.out.println(" Xóa sv trong ds: " +dssv.xoaSinhVien(sv));
				System.out.println("--------------------------------------------");

			}else if(luachon ==8) {
				//8 , tìm all sv dựa trên tên đc nhập
				System.out.println("--------------------------------------------");
				System.out.println(" Nhập vào tên sv: ");
				String hoVaten = sc.nextLine();
				System.out.println(" Kết quả tìm kiếm: ");
				dssv.timsinhvien(hoVaten);
				System.out.println("--------------------------------------------");

			}else if(luachon ==9) {
				//9. xuất dssv có điểm từ cao tới thấp
				System.out.println("--------------------------------------------");
				dssv.SapXepsvDiemThapdenCao();
				dssv.indssv();
				System.out.println("--------------------------------------------");


			}
			else {
				System.out.println("--------------------------------------------");

			}

			
		}while(luachon !=0);
		
	}
}
