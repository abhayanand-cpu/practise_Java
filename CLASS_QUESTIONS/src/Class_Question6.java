import java.util.Scanner;
public class Class_Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of odd numbers to be displayed: ");
		int n = sc.nextInt();
		int count = 1,count1 = 1;
		while (count<=n) {
			System.out.println(count1);
			count++;
			count1+=2;
		}
		sc.close();
	}

}
