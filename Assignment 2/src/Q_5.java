import java.util.Scanner;
public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       float Vo,V1,t,a;
       System.out.print("Enter Vo,V1, and t: ");
       Vo = sc.nextFloat();
       V1 = sc.nextFloat();
       t = sc.nextFloat();
       a = (V1-Vo)/t;
       System.out.println("The average acceleration is "+a);
       sc.close();
	}

}
