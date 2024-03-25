package controller;

import java.awt.Checkbox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;

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
		} else if (button.equals("New")) {
			this.menuExampleView.setTextJlabel("bạn đã click JmenuItem New");
		} else if (button.equals("Welcome")) {
			this.menuExampleView.setTextJlabel("bạn đã click JmenuItem Welcome");
		} else if (button.equals("Help")) {
			this.menuExampleView.setTextJlabel("bạn đã click JmenuItem Help");

		} else if (button.equals("Exit")) {
			System.exit(0); // thoát
		}	else if (button.equals("Toolbar")) {
// ép kiểu sự kiện về thành cái nút vào AbstractButton
			System.out.println("Toolbar");
			AbstractButton checkBox = (AbstractButton) e.getSource();
			boolean check = checkBox.getModel().isSelected();
			if(check ) {
				this.menuExampleView.enableToolbar();
			}else {
				this.menuExampleView.disableToolbar();
			}
		}else { 
			this.menuExampleView.setTextJlabel("bạn đã click vào: "+button);
		}
	}

}
