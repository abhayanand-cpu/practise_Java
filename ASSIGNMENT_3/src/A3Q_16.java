import java.util.Scanner;
public class A3Q_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your marks among 100: ");
	    int marks = sc.nextInt();
	    
	    
	    switch (marks) {
	    case 90,91,92,93,94,95,96,97,98,99,100:
	    	System.out.println("Your grade : O");
	    break;
	    case 80,81,82,83,84,85,86,87,88,89:
	    	System.out.println("Your grade : A");
	    break;
	    case 70,71,72,73,74,75,76,77,78,79:
	    	System.out.println("Your grade : B");
	    break;
	    case 60,61,62,63,64,65,66,67,68,69:
	    	System.out.println("Your grade : C");
	    break;
	    case 50,51,52,53,54,55,56,57,58,59:
	    	System.out.println("Your grade : D");
	    break;
	    case 40,41,42,43,44,45,46,47,48,49:
	    	System.out.println("Your grade : E");
	    break;
	    default:
	    	System.out.println("Your grade : F");
	    	break;
	    }
		sc.close();
	}

}

