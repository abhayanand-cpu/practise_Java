import java.util.Scanner;
public class P_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Height");
       int height = sc.nextInt();
       if(height>6) {
    	   System.out.println("Person is tall");
       }
       else {
    	   System.out.println("Person not tall");
       }
       sc.close();
	}

}
