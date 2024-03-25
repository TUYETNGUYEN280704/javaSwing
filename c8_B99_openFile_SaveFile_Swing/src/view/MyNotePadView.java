package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import controller.MyNotePadController;
import model.MyNotePadModel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyNotePadView extends JFrame {

//	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public MyNotePadModel model;
	public JLabel lblNewLabel;
	public JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyNotePadView frame = new MyNotePadView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
//				try
//				{
//					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//					new MyNotePadView();
//				}catch(Exception ex) {
//					ex.printStackTrace();
//				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyNotePadView() {
		this.model = new MyNotePadModel(); // thêm dô
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 575);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		 textArea = new JTextArea();
		//contentPane.add(textArea, BorderLayout.SOUTH); 
		
		JScrollPane scrollPane = new JScrollPane(textArea);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(10, 50));// chiều rộng
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(null);
		
		 lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 300, 30);
		panel.add(lblNewLabel);
		
		
		// add sự kiện
		ActionListener action = new MyNotePadController(this);
			
		 
		
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(action) ;
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		btnOpen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnOpen.setBounds(389, 10, 111, 30);
		panel.add(btnOpen);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(action) ;

	//	btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSave.setBounds(521, 10, 120, 30);
		panel.add(btnSave);
		
		 this.setVisible(true);
	}
}
