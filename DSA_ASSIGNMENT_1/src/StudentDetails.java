import java.util.Scanner;
class Student1{
	
	String name;
	int roll;
	double marks;
	
	void setData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter roll: ");
		roll = sc.nextInt();
		System.out.print("Enter marks: ");
		marks = sc.nextDouble();
	}
	
	void display() {
		System.out.println("name = "+name);
		System.out.println("roll = "+roll);
		System.out.println("marks = "+marks);
	}
	
}
public class StudentDetails {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setData();
		s1.display();
		Student1 s2 = new Student1();
		s2.setData();
		s2.display();
		Student1 s3 = new Student1();
		s3.setData();
		s3.display();
	}

}
