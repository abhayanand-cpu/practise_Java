import java.util.Scanner;
public class A3Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 65 && ch <= 90)
			System.out.println(ch + " is upper-case letter");
		else if (ch >= 97 && ch <=122)
			System.out.println(ch + " is lower-case letter");
		else if (ch >= 48 && ch <= 57)
			System.out.println(ch + " is numeric letter");
		else if ((ch >= 0 && ch <=47 ) || (ch >= 58 && ch <=64) || (ch >= 91 && ch <=96) || (ch >= 123 && ch <=127))
			System.out.println(ch + " is spicial symbol");
		else
			System.out.println("Beyond the range of character");
		
			sc.close();
	}

}
