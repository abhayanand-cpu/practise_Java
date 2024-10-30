package ASSIGNMENT_2;
import java.util.Scanner;
public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if( n % 2 == 0 )
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		sc.close();
	}

}
