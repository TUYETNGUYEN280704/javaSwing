package test;

import javax.swing.UIManager;

import view.MenuExampleView;
 
public class test {
public static void main(String[] args) {
//	new MenuExampleView();
	try
	{
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new MenuExampleView();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
