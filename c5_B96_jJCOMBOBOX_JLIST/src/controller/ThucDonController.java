package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
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
	}
}
