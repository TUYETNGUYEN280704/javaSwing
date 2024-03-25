package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimkiemListener;
import model.TimkiemModel;

// đếm số lượng chữ/ từ xuất hiện
 
public class TimkiemView extends JFrame {

	private TimkiemModel timkiemModel;
	private JTextArea jTextArea_vanBan;
	private JTextField jTextField_tuKhoa;
	private JLabel jLabel_ketqua;

	public TimkiemView() {
		this.timkiemModel = new TimkiemModel();
		this.init();
	}

	public void init() {
		this.setTitle("Tìm kiếm");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// font chữ
		Font font = new Font("Arial", Font.BOLD, 40);

		//CENTER ******************************************
		// tạo jlabel thứ 1 văn bản ( vùng 1 )
		JLabel jLabel_vanban = new JLabel("Văn Bản");
		jLabel_vanban.setFont(font);
		jTextArea_vanBan = new JTextArea(100, 100);// 100 dòng , 100 cột
		jTextArea_vanBan.setFont(font);
		// tạo jtextArea : cho phép nhập và sửa văn bản
		
		
		//TẠO THANH KÉO NGANG DỌC
		JScrollPane jScrollPane = new JScrollPane(); //cái pane là cái chứ mây scais kia
		jScrollPane.setViewportView(jTextArea_vanBan);
		// 1			0              2
		// 0 đưa 2 vào 1
		
		
		//FOOTER**********************************************
		TimkiemListener timkiemListener = new TimkiemListener(this);

		
		// tạo jlabel thứ 2, vùng 2
		JLabel jLabel_tukhoa = new JLabel("Từ Khóa");
		jLabel_tukhoa.setFont(font);
		jTextField_tuKhoa = new JTextField();
		jTextField_tuKhoa.setFont(font);
		
		
		// tạo jpanel thứ 1
//		JPanel jPanel_center = new JPanel();
//		jPanel_center.setLayout(new GridLayout(2, 1,10,10)); // xếp
//		jPanel_center.add(jLabel_vanban);
//		jPanel_center.add(jTextArea_vanBan);
//		jPanel_center.add(jLabel_tukhoa);
//		jPanel_center.add(jTextField_tuKhoa);
		
		
  		
		JButton jButton_thongKe = new JButton("Thống kê");
		jButton_thongKe.setFont(font);
		jButton_thongKe.addActionListener(timkiemListener);
		jButton_thongKe.setBackground(Color.BLUE);
	//	jButton_thongKe.setBorderPainted(false);
		
		
		jLabel_ketqua = new JLabel();
		jLabel_ketqua.setBackground(Color.PINK);
		jLabel_ketqua.setFont(font);
		jLabel_ketqua.setOpaque(true);
		
		// tạo ipanel thứ 2
		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2,2, 20, 20));
		jPanel_footer.add(jLabel_tukhoa);
		jPanel_footer.add(jTextField_tuKhoa);
		jPanel_footer.add(jButton_thongKe);
		jPanel_footer.add(jLabel_ketqua);
		
		
		

		// sắp xếp jpanel
		this.setLayout(new BorderLayout());
		this.add(jLabel_vanban, BorderLayout.NORTH);
		this.add(jScrollPane, BorderLayout.CENTER);

		this.add(jPanel_footer, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void timkiem() {
		this.timkiemModel.setVanBan(jTextArea_vanBan.getText());
		this.timkiemModel.setTuKhoa(jTextField_tuKhoa.getText());
		this.timkiemModel.timKiem();
		this.jLabel_ketqua.setText(this.timkiemModel.getKetQua());
	}

}
