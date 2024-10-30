import java.util.Scanner;
class Student{
	
	String name;
	int roll;
	double marks;
	
	void setData( String name, int roll, double marks ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		this.name = sc.nextLine();
		System.out.print("Enter roll: ");
		this.roll = sc.nextInt();
		System.out.print("Enter marks: ");
		this.marks = sc.nextDouble();
	}
	
	void display() {
		System.out.println("name = "+name);
		System.out.println("roll = "+roll);
		System.out.println("marks = "+marks);
	}
	
}
public class StudentDetail {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData( "",0, 0.0 );
		s1.display();
		Student s2 = new Student();
		s2.setData( "",0, 0.0 );
		s2.display();
		Student s3 = new Student();
		s3.setData( "",0, 0.0 );
		s3.display();
	}

}
/*import java.util.Scanner;
class teacher extends Student{
	
	long phone;
	byte age;
	byte height;
	
	@Override void setData() {
		Scanner c = new Scanner(System.in);
		System.out.print("Enter Phone number: ");
		phone = c.nextLong();
		System.out.print("Enter age: ");
		age = c.nextByte();
		System.out.print("Enter height: ");
		height = c.nextByte();
	}

	void display() {
		System.out.println("Phone no. = "+phone);
		System.out.println("age = "+age);
		System.out.println("height = "+height);
	}
	
}
class Student{
	
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
public class StudentDetail {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setData();
		s1.display();
		Student s2 = new Student();
		s2.setData();
		s2.display();
		teacher s3 = new teacher();
		s3.setData();
		s3.display();
	}

}    */