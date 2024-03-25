package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MinCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private MinCalculatorModel minCalculatorModel;

	private JTextField jTextField_firstValue;
	private JTextField jTextField_secondValue;
	private JTextField jTextField_answer;


	public MiniCalculatorView() throws HeadlessException {
		this.minCalculatorModel =  new MinCalculatorModel();
		this.init();
	}

	public void init() {
		this.setTitle("MINI CALCULATOR");
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// jpanel 1 noi nhap dl

		// font
		Font font = new Font("Arial", Font.BOLD, 40);

		// JLabel //
		// tạo noi hien thị chữ
		JLabel jLabel_firstValue = new JLabel("1st Value");
		jLabel_firstValue.setFont(font);
		JLabel jLabel_secondValue = new JLabel("2st Value");
		jLabel_secondValue.setFont(font);
		JLabel jLabel_answer = new JLabel("Answer");
		jLabel_answer.setFont(font);

		// tạo khu vực để nhập dữ liệu ( trường văn bản)
//		JTextField jTextField_firstValue = new JTextField(50);
//		jTextField_firstValue.setFont(font);
//		JTextField jTextField_secondValue = new JTextField(50);
//		jTextField_secondValue.setFont(font);
//		JTextField jTextField_answer = new JTextField(50);
//		jTextField_answer.setFont(font);
		// |
		// | biến mấy cái này thành biến toàn cục để nhưng phương thức khác có thể gọi , thì phải thêm private ở trên cùng
		jTextField_firstValue = new JTextField(50);
		jTextField_firstValue.setFont(font);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(font);

		// tạo nơi để bỏ input và output ( bỏ jtexfield vs jlabel ) vào trong 1 jpanel
		JPanel jPanelIO = new JPanel();
		jPanelIO.setLayout(new GridLayout(3, 2, 10, 10)); // bố cục 3 hàng 2 cột , mỗi ô cách nhau 10 10
		// gắn jtext vs jlabel dô jpanel 1
		jPanelIO.add(jLabel_firstValue); // đứng cạnh nhau
		jPanelIO.add(jTextField_firstValue);// đứng cạnh nhau
		jPanelIO.add(jLabel_secondValue);
		jPanelIO.add(jTextField_secondValue);
		jPanelIO.add(jLabel_answer); // đứng cạnh nhau
		jPanelIO.add(jTextField_answer);

		// kêu cái listener bên kia qua
		MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);
		// tạo jbutton nút ấn
		JButton jButton_plus = new JButton("+");
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(miniCalculatorListener);
		jButton_plus.setBackground(Color.ORANGE);


		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(miniCalculatorListener);
		jButton_minus.setBackground(Color.PINK);


		JButton jButton_multiply = new JButton("*");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(miniCalculatorListener);
		jButton_multiply.setBackground(Color.RED);


		JButton jButton_divide = new JButton("/");
		jButton_divide.setFont(font);
		jButton_divide.addActionListener(miniCalculatorListener);
		jButton_divide.setBackground(Color.LIGHT_GRAY);


		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(miniCalculatorListener);
		jButton_pow.setBackground(Color.YELLOW);


		JButton jButton_mod = new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(miniCalculatorListener);
		jButton_mod.setBackground(Color.BLUE);

		// đưa nút ấn dô jpanel 2
		JPanel jPanel_button = new JPanel();
		jPanel_button.setLayout(new GridLayout(2, 3));
		jPanel_button.add(jButton_plus);
		jPanel_button.add(jButton_minus);
		jPanel_button.add(jButton_multiply);
		jPanel_button.add(jButton_divide);
		jPanel_button.add(jButton_pow);
		jPanel_button.add(jButton_mod);

		// gắn jpanel vô frame
		// layout là bố cục
		this.setLayout(new BorderLayout(10, 10));
		this.add(jPanelIO, BorderLayout.CENTER);
		this.add(jPanel_button, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	// thực hiện lệnh tính toán
	public void plus() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		double secondValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		this.minCalculatorModel.setFirstValue(firstValue);
		this.minCalculatorModel.setSecondValue(secondValue);
		this.minCalculatorModel.plus();
		this.jTextField_answer.setText(this.minCalculatorModel.getAnswer()+"");
	}

	public void minus() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		double secondValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		this.minCalculatorModel.setFirstValue(firstValue);
		this.minCalculatorModel.setSecondValue(secondValue);
		this.minCalculatorModel.minus();
		this.jTextField_answer.setText(this.minCalculatorModel.getAnswer()+"");
	}
	public void multiply() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		double secondValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		this.minCalculatorModel.setFirstValue(firstValue);
		this.minCalculatorModel.setSecondValue(secondValue);
		this.minCalculatorModel.multiply();
		this.jTextField_answer.setText(this.minCalculatorModel.getAnswer()+"");
	}
	public void divide() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		double secondValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		this.minCalculatorModel.setFirstValue(firstValue);
		this.minCalculatorModel.setSecondValue(secondValue);
		this.minCalculatorModel.divide();
		this.jTextField_answer.setText(this.minCalculatorModel.getAnswer()+"");
	}
	public void pow() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		double secondValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		this.minCalculatorModel.setFirstValue(firstValue);
		this.minCalculatorModel.setSecondValue(secondValue);
		this.minCalculatorModel.pow();
		this.jTextField_answer.setText(this.minCalculatorModel.getAnswer()+"");
	}
	public void mod() {
		double firstValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		double secondValue = Double.valueOf(jTextField_firstValue.getText()); // ép kiểu theo answer 
		this.minCalculatorModel.setFirstValue(firstValue);
		this.minCalculatorModel.setSecondValue(secondValue);
		this.minCalculatorModel.mod();
		this.jTextField_answer.setText(this.minCalculatorModel.getAnswer()+"");
	}

}
