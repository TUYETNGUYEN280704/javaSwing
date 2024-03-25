import java.util.Scanner;

public class b_if_else_PhuongTrinhBacNhat {
	public static void main(String[] args) {
		Double a,b,x;
		Scanner sc= new Scanner(System.in);
		
		System.out.println(" nhập a: ");
		a= sc.nextDouble();
		System.out.println(" nhập b: ");
		b = sc.nextDouble();
		
		if(a == 0 )
		{
			if(b==0) {
				System.out.println(" phương trình vô số nghiệm:");
			}
			else {
				System.out.println(" phương trình vô nghiệm :");
			}
		}
		else 
			x = -b/a;
		System.out.println(" phương trình có nghiệm "+x); // why not sai dị má
		
		
	}
}
//PTBN ax+b = 0 
/*
* NẾU a=0 
*    nếu b = 0 -> pt vô số nghiệm
*    nếu b != 0 -> pt vô nghiệm 
* NẾU a!= 0 
* 		Có nghiệm x = -b/a
*/
