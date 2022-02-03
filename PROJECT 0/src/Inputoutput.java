import java.util.Scanner;
public class Inputoutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      int l,b;
	      
	      System.out.println("ENTER YOUR RECTANGLE LENGTH");
	      l = sc.nextInt();
	      System.out.println("ENTER YOUR RECTANGLE BREADTH");
	      b = sc.nextInt();
	      System.out.println("AREA OF RECTANGLE IS "+l*b);
	      sc.close();
	}

}
