import java.util.Scanner;
public class Q_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		int mark = sc.nextInt();
		if(mark>=40)
			System.out.println("Congratulation! you have passed the exam");
		else
			System.out.println("Sorry you have failed");
		sc.close();
	}

}
