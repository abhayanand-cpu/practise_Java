import java.util.Scanner;
public class A3Q_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		float x1 = sc.nextFloat();
		float y1 = sc.nextFloat();
		int x2 = 0;
		int y2 = 0;
		float d = (float)(Math.pow((Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)), 0.5));
		if (d<=10)
			System.out.println("Point "+"("+x1+", "+y1+") is in the cirle");
		else
			System.out.println("Point "+"("+x1+", "+y1+") is not in the cirle");
		sc.close();
	}
}