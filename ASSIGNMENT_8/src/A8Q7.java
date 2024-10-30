import java.util.Scanner;
public class A8Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any decimal number: ");
		int n = sc.nextInt();
		int actual = n;
		String octa = "";
		while( n != 0 ) {
			int rem = n % 8;
			n = n / 8;
			octa = rem + octa;
		}
		System.out.println("Octal representation of "+actual+" is: "+octa);
		sc.close();
	}

}
