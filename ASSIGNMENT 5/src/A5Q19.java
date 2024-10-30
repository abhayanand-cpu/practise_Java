import java.util.Scanner;
public class A5Q19 {
	public static void factors(int num) {
		int count = 2;
		while( num != 1 ) {
			
			while( num % count == 0 ) {
				num /= count;
				System.out.print(count);
				
				if( num != 1 )
					System.out.print(",");
				else
					System.out.print(".");
			}
			
			count++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer to display factors: ");
		int num = sc.nextInt();
		factors(num);
		
		sc.close();
	}

}
