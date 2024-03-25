package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame{
	
	private LastButtonModel lastButtonModel;
	private JLabel jLabel;
	
	public LastButtonView() {
		this.lastButtonModel = new LastButtonModel();
		
		this.init();
		
		
	}
	
	public void init() {
		this.setTitle(" Last Button");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		// tạo 1 cái khung 1 chứa nút 1234
		JPanel jPanel_center = new JPanel();
		jPanel_center.setLayout(new GridLayout(2,2));//2 dòng 2 cột/ các khung có sixe = nhau
		
	
		// tạo nút nhấn , tạo 4 cái
		JButton jButton_1  = new JButton("1");
		JButton jButton_2  = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		
		// đưa từng cái nút vào jpanel
		jPanel_center.add(jButton_1);
		jPanel_center.add(jButton_2);
		jPanel_center.add(jButton_3);
		jPanel_center.add(jButton_4);
		
		// tạo khung 2
		JPanel jPanel_Footer = new JPanel();
		// hiển thị ra 1 cái text
		  jLabel = new JLabel("**---**"); // để ng thấy chỗ này để ghi
		jPanel_Footer.add(jLabel);
		
		// cửa số lớn đưa BorderLayout dô
		this.setLayout(new BorderLayout());
		
		// add từng phần tử vào 
		this.add(jPanel_center, BorderLayout.CENTER);
		this.add(jPanel_Footer, BorderLayout.SOUTH);
		this.setVisible(true);
		
		
		//tạo listener
		LastButtonListener lastButtonListener = new LastButtonListener(this);
		
		// add listener cho từng button
		jButton_1.addActionListener(lastButtonListener);
		jButton_2.addActionListener(lastButtonListener);
		jButton_3.addActionListener(lastButtonListener);
		jButton_4.addActionListener(lastButtonListener);

		
		// tạo font chữ cho các button
		Font font = new Font("Arial", Font.BOLD,40);//in đậm, size 20
		jButton_1.setFont(font);
		jButton_2.setFont(font);
		jButton_3.setFont(font);
		jButton_4.setFont(font);
		
		// tạo font chữ cho phần text ]setLayout[
		jLabel.setFont(font);
		
	}
		// hàm thay đổi
		public void changTo_1() {
			// biến gtrij của value về 1
			this.lastButtonModel.setValue_1();
			jLabel.setText("Last button:"+this.lastButtonModel.getValue());
		}
		
		public void changTo_2() {
			// biến gtrij của value về 1
			this.lastButtonModel.setValue_2();
			jLabel.setText("Last button:"+this.lastButtonModel.getValue());
		}
		public void changTo_3() {
			// biến gtrij của value về 1
			this.lastButtonModel.setValue_3();
			jLabel.setText("Last button:"+this.lastButtonModel.getValue());
		}
		public void changTo_4() {
			// biến gtrij của value về 1
			this.lastButtonModel.setValue_4();
			jLabel.setText("Last button:"+this.lastButtonModel.getValue());
		}
	
	
	
}
