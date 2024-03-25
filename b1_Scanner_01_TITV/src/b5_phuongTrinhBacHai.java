//bài 18
import java.util.Scanner;
public class b5_phuongTrinhBacHai {
	public static void main(String[] args) {

		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" nhập a");
		a = sc.nextDouble();
		System.out.println(" nhập b");
		b = sc.nextDouble();
		System.out.println(" nhập c");
		c = sc.nextDouble();
		
		//delta = b*Math.pow(b, 2) - 4*a*c; ->> cái này sai cú pháp nên sẽ sai kết quả 
		delta = Math.pow(b,2)- 4*a*c; // -> cái này ms đúng 
		
		// CẦN  thêm if a==0 vì nếu nhập sai dl thì nhập lại 
		if( a==0 ) {
			System.out.println(" nhập dl đã bị sai -> cần khác 0 -> hãy nhập lại :");
		}else {
		if ( delta < 0) {
			System.out.println(" phương trình vô nghiệm");
		}else if(delta ==0) {
			x1 = x2= -b/2*a;
			System.out.println(" pt có nghiệm kép x1= x2= "+x1);
			
		}else if ( delta >0) { // else lun cz đc , ko  cần ( delta > 0)
			x1 = (-b - Math.sqrt(delta))/(2*a);
			System.out.println(" nghiệm x1  = "+x1);
			x2 = (-b + Math.sqrt(delta))/(2*a);
			System.out.println(" nghiệm x2 = "+x2);
		}
		else { 
			System.out.println("omg");
		}
	}
}
}
//phương trình bậc 2() : ax^2 + bx +c= 0
//các biến cần có : a, b, c, x1, x2, delta
/**
 * NẾU a ==0 BÁO LỖI
*b1 delta = b^2 - 4ac
*b2 kiểm tra delta
*2.1 dt < 0 -> pt vô nghiệm 
*2.2 dt == 0 -> pt có nghiệm kép x1=x2=-b/2a
*2.3 dt > 0 -> pt có 2 nghiệm phân biệt 
* x1 = ( -b-sqrt(delta))/(2a)
* x2 = ( -b+sqrt(delta))/(2a)
*  */

 
