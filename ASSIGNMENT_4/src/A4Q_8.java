import java.util.Scanner;
public class A4Q_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int n = sc.nextInt();
		int lastdigit = 0;
		int i=1;
		while(n>0) {
			 lastdigit = lastdigit + n%10;
			 n = n/10;
			 i = i++;
		}
		
		if (lastdigit % 9 == 0)
			  System.out.print("is divisible by 9");
		else
			  System.out.print("is not divisible by 9");
		sc.close();	
	}

}
