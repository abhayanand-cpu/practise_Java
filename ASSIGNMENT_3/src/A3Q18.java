import java.util.Scanner;
public class A3Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your Gender (M or F): ");
		char gender = sc.next().charAt(0);
		System.out.print("First name: ");
		String Firstname = sc.next();
		System.out.print("Last name: ");
		String Lastname = sc.next();
		System.out.print("Age: ");
		byte age = sc.nextByte();
	    if ( (gender == 'f' || gender == 'F') && (age >=20) ) {
	    	System.out.print("Are you married, "+Firstname+" (y or n)? ");
	    	
	    	char question = sc.next().charAt(0);
	    	
	    	if ( (question == 'y') || (question == 'y')) 
	    		System.out.println("Then I shall call you Mrs. "+Firstname+" "+Lastname+".");
	  
	    	else if ( (question == 'n') || (question == 'n') )
	    		System.out.println("Then I shall call you Ms. "+Firstname+".");
	    }
	    	
	    else if ((gender == 'f' || gender == 'F') && (age < 20))
	    		System.out.println("Then I shall call you "+Firstname+" "+Lastname+".");
	    
	    else if( (gender == 'm' || gender == 'M') && (age >=20) )
	    	System.out.println("Then I shall call you Mr. "+Firstname+".");
	    
	    else if ((gender == 'm' || gender == 'M') && (age < 20))
    		System.out.println("Then I shall call you "+Firstname+" "+Lastname+".");
	    
	    sc.close();
	}

}
