import java.util.Scanner;
public class A4Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Count from: ");
		int cf = sc.nextInt();
		System.out.print("Count to: ");
		int ct = sc.nextInt();
		System.out.print("Count by: ");
		int cb = sc.nextInt();
		for (int i = cf; i<=ct; i+=cb)
			System.out.print(i+" ");
		sc.close();
	}

}
