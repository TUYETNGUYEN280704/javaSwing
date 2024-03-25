package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
//arrayList 
	private ArrayList<SinhVien> danhSach;

	// constructor rỗng
	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	// constructor
	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	// thêm sinh viên vào danh sách
	public void themSinhVien(SinhVien sv) {
		this.danhSach.add(sv);
	}


	// 2. in danh sách sinh viên ra màn hình
	public void indssv() {
		for(SinhVien  sinhVien : danhSach) {
			System.out.println(sinhVien);
		}
		
	}
	
	//3. ktra ds có rỗng hay ko. 
	public boolean ktrdsRong() {
		return this.danhSach.isEmpty();// isempty roong
	}
		
	//4. lấy ra số lượng sv trong ds. \n"
		public int laySoluongsv() {
			return this.danhSach.size(); // 
		
		}
		
		
	//5. làm rỗng dssv
		public void lamRongds() {
			this.danhSach.removeAll(danhSach);
		}
		
		/*6. ktra sv có tồn tại trong ds ko. \n"
			+ "7. xóa 1 sv khỏi ds dựa vào mssv. \n"
			+ "8. tìm kiếm all sv dựa trên tên được nhập từ keyboad. \n"
			+ "9. xuất ra dssv có điểm từ cao đến thấp. \n"
*/		
	//6.ktra sv có tồn tại trong ds ko dựa vào mssv.
		public boolean ktraTonTai(SinhVien sv) {
			return this.danhSach.contains(sv);
		}
		
	//7. xóa 1 sv ra khỏi ds
		public boolean xoaSinhVien(SinhVien sv) {
			return this.danhSach.remove(sv);
		}
		
	//8. Tìm kiếm all sv dựa trên tên đc nhập
		public void timsinhvien(String ten) {
			for(SinhVien sinhVien : danhSach) {
				if(sinhVien.getHoVaten().indexOf(ten)>=0) { // tìm thấy sinh viên 
					System.out.println(sinhVien);
				}
				else {
					System.out.println(" không có sv nào: ");
				}
			}
		}
	//9. xuất sv có điểm từ cao đến thấp ( giảm dần) 
		public void SapXepsvDiemThapdenCao() {
			Collections.sort(this.danhSach, new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien sv1, SinhVien sv2) {
					if(sv1.getAvg() < sv2.getAvg()) {
						return 1;
					}
					else if(sv1.getAvg() > sv2.getAvg()) {
						return -1;
					}else {
						return 0;
					}
				}
			});
		}
}

