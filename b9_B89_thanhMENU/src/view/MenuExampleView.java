package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.MenuExampleControllr;

public class MenuExampleView extends JFrame {

	
	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("MENU EXAMPLE");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//tạo controller
		MenuExampleControllr menuExampleControllr= new MenuExampleControllr(this);
		
		// AA: tạo thanh menu chính 
		JMenuBar jMenuBar = new JMenuBar();
		//  A1 , /..tạo cái chức năng hiển thị trên thanh menu chính
		JMenu jMenu_file = new JMenu("File");
		// a1,  tạo cái chức năng nhỏ bên trong cái A1
		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(menuExampleControllr);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(menuExampleControllr);

		// đưa mấy cái a1, vô A1
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator(); // tạo cái gạch ngang
		jMenu_file.add(jMenuItem_exit);
		

		
		// A2 tương tự
		JMenu jMenu_help = new JMenu("Help");	
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome"); // a1
		jMenuItem_welcome.addActionListener(menuExampleControllr);
		jMenu_help.add(jMenuItem_welcome); // dưa a1, dô A1
		
		//  :đưa A1, A2 dô AA
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		// tạo thanh menu vào chương tr
		this.setJMenuBar(jMenuBar); // truyền / gắn cái A1, A2 dô AA
		
		// tạo label hiển thi
		Font font = new Font("Arial", Font.BOLD, 50);
		jLabel = new JLabel();// ban đầu rổng
		 
		
		
		
		this.setLayout(new BorderLayout()); // tạo jlabel 
		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
 	}
	
	
	public void setTextJlabel(String s) {
		this.jLabel.setText(s);
	}


		
	
	
}
