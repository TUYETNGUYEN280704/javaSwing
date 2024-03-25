package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;

import controller.ThucDonController;
import model.ThucDonModel;
/*
 * JRadioButton
 * tạo nút có sự lựa chọn ấn dô được
 * */

public class ThucDonView extends JFrame {
	public ThucDonModel thucDonModel;
//	public JRadioButton jRadioButton_Com;
//	public JRadioButton jRadioButton_Pho;
//	public JRadioButton jRadioButton_BanhMi;
//	//public ButtonGroup buttonGroup_MonChinh;
//	public JCheckBox jCheckBox_TraSua;
//	public JCheckBox jCheckBox_Cocacola;
//	public JCheckBox jCheckBox_BanhNgot;
//	public JCheckBox jCheckBox_Nem;
	public JLabel jLabel_ThongTin;
	public ArrayList<JCheckBox> list_buttonGroup_MonPhu;
	public JComboBox<String> jComboBox_MonChinh;
	//public Object buttonGroup_MonChinh;
	public JList<String> jList_MonPhu;

	public ThucDonView() {
		this.thucDonModel = new ThucDonModel();
		this.init();
	}

	public void init() {
		this.setTitle("Thực Đơn");
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		Font font = new Font("Arial", Font.BOLD, 20);

		JLabel header = new JLabel("THỰC ĐƠN NHÀ HÀNG HONGTU");
		header.setFont(font);
		JPanel jPanel_TieuDe = new JPanel();
		jPanel_TieuDe.add(header);
		this.add(jPanel_TieuDe, BorderLayout.NORTH);

		// JRadioButton chọn đc 1
		JPanel jPanel_MonChinh = new JPanel();
		jPanel_MonChinh.setBackground(Color.green);
		jPanel_MonChinh.setLayout(new FlowLayout());// sếp kiểu lưới nó bằng nhau 1 dòng 3 cột

		//JCOMBOBO
		String[] cacMonChinh = new String[] {"CƠM", "PHỞ", "BÁNH MÌ"};
		 jComboBox_MonChinh = new JComboBox<String>(cacMonChinh);
		
		
		
		
// jRadioButton_Com = new JRadioButton("CƠM");
//		jRadioButton_Com.setFont(font);
//		  jRadioButton_Pho = new JRadioButton("PHỞ");
// 		jRadioButton_Pho.setFont(font);
//		  jRadioButton_BanhMi = new JRadioButton("BÁNH MÌ");
//// 		jRadioButton_BanhMi.setFont(font);
//		buttonGroup_MonChinh = new ButtonGroup();
//		buttonGroup_MonChinh.add(jRadioButton_Com);
//		buttonGroup_MonChinh.add(jRadioButton_Pho);
//		buttonGroup_MonChinh.add(jRadioButton_BanhMi);
//		jPanel_MonChinh.add(jRadioButton_Com);
//		jPanel_MonChinh.add(jRadioButton_Pho);
		jPanel_MonChinh.add(jComboBox_MonChinh);

		// jcheckbox chọn đc nhiều
		JPanel jPanel_MonPhu = new JPanel();
		jPanel_MonPhu.setBackground(Color.PINK);
		jPanel_MonPhu.setLayout(new GridLayout(2, 2));
		
		
		String[] cacMonPhu = new String[] {"TRÀ SỮA", "COCACOLA", "BÁNH NGỌT", "NEM"};
		 jList_MonPhu  = new JList<String>(cacMonPhu);
		jList_MonPhu.setFont(font);
		jPanel_MonPhu.add(jList_MonPhu);
		
//		jCheckBox_TraSua = new JCheckBox("Trà sữa");
//		jCheckBox_TraSua.setFont(font);
//		jCheckBox_Cocacola = new JCheckBox("Cocacola");
//		jCheckBox_Cocacola.setFont(font);
//		jCheckBox_BanhNgot = new JCheckBox("Bánh Ngọt");
//		jCheckBox_BanhNgot.setFont(font);
//		jCheckBox_Nem = new JCheckBox("Nem");
//		jCheckBox_Nem.setFont(font);

//		jPanel_MonPhu.add(jCheckBox_TraSua);
//		jCheckBox_TraSua.setBackground(Color.blue);
//		jPanel_MonPhu.add(jCheckBox_Cocacola);
//		jCheckBox_Cocacola.setBackground(Color.cyan);
//		jPanel_MonPhu.add(jCheckBox_BanhNgot);
//		jCheckBox_BanhNgot.setBackground(Color.YELLOW);
//		jPanel_MonPhu.add(jCheckBox_Nem);
//		jCheckBox_Nem.setBackground(Color.PINK);

//		list_buttonGroup_MonPhu = new ArrayList<JCheckBox>();
//		// list_buttonGroup_MonPhu = new ButtonGroup();
//		list_buttonGroup_MonPhu.add(jCheckBox_TraSua);
//		list_buttonGroup_MonPhu.add(jCheckBox_Cocacola);
//		list_buttonGroup_MonPhu.add(jCheckBox_BanhNgot);
//		list_buttonGroup_MonPhu.add(jCheckBox_Nem);

		JPanel jPanel_luaChon = new JPanel();
		jPanel_luaChon.setLayout(new BorderLayout()); // xsep lưới, 2 dòng 1 cột
		jPanel_luaChon.add(jPanel_MonChinh, BorderLayout.NORTH);
		jPanel_luaChon.add(jPanel_MonPhu, BorderLayout.CENTER);
		this.add(jPanel_luaChon, BorderLayout.CENTER);

		
		
		ActionListener thucDonController = new ThucDonController(this);

		// jpanel thanh toan
		JPanel jPanel_ThanhToan = new JPanel();
		jPanel_ThanhToan.setLayout(new GridLayout(1, 2));
		jLabel_ThongTin = new JLabel();
		jLabel_ThongTin.setFont(font);
		jLabel_ThongTin.setForeground(Color.RED);
		JButton jButton_ThanhToan = new JButton("Thanh Toán");
		jButton_ThanhToan.setFont(font);
		jButton_ThanhToan.addActionListener(thucDonController);
		jPanel_ThanhToan.add(jLabel_ThongTin);
		jPanel_ThanhToan.add(jButton_ThanhToan);
		this.add(jPanel_ThanhToan, BorderLayout.SOUTH);
		jButton_ThanhToan.setBackground(Color.RED);

		//

		// set font cho all

		this.setVisible(true);
	}
//bài 18:22

	public void hienThiKetQua() {
		String kq = "Món chính: " + this.thucDonModel.getLuaChon_MonChinh() + "; Món phụ: "
				+ this.thucDonModel.getLuaChon_MonPhu() + "; Tổng tiền: " + this.thucDonModel.getTongTien();
		this.jLabel_ThongTin.setText(kq);
	}

}
