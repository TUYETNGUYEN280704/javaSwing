// bài tập chẵn lẽ
import java.util.Scanner;

public class b1_If_else {
public static void main(String[] args) {
	int n;
	//Scanner sc = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	System.out.println(" nhâp số nguyên n: ");
	n= sc.nextInt();
	
	//kiểm tra tính chẵn lẽ
	if( n%2 ==0)
	{
		System.out.println(n+ " là số chẵn");
	}
	else
	{
		System.out.println(n + " là số lẽ");
	}
	
	
}
}



/*
 * //if(expression){ statement(s); }
 * expression: là biểu thức điều kiện
 * statement : là các câu lệnh , chúng sẽ thuuwjc thi nếu biểu thức điều kiện trả về kết quả đúng <-> true 
 * 	
 * |
 * |
 * conditon----
 * |			|
 * | ->true		|
 * |
 * statement	|
 * |
 * |			|
 * ..kết thúc<--|
 * 	
 */