package test;

import javax.swing.UIManager;

import view.ThucDonView;

public class Test {
public static void main(String[] args) {
	try
	{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new ThucDonView();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
