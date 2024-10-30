package ASSIGNMENT_2;
import java.util.Scanner;
public class Check_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if( n > 0 )
			System.out.println("THE NUMBER IS POSITIVE");
		else if( n < 0 )
			System.out.println("THE NUMBER IS NEGATIVE");
		else
			System.out.println("THE NUMBER IS ZERO");
		sc.close();
	}

}
