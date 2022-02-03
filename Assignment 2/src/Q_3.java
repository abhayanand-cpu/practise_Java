import java.util.Scanner;
public class Q_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       double feet,meter;
       System.out.print("Enter a value for feet: ");
       feet = sc.nextDouble();
       meter = feet*0.305;
       System.out.println(feet+" feet is "+meter+" meters");
       sc.close();
	}

}
