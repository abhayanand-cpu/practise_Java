import java.util.Scanner;
public class Class_Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the message: ");
		String mes = sc.nextLine();
		String x;
		int i = 1;
		while (i<=10) {
			if (i==1)
				x = "st";
			else if (i==2)
				x = "nd";
			else if (i==3)
				x = "rd";
			else
				x = "th";
			System.out.println(i+x+" "+mes);
				i++;
		}
		sc.close();
	}

}
