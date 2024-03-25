package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.MenuExampleView;

public class MenuExampleMouseListener implements MouseListener {

	MenuExampleView menuExampleView;
//	
//	public MenuExampleMouseListener() {
//		// TODO Auto-generated constructor stub
//	}
//	
	
	public MenuExampleMouseListener(MenuExampleView menuExampleView) {
 		this.menuExampleView = menuExampleView;
	}

 
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) { // ấn cái chuoojt xuống
		if(e.isPopupTrigger()) { // nếu ấn chuột phải
			this.menuExampleView.jPopupMenu.show(e.getComponent(), e.getX(), e.getY()); // get x , y là tọa độ
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
