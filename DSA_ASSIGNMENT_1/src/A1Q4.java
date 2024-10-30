import java.util.Scanner;
public class A1Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of line you wanna enter: ");
		int n = sc.nextInt();
		String arr[] = new String[n];
		sc.nextLine();
		for( int i = 0; i < n; i++ ) {
			System.out.println("Enter content of line "+(i+1)+":");
			arr[i] = sc.nextLine();
		}
		System.out.println("\nYour reversed lines's order are: ");
		for( int i = n-1; i >= 0; i-- ) {
			System.out.println(arr[i]);
		}
		sc.close();
	}

}

