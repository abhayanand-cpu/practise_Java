import java.util.Scanner;
public class A3Q_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		boolean x = (n%5==0) && (n%6==0);
		boolean y = (n%5==0) || (n%6==0);
		boolean z = (n%5==0) ^ (n%6==0);
		System.out.println(" is "+n+" divisible by 5 and 6?"+x);
		System.out.println(" is "+n+" divisible by 5 or 6?"+y);
		System.out.println(" is "+n+" divisible by 5 or 6, but not both?"+z);
		sc.close();
	}

}