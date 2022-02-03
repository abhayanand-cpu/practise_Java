import java.util.Scanner;
public class Q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of eggs: ");
		int egg = sc.nextInt();
		System.out.println("Your number of eggs is "+egg/144+" gross, "+egg%144/12+" dozen, and "+egg%144%12+".");
		sc.close();
	}

}
