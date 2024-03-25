package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.MenuExampleControllr;

public class MenuExampleView extends JFrame {

	
	private JLabel jLabel;

	public MenuExampleView() {
		this.setTitle("MENU EXAMPLE");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout()); // tạo jlabel 

		
		//tạo controller
		MenuExampleControllr menuExampleControllr= new MenuExampleControllr(this);
		
		// AA: tạo thanh menu chính 
		JMenuBar jMenuBar = new JMenuBar();
		//  A1 , /..tạo cái chức năng hiển thị trên thanh menu chính
		JMenu jMenu_file = new JMenu("File");
		
		// TẠO PHÍM TẮT KeyEvent.VK_N ...
		// a1,  tạo cái chức năng nhỏ bên trong cái A1
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jMenuItem_new.addActionListener(menuExampleControllr);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N , InputEvent.CTRL_DOWN_MASK));
		JMenuItem jMenuItem_open = new JMenuItem("Open",  KeyEvent.VK_O);
		jMenuItem_open.addActionListener(menuExampleControllr);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O , InputEvent.CTRL_DOWN_MASK));
		JMenuItem jMenuItem_exit = new JMenuItem("Exit",  KeyEvent.VK_X);
		jMenuItem_exit.addActionListener(menuExampleControllr);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));

		// đưa mấy cái a1, vô A1
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator(); // tạo cái gạch ngang
		jMenu_file.add(jMenuItem_exit);
		jMenu_file.addSeparator(); // tạo cái gạch ngang
		jMenu_file.add(jMenuItem_new);
		

		
		// A2 tương tự
		JMenu jMenu_help = new JMenu("Help");	
	 
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome",KeyEvent.VK_1); // a1
		jMenuItem_welcome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_DOWN_MASK));

		jMenuItem_welcome.addActionListener(menuExampleControllr);
		jMenu_help.add(jMenuItem_welcome); // dưa a1, dô A1
		
		//  :đưa A1, A2 dô AA
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		
		// tạo thanh menu vào chương trình
		this.setJMenuBar(jMenuBar); // truyền / gắn cái A1, A2 dô AA
		
//		// tạo TOOLBAR - THANH CÔNG CỤ
//		JToolBar jToolBar = new JToolBar();
//		JButton jButton_Undo = new JButton("Undo");
//		JButton jButton_Redo = new JButton("Redo");
//		JButton jButton_Copy = new JButton("Copy");
//		JButton jButton_Cut = new JButton("Cut");
//		JButton jButton_Paste = new JButton("Paste");
//		jToolBar.add(jButton_Undo);
//		jToolBar.add(jButton_Redo);
//		jToolBar.add(jButton_Copy);
//		jToolBar.add(jButton_Cut);
//		jToolBar.add(jButton_Paste);

		
		// add nó lên phía bắc - trên cùng
		//this.add(jToolBar, BorderLayout.NORTH);
		
		// tạo label hiển thi
		Font font = new Font("Arial", Font.BOLD, 50);
		jLabel = new JLabel();// ban đầu rổng
		 
		
		
		
 		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
 	}
	
	
	public void setTextJlabel(String s) {
		this.jLabel.setText(s);
	}


		
	
	
}
