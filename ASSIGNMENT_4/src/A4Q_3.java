import java.util.Scanner;
public class A4Q_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
		String s = "";
		for (int i = 1; i<=n; i++) {
			s = s+i+s;
		System.out.println(s+" ");
		}
		sc.close();
	}

}