import java.util.Scanner;
public class Problem_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		double d = scan.nextDouble();
	    scan.nextLine();
		String s = scan.nextLine();
	    
		
	    System.out.println("String: "+s);
	    System.out.println("Double: "+d);
		System.out.println("Int: "+i);
		scan.close();
	}

}
 
//import java.util.Scanner;
//public class Problem_3
//{
//	public static void main(String[] args)
//	{
//		// Declare the object and initialize with
//		// predefined standard input object
//		Scanner sc = new Scanner(System.in);
//
//		
//
//		// Character input
//		char gender = sc.next().charAt(0);
//
//		// Numerical data input
//		// byte, short and float can be read
//		// using similar-named functions.
//		int age = sc.nextInt();
//		long mobileNo = sc.nextLong();
//		double cgpa = sc.nextDouble();
//      
//      // String input
//		String name = sc.nextLine();
//
//		// Print the values to check if the input was correctly obtained.
//		System.out.println("Name: "+name);
//		System.out.println("Gender: "+gender);
//		System.out.println("Age: "+age);
//		System.out.println("Mobile Number: "+mobileNo);
//		System.out.println("CGPA: "+cgpa);
//	}
//}
//
