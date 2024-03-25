package model;

public class MinCalculatorModel {
	private double firstValue; // bien 1
	private double secondValue; // bien 2
	private double answer; // kq 
	
	
	public MinCalculatorModel() {
		// gtr ban dau mac dinh = 0
		
	}


	public double getFirstValue() {
		return firstValue;
	}


	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}


	public double getSecondValue() {
		return secondValue;
	}


	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}


	public double getAnswer() {
		return answer;
	}


	public void setAnswer(double answer) {
		this.answer = answer;
	}
	
	// hàm itnhs toán
	public void plus() { //+
		this.answer = this.firstValue + this.secondValue;
	}
	
	public void minus() {// tru
		this.answer = this.firstValue - this.secondValue;
	
	}
	public void multiply() {// *
		this.answer = this.firstValue * this.secondValue;
	}
	public void divide() {// *
		this.answer = this.firstValue / this.secondValue;
	
	}public void pow() {// chia
		this.answer = Math.pow(this.firstValue, this.secondValue);
	}	
	public void mod() {// chia lay du
		this.answer = this.firstValue % this.secondValue;
	}
	

}
