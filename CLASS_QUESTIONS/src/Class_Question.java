import java.util.Scanner;
public class Class_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
		if(a>b)
			if(a>c)
				System.out.print("a is largest number");
			else
				System.out.print("c is largest number");
		if(b>c)
			System.out.print("b is largest number");
	
		else
				System.out.print("c is largest number");
		    
		sc.close();
	}

}
