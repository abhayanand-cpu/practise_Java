import java.util.Scanner;
public class A3Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Rahul's age: ");
		float r = sc.nextFloat();
		System.out.print("Enter Ayush's age: ");
		float a = sc.nextFloat();
		System.out.print("Enter Ajay's age: ");
		float A = sc.nextFloat();
		if ( r>a )
			if( r>A )
				System.out.println("Rahul is elder amoung all.");
			else
				System.out.println("Ajay is elder amoung all.");
		else if ( a>A )
			    System.out.println("Ayush is elder amoung all.");
			else
				System.out.println("Ajay is elder amoung all.");
		sc.close();
	}

}
                 //13020082853