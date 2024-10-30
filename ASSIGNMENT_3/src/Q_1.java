import java.util.Scanner;
public class Q_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Height in feet: ");
       double h = sc.nextDouble();
       if( h>=6 )
    	   System.out.println("The person is tall.");
       
       sc.close();
	}

}
