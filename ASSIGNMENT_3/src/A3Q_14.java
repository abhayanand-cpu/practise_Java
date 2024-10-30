import java.util.Scanner;
public class A3Q_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("scissor (0), rock (1), paper(2): ");
		int a = 0+(int)(Math.random()*(2-0+1));
		int b = sc.nextInt();
		
		if (a==0 && b==0)
			System.out.println("The computer is scissor. You are scissor too. 5It is a draw");
		else if (a==1 && b==1)
			System.out.println("The computer is rock. You are rock too. It is a draw");
		else if (a==2 && b==2)
			System.out.println("The computer is paper. You are paper too. It is a draw");
		else if (a==0 && b==1)
			System.out.println("The computer is scissor. You are rock. you won");
		else if (a==0 && b==2)
			System.out.println("The computer is scissor. You are paper. you lost");
		else if (a==1 && b==0)
			System.out.println("The computer is rock. You are scissor. you lost");
		else if (a==2 && b==0)
			System.out.println("The computer is paper. You are scissor. you won");
		else if (a==1 && b==2)
			System.out.println("The computer is rock. You are paper. you won");
		else if (a==2 && b==1)
			System.out.println("The computer is paper. You are rock. you lost");
		
		sc.close();
	}

}
