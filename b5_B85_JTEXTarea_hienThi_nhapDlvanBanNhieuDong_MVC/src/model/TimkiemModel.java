package model;

public class TimkiemModel {

	private String vanBan;
	private String tuKhoa;
	private String ketQua;
	
	public TimkiemModel() {
		this.vanBan="";
		this.tuKhoa="";
		this.ketQua = "";
	 
	}

	public String getVanBan() {
		return vanBan;
	}

	public void setVanBan(String vanBan) {
		this.vanBan = vanBan;
	}

	public String getTuKhoa() {
		return tuKhoa;
	}

	public void setTuKhoa(String tuKhoa) {
		this.tuKhoa = tuKhoa;
	}

	public String getKetQua() {
		return ketQua;
	}

	public void setKetQua(String ketQua) {
		this.ketQua = ketQua;
	}
	
	// tìm kiếm xem có bao nhiêu từ khóa trong văn bản
	public void timKiem() {//
		int dem = 0;
		int viTri =0;
		while (true) {// chạy hoài lun
			int i = this.vanBan.indexOf(this.tuKhoa, viTri); // tìm kiếm (indexOf) từ khóa, dựa vào vị trí
			if(i ==-1) {//tình huống ko tìm thấy
				break;
			}else { // tìm thấy thì đi ra sau
				dem ++;
				viTri = i +1;
				
			}
		}this.ketQua = " kết quả : có  "+ dem + "-> : "+  this.tuKhoa;
		System.out.println(ketQua);
	}
	
}
