import java.util.Scanner;
public class Q_13 {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		long min = sc.nextLong();
		long year = min/(365*24*60);
		long days = (min%(365*24*60))/(60*24);
		System.out.println(min+" minutes is approximately "+year+
				" years and "+days+" days");
		sc.close();
	}

}
