package model;
//model : nơi quản lý all đối tương (dữ liệu , thuộc tính)

import java.util.Set;

public class CounterModel {

	private int value;

	public CounterModel() {
		this.value = 0;
		// khi khởi tạo chtr lên thì value =0
	}

	public int getValue() {
		return value;
	}

	public void increment() { // hàm tăng giatri
		this.value++;
	}

	public void decrement() {
		this.value--;
	}
	
	
	public void reset() {
		this.value =0;
		
	}
	
	//thứ tự là: model/view/controller/ test
	

}
