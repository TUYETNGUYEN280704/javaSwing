
public class c8_string_ham_tim_kiem_chuoi {
public static void main(String[] args) {
	String s1 = "xin chào cô chú, xin chào các bạn, xin chào!";
	String s2 = "xin chào";
	String s3 = "xin chào 123";
	char c1 = 'ô';
	
	//hàm indexOf -> Tìm kiếm từ TRÁI sang PHẢI
	System.out.println("vị trí của s2 trong s1 là : "+ s1.indexOf( s2)); // chuỗi s2 có nằm trong chuoix s1 kko
										// và nằm ở vị trí nào
	System.out.println("vị trí của s3 trong s1 là : "+ s1.indexOf( s3)); // kq cho ra là -1 vì ko có xuất hiện trong s1
	
	// sử dụng vị trí bắt đầu 
	System.out.println("vị trí của s2 trong s1 là : "+ s1.indexOf( s2,2));  // 2: là vị trí bắt đầu được tính là [0-1-2-3...]
	
	// tìm kiếm char
	System.out.println("vị trí của c1 trong s1 là : "+ s1.indexOf(c1));
	System.out.println("vị trí của c1 trong s1 là : "+ s1.indexOf(c1,20));   

	//hàm lastIndexof -> tìm kiếm từ Phải sang Trái
	System.out.println("vị trí của s2 trong s1 là ( phải sang trái) -> : "+ s1.lastIndexOf(s2));
 
	// tenFile = " bài tập.excel.lop12.xls';
	
	
	

}
}
