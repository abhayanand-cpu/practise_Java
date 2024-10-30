import java.util.Scanner;
public class A5Q20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 = x;
		int y1 = y;
		while( y > 0 ) {
			int rem = x % y;
			x = y;
			y = rem;
		}
		System.out.print("GCD of "+x1+" and "+y1+" is "+x);
		sc.close();
	}

}
