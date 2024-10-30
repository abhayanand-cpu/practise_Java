import java.util.Scanner;
public class A1Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number greater than \"2\" : ");
		int n = sc.nextInt();
		int c = 0;
		if( n >= 2 ) {
			while( n >= 2 ) {
				n /= 2;
				c++;
			}
			System.out.print("Your entered number divided "+c+" "+((c > 1) ? "times." : "time."));
		}
		else
			System.out.println("You didnot gave number greater than \"2\", please enter the number greater than \"2\".");
		sc.close();
	}

}
