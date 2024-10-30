
import java.util.Scanner;
class NoArgument{
	String name;
	double roll;
	double marks;
	
	NoArgument(){                                 //NO-ARGUMENT CONSTRUCTOR
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Roll: ");
		roll = sc.nextDouble();
		System.out.print("Enter Marks: ");
		marks = sc.nextDouble();
		sc.close();
	}
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		System.out.println("Marks = "+marks);
	}
	
}
public class Student_2 {

	public static void main(String[] args) {
		
		NoArgument s1 = new NoArgument();
		s1.display();
		
	}

}

