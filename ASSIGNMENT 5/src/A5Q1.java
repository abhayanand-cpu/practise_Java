import java.util.Scanner;
public class A5Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for(int i = 0; i<=n; i++) {
			int p = (int)(Math.pow(2, i));
			System.out.println(i+"\t"+p);
		}
		
		sc.close();
	}

}
