package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TimkiemView;

public class TimkiemListener implements ActionListener{
	
	private TimkiemView timkiemView;
	
	public TimkiemListener() {
		// TODO Auto-generated constructor stub
	}

	public TimkiemListener(TimkiemView timkiemView2) {
	this.timkiemView = timkiemView2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.timkiemView.timkiem();
	}
	
	

}
