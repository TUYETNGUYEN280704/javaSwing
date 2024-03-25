package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import view.MiniCalculatorView;

public class MiniCalculatorListener implements ActionListener {

	
	private MiniCalculatorView miniCalculatorView;
	 
	public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
 		this.miniCalculatorView = miniCalculatorView;
	}
	 // xử lý từng nút 1
	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		if(button.equals("+")) {
			this.miniCalculatorView.plus();
		}else if( button.equals("-")) {
			this.miniCalculatorView.minus();
		}else if(button.equals("*")) {
			this.miniCalculatorView.multiply();
		}else if(button.equals("/")) {
			this.miniCalculatorView.divide();
		}else if(button.equals("^")) {
			this.miniCalculatorView.pow();
		}else if(button.equals("%")) {
			this.miniCalculatorView.mod();
		}
	}

}