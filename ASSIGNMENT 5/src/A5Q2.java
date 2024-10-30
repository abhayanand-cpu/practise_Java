import java.util.Scanner;
public class A5Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		int rev = 0, num = a;
		
		while(a>0) {
			int r = a%10;
			rev = rev*10+r;
			a = a/10;

		}
		System.out.println("Reverse of "+num+" is "+rev);
		sc.close();
	}

}
