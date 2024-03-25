package main;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{

	private String mssv;
	private String hoVaten;
	private int namSinh;
	private float avg;
	
	
	

	public SinhVien(String mssv) {
		this.mssv = mssv;

 	}

	 

	public SinhVien(String mssv, String hoVaten, int namSinh, float avg) {
		this.mssv = mssv;
		this.hoVaten = hoVaten;
		this.namSinh = namSinh;
		this.avg = avg;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoVaten() {
		return hoVaten;
	}

	public void setHoVaten(String hoVaten) {
		this.hoVaten = hoVaten;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return "SinhVien [mssv=" + mssv + ", hoVaten=" + hoVaten + ", namSinh=" + namSinh + ", avg=" + avg + "]";
	}

	@Override
	public int compareTo(SinhVien o) { // hàm so sánh
		return this.mssv.compareTo(o.mssv);
	}



	@Override
	public int hashCode() {
		return Objects.hash(avg, hoVaten, mssv, namSinh);
	}



	@Override // HÀM SO SÁNH 2 ĐỐI TƯỢNG
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return  Objects.equals(mssv, other.mssv) ; // CHỈ CẦN MSSV
	}
	
	
	}
