import java.util.Scanner;
public class Class_Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range for odd number");
		int n = sc.nextInt();
		int count = 1;
		while(count<=n) {
			if(count%2!=0)   //Alternate way
			System.out.println(count);
			//count+=2;
			count++;         //Alternate way
		}
		sc.close();
	}

}