package code;

public class sub_infor extends Infor {

	public void method() {
		// super.a; => ko truy cập đc
//		super.b;=> ko truy cập đc vì chung gói 
		super.c = 3;// truy cập đc
		// d truy cập đc 
	}
}
