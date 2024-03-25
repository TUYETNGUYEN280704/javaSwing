package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LastButtonView;

public class LastButtonListener implements ActionListener{
// hành động của ng dùng
	private LastButtonView lastButtonView;
	
	public LastButtonListener() {
 	}
	
	
	public LastButtonListener(LastButtonView lastButtonView) {
   		this.lastButtonView = lastButtonView;
	}




	


	@Override
	public void actionPerformed(ActionEvent e) {
		String nguonSuKien = e.getActionCommand();
		if(nguonSuKien.equals("1")) {
			this.lastButtonView.changTo_1();
		}else if(nguonSuKien.equals("2")) {
			this.lastButtonView.changTo_2();
		}else if(nguonSuKien.equals("3")) {
			this.lastButtonView.changTo_3();
		}else if(nguonSuKien.equals("4")){
			this.lastButtonView.changTo_4();
		}else {
		}
	}
	
	
}
