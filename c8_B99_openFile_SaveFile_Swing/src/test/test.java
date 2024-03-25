package test;

import javax.swing.UIManager;

import controller.MyNotePadController;
import view.MyNotePadView;
 
public class test {
public static void main(String[] args) {
	try
	{// giao diệ
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		new MyNotePadView();
	}catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
