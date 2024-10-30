import java.util.Scanner;

public class PracticQ1 {
	public static void Chartobinary(int n){
		String c = "";
		while( n!=0 ){
			int b = n%2;
			n = n/2;
			c += b;
		}
		rev_string(c+"0");
	}
	public static void tobinary(int n){
		String c = "";
		while( n!=0 ){
			int b = n%2;
			n = n/2;
			c += b;
		}
		rev_string(c);
	}
	public static void rev_string(String c){
		
		StringBuilder input1 = new StringBuilder();
		
		input1.append(c); //append the value to StringBuilder
		input1.reverse(); //reverse the value
		
		System.out.print(input1); //print reversed value
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What you want to convert into binary String or integer type 'S' for String and"
				+ " 'I' for inyeger: ");
		char choose = sc.next().charAt(0);
		if( choose == 'I' || choose == 'i') {
			System.out.print("You chooses integer value enter any positive integer to convert into binary: ");
		int n = sc.nextInt();
		tobinary(n);
		}
		else if( choose == 'S' || choose == 's') {
			System.out.print("You chooses String value enter any String to convert into binary: ");
			String any = sc.next();
			
			char[] any1 = any.toCharArray();
			for(int i = 0; i < any.length(); i++) {
				int any2 = (int)any1[i];
				Chartobinary(any2);
			}
		}
		sc.close();
	}
}
