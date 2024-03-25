package test;

import javax.swing.UIManager;

import view.TimkiemView;

public class test {
public static void main(String[] args) {
//	new TimkiemView(); 
	
	// tùy chỉnh theo giao diện của windown
	try
	{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new TimkiemView();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
