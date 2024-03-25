package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.event.MenuDragMouseEvent;
import javax.swing.event.MenuDragMouseListener;

import controller.MenuExampleControllr;
import controller.MenuExampleMouseListener;

public class MenuExampleView extends JFrame {

	
	private static final MouseListener menuExampleMouseListener = null;
	private JLabel jLabel;
	public JPopupMenu jPopupMenu;
	private JToolBar jToolBar;

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
		// *** MENU FILE
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
		

		//***MENU VIEW ( BÀI 93 _ TÍCH CHỌN TRÊN THÀNH MENU)
		JMenu jMenu_View = new JMenu("View");
		JCheckBoxMenuItem jCheckBoxMenuItem_toolbar = new JCheckBoxMenuItem("Toolbar");// cái khung bị tích á ( có thể tích dc nhiều)
		jCheckBoxMenuItem_toolbar.addActionListener(menuExampleControllr);
		jMenu_View.add(jCheckBoxMenuItem_toolbar);
		
		
		
		// A2 tương tự// ******MENU HELP
		JMenu jMenu_help = new JMenu("Help");	
	 
		JMenuItem jMenuItem_welcome = new JMenuItem("Welcome",KeyEvent.VK_1); // a1
		jMenuItem_welcome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, InputEvent.CTRL_DOWN_MASK));

		jMenuItem_welcome.addActionListener(menuExampleControllr);
		jMenu_help.add(jMenuItem_welcome); // dưa a1, dô A1
		
		//  :đưa A1, A2 dô AA
		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);
		jMenuBar.add(jMenu_View);

		// tạo thanh menu vào chương trình
		this.setJMenuBar(jMenuBar); // truyền / gắn cái A1, A2 dô AA
		
		// tạo TOOLBAR - THANH CÔNG CỤ
		 jToolBar = new JToolBar();
		JButton jButton_Undo = new JButton("Undo");
		jButton_Undo.setToolTipText("nhấn vào đây để quay lại thao tác vừa rồi"); // chỉ cần di chuột vào hình thì nó sẽ hiện gợi ý
		jButton_Undo.addActionListener(menuExampleControllr);
		JButton jButton_Redo = new JButton("Redo");
		jButton_Redo.setToolTipText("trở lại");
		jButton_Redo.addActionListener(menuExampleControllr);
		JButton jButton_Copy = new JButton("Copy");
		jButton_Copy.addActionListener(menuExampleControllr);
		JButton jButton_Cut = new JButton("Cut");
		jButton_Cut.addActionListener(menuExampleControllr);
		JButton jButton_Paste = new JButton("Paste");
		jButton_Paste.addActionListener(menuExampleControllr);
		jToolBar.add(jButton_Undo);
		jToolBar.add(jButton_Redo);
		jToolBar.add(jButton_Copy);
		jToolBar.add(jButton_Cut);
		jToolBar.add(jButton_Paste);

		
		// add jtoolbar lên phía bắc - trên cùng
//		this.add(jToolBar, BorderLayout.NORTH);
		
		
		// ***MENU CHUỘT PHẢI
		jPopupMenu = new JPopupMenu();
		
		JMenu jMenuPoupFont = new JMenu("Font");
		JMenuItem jMenuItemType = new JMenuItem("Type");
		jMenuItemType.addActionListener(menuExampleControllr);
		JMenuItem jMenuItemSize = new JMenuItem("Size");
		jMenuItemSize.addActionListener(menuExampleControllr);

		jMenuPoupFont.add(jMenuItemType);
		jMenuPoupFont.add(jMenuItemSize);
		
		JMenuItem jMenuItemCut = new JMenuItem("Cut");
		jMenuItemCut.addActionListener(menuExampleControllr);
		JMenuItem jMenuItemCopy = new JMenuItem("Coppy");
		jMenuItemCopy.addActionListener(menuExampleControllr);
		JMenuItem jMenuItemPast = new JMenuItem("Pasr");
		jMenuItemPast.addActionListener(menuExampleControllr);

	 
		jPopupMenu.add(jMenuPoupFont);
		jPopupMenu.addSeparator();// gạch giữa
		jPopupMenu.add(jMenuItemCut);
		jPopupMenu.add(jMenuItemCopy);
		jPopupMenu.add(jMenuItemPast);

		// phải add jpopumenu vào chtr chính thì nó ms đc
 		this.add(jPopupMenu);
		
		// tạo thêm sự kiện phải chuột jlabel
 		MenuExampleMouseListener menuExampleMouseListener = new MenuExampleMouseListener(this) ;
			this.addMouseListener(menuExampleMouseListener);// khi lick chuột trái hay phải thì nó sẽ xác định gọi cái nào để nó hiển thị ra đúng
		
		
		// tạo label hiển thi
		Font font = new Font("Arial", Font.BOLD, 50);
		jLabel = new JLabel();// ban đầu rổng
 		 
		
		
		
 		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
 	}
	
	
	public void setTextJlabel(String s) {
		this.jLabel.setText(s);
	}


		// bài NÀY CHƯA MỞ ĐC CHUỘT PHẢI
	
	// cái anyf là của jmanuitem tích chọn
	
	public void enableToolbar() { // hàm có tác dụng chỉ hiển thị toolbar khi đc gọi
		this.add(jToolBar, BorderLayout.NORTH);
		this.refresh();

	}
	public void disableToolbar() { // tắt/ xóa toobal khỏi màn hình
		this.remove(jToolBar);
		this.refresh();


	}
	public void refresh() {// cập nhật nhanh hơn
		//this.setResizable(false);
		this.pack();// đóng gói all giao diện / thu gọn nhưng có 2 cái kẹp lại thì ko bi
		//this.setResizable(false);

		this.setSize(500,500);// set lại kích cỡ
	}
	
}
