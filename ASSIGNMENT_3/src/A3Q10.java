import java.util.Scanner;
public class A3Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int d = sc.nextInt();
		System.out.print("Enter the number of days elapsed since today: ");
		int e = sc.nextInt();
		e = (e+d)%7;
		
	    if (d==0)
	    	System.out.print("Today is Sunday");
	    else if (d==1)
	    	System.out.print("Today is Monday");
	    else if (d==2)
	    	System.out.print("Today is Tuesday");
	    else if (d==3)
	    	System.out.print("Today is Wednesday");
	    else if (d==4)
	    	System.out.print("Today is Thursday");
	    else if (d==5)
	    	System.out.print("Today is Friday");
	    else if (d==6)
	    	System.out.print("Today is Saturday");
	    if (e==0)
	    	System.out.print(" and the future day is Sunday");
	    else if (e==1)
	    	System.out.print(" and the future day is Monday");
	    else if (e==2)
	    	System.out.print(" and the future day is Tuesday");
	    else if (e==3)
	    	System.out.print(" and the future day is Wednesday");
	    else if (e==4)
	    	System.out.print(" and the future day is Thrusday");
	    else if (e==5)
	    	System.out.print(" and the future day is Friday");
	    else if (e==6)
	    	System.out.print(" and the future day is Saturday");
	    sc.close();
	    
	}
	
	
}

