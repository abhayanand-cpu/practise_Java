import java.util.Scanner;
public class A4Q_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number for which you want to find the multiplication table: ");
		int num = sc.nextInt();
		for ( int i = 1; i<=10; i++)
			System.out.println(num+" x "+i+" = "+i*num);
		sc.close();
	}

}
