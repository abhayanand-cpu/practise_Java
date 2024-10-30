import java.util.Scanner;
public class Student {
	public static void Check( int marks ){
		if( marks > 100 )
			throw new ArithmeticException("MarksOutOfBoundException");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		System.out.println("Enter Marks");
		int marks = sc.nextInt();
		try {
			Check( marks );
		}
		catch( Exception e ){
			System.out.println(e);
		}
	}

}
