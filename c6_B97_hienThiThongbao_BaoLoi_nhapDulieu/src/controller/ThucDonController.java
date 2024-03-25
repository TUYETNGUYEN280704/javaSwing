package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import view.ThucDonView;

public class ThucDonController implements ActionListener {
	private ThucDonView thucDonView;

	public ThucDonController(ThucDonView thucDonView) {
		this.thucDonView = thucDonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {// lấy ra or đưa vào đc các thành phần nút nhấn của thucdonview
		String monChinh = thucDonView.jComboBox_MonChinh.getSelectedItem().toString();
////		Enumeration<AbstractButton> buttons_MonChinh =  thucDonView().buttonGroup_MonChinh.getElements();
//		Enumeration<AbstractButton> buttons_MonChinh =  thucDonView.buttonGroup_MonChinh.gete
//
//		// nhiều nhóm thì cần lấy ra = for
//		while (buttons_MonChinh.hasMoreElements()) {
//			AbstractButton b = buttons_MonChinh.nextElement();
//			if (b.isSelected()) {
//				monChinh = b.getText();
//			}
//		}

		String monPhu = "";
		Object[] luaChonMonPhus = thucDonView.jList_MonPhu.getSelectedValues();
		for (Object o : luaChonMonPhus) {
 				monPhu = monPhu + o.toString() + "; ";
			
		}
		thucDonView.thucDonModel.setLuaChon_MonChinh(monChinh);
		thucDonView.thucDonModel.setLuaChon_MonPhu(monPhu);
		thucDonView.thucDonModel.tinhtongTien();
		thucDonView.hienThiKetQua();
		
		// tạo bảng thông báo sau khi nhập chọn menu
		String soTien_Chuoi = (String) JOptionPane.showInputDialog(thucDonView,
				thucDonView.jLabel_ThongTin.getText()
				+ "\n Nhập vào số tiền: ", " Thông báo",
				JOptionPane.PLAIN_MESSAGE);
		
		
//		// tạo bảng của sổ thông báo lỗi error
//		try {
//			double sotien = Double.valueOf(soTien_Chuoi);
//		} catch (Exception e2) {
//			JOptionPane.showMessageDialog(thucDonView, "Nhập dữ liệu sai!", "Error",JOptionPane.ERROR_MESSAGE);
//		}
		
		// tạo bảng hiển thị số tiền cần thối lại và 
		// và hiển thị cửa soor thông báo khi nhập sai
		try {
			double sotien = Double.valueOf(soTien_Chuoi);
			JOptionPane.showMessageDialog(thucDonView,
					"Thối tiền lại cho khách:" +(sotien - thucDonView.thucDonModel.getTongTien())
					, "Infor",
					JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(thucDonView,
					"Nhập dữ liệu sai!",
					"Error",
					JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		
		
	}
}
