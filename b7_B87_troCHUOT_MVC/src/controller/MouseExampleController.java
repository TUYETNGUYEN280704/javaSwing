package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import view.MouseExampleView;

public class MouseExampleController implements MouseListener, MouseMotionListener{

	private MouseExampleView mouseExampleView;
	
	 //contructor
	public MouseExampleController(MouseExampleView mouseExampleView) {
 		this.mouseExampleView = mouseExampleView;
	}

	@Override
	public void mouseClicked(MouseEvent e) { // click vô chụt
  		this.mouseExampleView.click();
	}

	@Override
	public void mousePressed(MouseEvent e) { // nhấn và giữ chuột
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) { //
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) { // đi vào khu vực
		this.mouseExampleView.enter();
		// cập nhật tọa độ
		int x = e.getX();
		int y = e.getY();
		this.mouseExampleView.update(x,y);
	}

	@Override
	public void mouseExited(MouseEvent e) { // đi ra khỏi khu vực
		this.mouseExampleView.exit();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
 		
	}

	@Override
	public void mouseMoved(MouseEvent e) { // cập nhật tọa độ khi khi chuyển chuột trong label
		// cập nhật tọa độ
				int x = e.getX();
				int y = e.getY();
				this.mouseExampleView.update(x,y);
	}
	
	

}
