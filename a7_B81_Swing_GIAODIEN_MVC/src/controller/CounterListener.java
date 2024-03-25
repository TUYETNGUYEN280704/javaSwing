package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;

import view.CounterView;
//counterListener : lắng nghe hành động của ng dùng

// implement 1 cái interface có sẵn tròn java
// interface này liên qquan đến khu vực nút bấm

public class CounterListener implements ActionListener{

	private CounterView ctv; 
	
	// để cái listener này hiểu chương tr này mún làm cái gì
	// thì nó phải nhận vào 1 cái couterview
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;

	}
	
//	public CounterListener(CounterView ctv) {
// 	}

	@Override
	public void actionPerformed(ActionEvent e) { // khi làm gì đó thì
 		//System.out.println(" bạn đã ấn nút! ");
 		
 		String src = e.getActionCommand();// hàm để biết là nhấn nút nào , nguồn sự kiện thoogn qua [getActionCommand] 
 		System.out.println(" bạn đã ấn nút! " +src);
	
	
	if(src.equals("up")) {
		this.ctv.increment();
	}else if(src.equals("down")) {
		this.ctv.decrement();
	}else if(src.equals("reset")) {
		this.ctv.reset();
	}
 	
}}
