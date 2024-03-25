package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.tools.Tool;

public class MainView extends JFrame{
	private JMenu menu, submenu;
	private JMenuItem i1, i2, i3, i4, i5;
	private JMenuBar mb = new JMenuBar();
	private JButton jButton;
	private JLabel jLabel;
	
	public MainView() {
		this.setTitle("HongTu");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		this.setLayout(new BorderLayout());
		
 		
 		// set icon cho JFRAME
 		// đường link
 		URL url_icon_tick = MainView.class.getResource("icon_tick.png");
 		// tạo hình ảnh
 		Image img = Toolkit.getDefaultToolkit().createImage(url_icon_tick); 	
 		// đưa hình ảnh vô mainview
 		this.setIconImage(img);
 		
 		// JMenuBar
 		menu = new JMenu("Menu");
 		submenu = new JMenu("Sub Menu");
 		
 		i1 = new JMenuItem("New");
 		i2 = new JMenuItem("Save");
 		i3 = new JMenuItem("Save As");
 		i4 = new JMenuItem("Exit");
 		i5 = new JMenuItem("Test");
 		menu.add(i1);
 		menu.add(i2);
 		menu.add(i3);
 		submenu.add(i4);
 		submenu.add(i5);
 		menu.add(submenu);
 		mb.add(menu);
 		
 		// set icon cho các con của menu
 		i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_new.png"))));
 		i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save.png"))));
 		i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_save_as.png"))));
 		i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_exit.png"))));
 		i5.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_test.png"))));
 		
 		
 		// Jlabel
 		jLabel = new JLabel();
 		jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_img.png"))));

 		
 		//Jbutton
 		jButton = new JButton("Test button");
 		jButton.setFont(new Font("Arial", Font.BOLD, 50));
 		jButton.setSize(50,50);
 		
 		// set icon cho jbutton
 		jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("icon_test.png"))));

 		
 		this.setJMenuBar(mb);
 		this.add(jLabel, BorderLayout.CENTER);
 		this.add(jButton, BorderLayout.SOUTH);
 		this.setVisible(true);
 		
	}
	
	public static void main(String[] args ) {
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MainView();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	

}
