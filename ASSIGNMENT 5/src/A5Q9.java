import java.util.Scanner;
public class A5Q9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); int sum = 0; int b = 1;
		for(int i=0; i<n; i++) {
			sum = sum+(int)(Math.pow(-1, i))*b;
			b = b+2;
		}
		System.out.println(sum);

		sc.close();
	}

}