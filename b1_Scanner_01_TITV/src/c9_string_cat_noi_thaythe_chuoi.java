
public class c9_string_cat_noi_thaythe_chuoi {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";

		String s3 = s1 + s2;

		//hàm cancat -> nối chuỗi
		String s4= s1.concat(s2); // nối chuỗi s1 vào s2 và gán nó là s4
		System.out.println(" s3 = "+s3);
		System.out.println(" s4 = "+s4);
		
		// hàm replace -> hàm thay thế 
		String s5 = "Tung.vn";
		String s6 = s5.replaceAll("Tung","TITV");// thay tùng thành titv
		System.out.println(" s6 "+ s6);
	}
}
