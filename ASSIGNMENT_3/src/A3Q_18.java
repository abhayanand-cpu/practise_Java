//import java.util.Scanner;
//public class A3Q_18 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("What is your Gender (M or F): ");
//		char gender = sc.next().charAt(0);
//		System.out.print("First name: ");
//		String Firstname = sc.next();
//		System.out.print("Last name: ");
//		String Lastname = sc.next();
//		System.out.print("Age: ");
//		byte age = sc.nextByte();
//	    if ( (gender == 'f' || gender == 'F') && (age >=20) ) {
//	    	System.out.print("Are you married, "+Firstname+" (y or n)? ");
//	    	
//	    	char question = sc.next().charAt(0);
//	    	
//	    	if ( (question == 'y') || (question == 'y')) 
//	    		System.out.println("Then I shall call you Mrs. "+Firstname+" "+Lastname+".");
//	  
//	    	else if ( (question == 'n') || (question == 'n') )
//	    		System.out.println("Then I shall call you Ms. "+Firstname+".");
//	    }
//	    	
//	    else if ((gender == 'f' || gender == 'F') && (age < 20))
//	    		System.out.println("Then I shall call you "+Firstname+" "+Lastname+".");
//	    
//	    else if( (gender == 'm' || gender == 'M') && (age >=20) )
//	    	System.out.println("Then I shall call you Mr. "+Firstname+".");
//	    
//	    else if ((gender == 'm' || gender == 'M') && (age < 20))
//    		System.out.println("Then I shall call you "+Firstname+" "+Lastname+".");
//	    
//	    sc.close();
//	}
//
//}
import java.util.Scanner;
public class A3Q_18 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Gender (M/F) ");
char g=sc.next().charAt(0);
System.out.println("Enter First Name");
String fn=sc.next();
System.out.println("Enter last Name");
String ln=sc.next();
System.out.println("Enter Age");
int age=sc.nextInt();
if(g=='F')
{
if(age>=20)
{
System.out.println("Are you married"+fn+"(y or n)?");
char m=sc.next().charAt(0);
if(m=='y')
System.out.println("Then I shall call you Mrs."+ fn+" "+ln);
else
System.out.println("Then I shall call you Ms."+ fn+" "+ln);
}
else
{
System.out.println("Then I shall call you "+ fn+" "+ln);
}
}
else
{
if(g=='M')
{
if(age>=20)
{
System.out.println("Then I shall call you Mr."+ fn+" "+ln);
} else
{
System.out.println("Then I shall call you "+ fn+" "+ln);
}
}
}
sc.close();
}
}
