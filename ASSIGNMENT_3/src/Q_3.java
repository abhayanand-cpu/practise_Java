import java.util.Scanner;
public class Q_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		if(a%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
		sc.close();
	}

}
