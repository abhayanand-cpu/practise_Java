import java.util.Scanner;
public class A1Q5 {

	static boolean isOdd( int i ){
		if ( (i & 1) == 1 ) 
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check wheather number is odd or even: ");
		int i = sc.nextInt();

		if( isOdd(i) ){
			System.out.println("True");
		}
		else
			System.out.println("False");
		sc.close();
	}

}
