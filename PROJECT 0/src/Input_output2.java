import java.util.Scanner;
public class Input_output2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int a;
       double b;
       System.out.println("ENTER YOUR INTERGER NUMBER");
       a = sc.nextInt();
       System.out.println("VALUE OF INTERGER IS "+a);
       System.out.println("ENTER YOUR DECIMAL NUMBER");
       b = sc.nextDouble();
       System.out.println("VALUE OF YOUR DECIMAL NUMBER IS "+b);
       sc.close();
	}

}
