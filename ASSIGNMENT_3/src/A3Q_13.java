import java.util.Scanner;
public class A3Q_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Month: ");
		int m = sc.nextInt();
		System.out.print("Enter Year: ");
		int y = sc.nextInt();
		int days;
		if ((y%4==0 && y%100!=0) || (y%400==0)) 
			 days = 29;
		else
			 days = 28;
		
		switch(m) {
		case 1:
			System.out.println("January "+y+" had 31 days");
			break;
		case 2:
			System.out.println("February "+y+" had "+days+" days");
			break;
		case 3:
			System.out.println("March "+y+" had 31 days");
			break;
		case 4:
			System.out.println("April "+y+" had 30 days");
			break;
		case 5:
			System.out.println("may "+y+" had 31 days");
			break;
		case 6:
			System.out.println("June "+y+" had 30 days");
			break;
		case 7:
			System.out.println("July "+y+" had 31 days");
			break;
		case 8:
			System.out.println("August "+y+" had 31 days");
			break;
		case 9:
			System.out.println("September "+y+" had 30 days");
			break;
		case 10:
			System.out.println("October "+y+" had 31 days");
			break;
		case 11:
			System.out.println("Novenber "+y+" had 30 days");
			break;
		case 12:
			System.out.println("December "+y+" had 31 days");
			break;
		}
		sc.close();
	}

}
