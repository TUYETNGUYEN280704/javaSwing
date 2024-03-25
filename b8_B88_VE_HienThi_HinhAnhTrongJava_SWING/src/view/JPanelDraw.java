package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel {
	
public JPanelDraw() {
	this.setBackground(Color.BLUE);
}
	// vẽ hình ảnh
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// vẽ 
		g.setColor(Color.RED);
		g.drawLine(15, 15, 50, 150);
		
		g.setColor(Color.YELLOW);
		g.drawOval(255, 255, 50, 50);
		
		g.setColor(Color.BLACK);
		g.drawRect(10, 20, 20, 39);
		
		// hình trong có tô màu bên trong
		g.setColor(Color.GREEN);
		g.fillRect(100, 100, 100, 100);
		
		// fill thì sẽ là đổ màu bên trong hình
		
		g.setColor(Color.YELLOW);
		g.drawString(" hello tú", 100, 150);
	
	}
	
	

}
