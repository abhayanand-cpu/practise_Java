import java.util.Scanner;
public class A3Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the points: ");
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		if ( x>0 && y>0 )
			System.out.println("("+x+","+" "+y+")"+"is in quadrant I");
		else if ( x<0 && y>0 )
			System.out.println("("+x+","+" "+y+")"+"is in quadrant II");
		else if ( x<0 && y<0 )
			System.out.println("("+x+","+" "+y+")"+"is in quadrant III");
		else if ( x>0 && y<0 )
			System.out.println("("+x+","+" "+y+")"+"is in quadrant IV");
		else if ( x>0 && y==0 )
			System.out.println("("+x+","+" "+y+")"+"is on positive x-axis");
		else if ( x==0 && y>0 )
			System.out.println("("+x+","+" "+y+")"+"is on positive y-axis");
		else if ( x<0 && y==0 )
			System.out.println("("+x+","+" "+y+")"+"is on negative x-axis");
		else if ( x==0 && y<0 )
			System.out.println("("+x+","+" "+y+")"+"is on negative y-axis");
		else
			System.out.println("("+x+","+" "+y+")"+"is on origin");
		sc.close();
	}

}
