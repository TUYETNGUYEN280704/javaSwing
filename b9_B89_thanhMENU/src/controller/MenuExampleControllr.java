package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class MenuExampleControllr implements ActionListener {

	private MenuExampleView menuExampleView;

	public MenuExampleControllr(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		if (button.equals("Open")) {
			this.menuExampleView.setTextJlabel("bạn đã click JmenuItem Open");
		} else if (button.equals("Exit")) {
			//this.menuExampleView.setTextJlabel("bạn đã click JmenuItem Exit");
		System.exit(0); // thoát
		} else if (button.equals("Welcome")) {
			this.menuExampleView.setTextJlabel("bạn đã click JmenuItem Welcome");

		}

	}

}
