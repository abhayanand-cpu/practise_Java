import java.util.Scanner;
public class Q_class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age of a person");
		float age = sc.nextFloat();
		if(age>=18 && age<60)
			System.out.println("Person is adult");
		else if(age>=60)
			System.out.println("Person is senior citizen");
		else
			System.out.println("Person is Minor");
		sc.close();
	}

}
