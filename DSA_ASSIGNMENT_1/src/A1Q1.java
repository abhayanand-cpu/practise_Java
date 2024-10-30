import java.util.Scanner;
public class A1Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		while( true ){
		System.out.print("Enter three number: ");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		
		if(a+b==c||a==b-c||a*b==c) {
			System.out.println("The arithmetic equation is correct");
//			break;
		}
			else 
			System.out.println("The arithmetic equation is not correct");
			
//		}
		sc.close();
	}
}

