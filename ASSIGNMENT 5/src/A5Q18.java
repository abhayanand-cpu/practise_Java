import java.util.Scanner;
public class A5Q18 {
	public static void tobinary(int n){
		String c = "";
		while( n!=0 ){
			int b = n%2;
			n = n/2;
			c = b + c;
		}
		System.out.println(c);
//		rev_string(c);
	}
//	public static void rev_string(String c){
//		
//		StringBuilder input1 = new StringBuilder();
//		
//		input1.append(c); //append the value to StringBuilder
//		
//		input1.reverse(); //reverse the value
//		
//		System.out.println(input1); //reversed value
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer to convert into binary: ");
		int n = sc.nextInt();
		tobinary(n);
		sc.close();
	}
}
