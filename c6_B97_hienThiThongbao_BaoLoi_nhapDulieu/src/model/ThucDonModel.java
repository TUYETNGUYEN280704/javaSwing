package model;

import java.util.StringTokenizer;

public class ThucDonModel {
	public String luaChon_MonChinh;
	public String luaChon_MonPhu;
	public double tongTien;

	public ThucDonModel() {
		this.luaChon_MonChinh = "";
		this.luaChon_MonPhu = "";
		this.tongTien = 0;
	}


	/**
	 * @return the luaChon_MonChinh
	 */
	public String getLuaChon_MonChinh() {
		return luaChon_MonChinh;
	}


	/**
	 * @param luaChon_MonChinh the luaChon_MonChinh to set
	 */
	public void setLuaChon_MonChinh(String luaChon_MonChinh) {
		this.luaChon_MonChinh = luaChon_MonChinh;
	}


	/**
	 * @return the luaChon_MonPhu
	 */
	public String getLuaChon_MonPhu() {
		return luaChon_MonPhu;
	}


	/**
	 * @param luaChon_MonPhu the luaChon_MonPhu to set
	 */
	public void setLuaChon_MonPhu(String luaChon_MonPhu) {
		this.luaChon_MonPhu = luaChon_MonPhu;
	}


	/**
	 * @return the tongTien
	 */
	public double getTongTien() {
		return tongTien;
	}


	/**
	 * @param tongTien the tongTien to set
	 */
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}


	public void tinhtongTien() {
		double tongTien = 0;
		if (this.luaChon_MonChinh.equals("CƠM")) {
			tongTien += 20000;
		} else if (this.luaChon_MonChinh.equals("PHỞ")) {
			tongTien += 35000;
		} else if (this.luaChon_MonChinh.equals("BÁNH MÌ")) {
			tongTien += 15000;
		}

		// StringTokenizer ?
		StringTokenizer stk = new StringTokenizer(this.luaChon_MonPhu, ", ");
		while (stk.hasMoreElements()) {// lấy từng phần tử trong chuoix ra
			String monPhu = stk.nextToken();
			monPhu = monPhu.trim();// trim xóa khoảng trắng 2 đầu chuõi

			if (monPhu.equals("Trà sữa")) {
				tongTien += 20000;
			} else if (monPhu.equals("Cocacola")) {
				tongTien += 10000;
			} else if (monPhu.equals("Bánh Ngọt")) {
				tongTien += 10000;
			} else if (monPhu.equals("Nem")) {
				tongTien += 15000;
			}
		}

	}
}
