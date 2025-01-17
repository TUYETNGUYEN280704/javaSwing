package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseExampleController;
import model.MouseExampleModel;

public class MouseExampleView extends JFrame {

	private MouseExampleModel model;
	// mấy cái này là do khai báo biến toàn cục nè   
	private JPanel jPanel_mouse;
	private JPanel jPanel_info;
	private JLabel jLabel_position;
	private JLabel jLabel_x;
	private JLabel jLabel_y;
	private JLabel jLabel_count;
	private JLabel jLabel_count_value;
	private JLabel jLabel_empty_1;
	private JLabel jLabel_check_in;
	private JLabel jLabel_check_in_value;
	private JLabel jLabel_empty_2;

	public MouseExampleView() throws HeadlessException {
		this.model = new MouseExampleModel();
		this.init();
	}
	public void init() {
		this.setTitle("MOUSE EAXMPLE");
		this.setSize(600, 500);
		this.setLocationRelativeTo(rootPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		MouseExampleController mouseExampleController = new MouseExampleController(this);
		Font font = new Font("Arial", Font.BOLD, 40);
		
		
		//h muốn làm phần listener thfi phải khai báo cái này
		//về biến toàn cục bằng cách xóa cái đầu đi r add filter là oce
		//panel 1
//		JPanel jPanel_mouse = new JPanel(); đó cxoas cái này nè
		jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.CYAN);
		jPanel_mouse.addMouseListener(mouseExampleController);
		jPanel_mouse.addMouseMotionListener(mouseExampleController);
		
		
 		
		// panel 2
	    jPanel_info = new JPanel();
		jPanel_info.setLayout(new GridLayout(3,3));
		
		// 9 jlaybel nhỏ trong panel2
		// laybel là cái khung bên trong có chữ á
		 jLabel_position = new JLabel("Position: ");
		 jLabel_position.setFont(font);
		 jLabel_x = new JLabel("x = ");
		 jLabel_x.setFont(font);
		 jLabel_y = new JLabel("y = ");
		 jLabel_y.setFont(font);
		 jLabel_count = new JLabel("Number of clicks: ");
		 jLabel_count.setFont(font);
		 jLabel_count_value = new JLabel("n");
		 jLabel_count_value.setFont(font);
		 jLabel_empty_1 = new JLabel(); //lable rỗng
		 jLabel_empty_1.setFont(font);
		 jLabel_check_in = new JLabel("Mouse is in component: ");
		 jLabel_check_in.setFont(font);
		 jLabel_check_in_value = new JLabel("no");
		 jLabel_check_in_value.setFont(font);
		 jLabel_empty_2 = new JLabel(); // lable rỗng
		 jLabel_empty_2.setFont(font);

		
		//add cái jlabell vô panel nè theo thứ tự
		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_x);
		jPanel_info.add(jLabel_y);
		jPanel_info.add(jLabel_count);
		jPanel_info.add(jLabel_count_value);
		jPanel_info.add(jLabel_empty_1);
		jPanel_info.add(jLabel_check_in);
		jPanel_info.add(jLabel_check_in_value);
		jPanel_info.add(jLabel_empty_2);

		
		
		//layout là cái chương trình chính nha , cái khung bên trong á
		// là trong layout sẽ có các panel
		// trong panel có các jlabel, hoặc các button
		// sau khi làm xong hết mấy cái nhỏ r thì đưa vô layour
		// và đặt vị trí để đặt các cái layout cho đpẹ
		this.setLayout(new BorderLayout());// nè cần tạo borderlayout(chỗ á))
		this.add(jPanel_mouse, BorderLayout.CENTER);//nghĩa là bỏ cái panel mouse dô thì phải dùng border sắp xếp chỗ cho nó là center
		this.add(jPanel_info, BorderLayout.SOUTH);
		
		
		this.setVisible(true);
	}
	public void click() {
		this.model.addClick(); // tăng lên 1 đơn vị trong phần model
		this.jLabel_count_value.setText(this.model.getCount() +""); // lấy gtr đếm đc gắn vô màn hình jlabel
		
	}
	public void enter() {
		this.model.enter();
		this.jLabel_check_in_value.setText(this.model.getCheckIn());
		
	}
	public  void exit() {
		this.model.exit();
		this.jLabel_check_in_value.setText(this.model.getCheckIn());
		
	}
	public void update (int x, int y) {
		this.model.setX(x);
		this.model.setY(y);
		this.jLabel_x.setText(this.model.getX()+"");
		this.jLabel_y.setText(this.model.getY()+"");

	}
}
