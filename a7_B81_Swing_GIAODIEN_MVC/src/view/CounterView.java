package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.TypeInfo;
import org.w3c.dom.UserDataHandler;
import org.w3c.dom.html.HTMLBodyElement;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {

	private CounterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JLabel jLabel_value;  // xuất valude lên màn hình
	// thêm nút reset
	private JButton jButton_reset;
	
	public CounterView() {
		this.counterModel = new CounterModel();
		this.init(); // hàm khởi tạo
		this.setVisible(true);
	}

	
	public void init() { // viêt riêng hàm để khởi tạo
		this.setTitle("Counter");
		this.setSize(300,300);
		this.setLocationRelativeTo(null);//  căn chỉnh cho cửa sổ nằm ở giữa màn hình

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// muốn gắn điều kiện cho đối tượng nào đó thi phải tạo ra 
		
		// 1 cái listener ( để thực hiện hành động tăng giảm)
		ActionListener ac = new CounterListener(this); // this là counterview hiện tại ta đg làm việc
		
		
		jButton_up = new JButton("up");
		// add sự kiện cho từng nút ấn 
		jButton_up.addActionListener(ac); // khi mà ngta nhấn vào nút jButton_up thì mk sẽ đi đến 1 cái contrller 
											//nào đó để nó quản lý thao tác của cái nút [jButton_up.addActionListener(ac]
		
		
		// cho jbtton có gtr
 		jButton_down = new JButton("down");
 		jButton_down.addActionListener(ac); // tương tự
 		
 		jButton_reset = new JButton("reset");
 		jButton_reset.addActionListener(ac); // tương tự

 		
		jLabel_value =  new JLabel(this.counterModel.getValue()+ ""  +JLabel.CENTER ); // vì label chỉ nhận text nên cần ""
		//										JLabel.CENTER: căn chữ vào giữa khung 
 		
		
		
		
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new  BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jPanel.add(jLabel_value, BorderLayout.CENTER);
		jPanel.add(jButton_down, BorderLayout.EAST);
		jPanel.add(jButton_reset, BorderLayout.SOUTH);

		
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
		
		
		// lúc ấn nút mà muốn nó tăng giảm giá trị á thì
		// phải thông qua thằng counterModel
		// vì countermodel nó mới lưu giữ giá trị hiện tại là boa nhiêu 
		// thì nó là đối tượng để luuw giữ các gtr đó
		// nên h phải viết hàm .... bên counterview để thằng 
		//controller nó co stheer gọi đc cái hàm này đẻ tăng giá trị lên
	}
		
		public void increment() {
			this.counterModel.increment();
			this.jLabel_value.setText(this.counterModel.getValue()+"");// lấy ngược cái value ở trong cái model ra
		}
		
		public void decrement() {
			this.counterModel.decrement();
			this.jLabel_value.setText(this.counterModel.getValue()+"");// lấy ngược cái value ở trong cái model ra
		}
		
		public void reset() {
			this.counterModel.reset();
			this.jLabel_value.setText(this.counterModel.getValue()+"");
			
		}
}

