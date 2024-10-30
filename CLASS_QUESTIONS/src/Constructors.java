import java.util.Scanner;
class Student{
	String name;
	double roll;
	double marks;
	
	Student(){                                 //NO-ARGUMENT CONSTRUCTOR
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter Roll: ");
		roll = sc.nextDouble();
		System.out.print("Enter Marks: ");
		marks = sc.nextDouble();
		sc.close();
	}
	
	Student( String name, double roll, double marks ){  //ARGUMENT CONSTRUCTOR
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	Student( Student s ){    //COPY CONSTRUCTOR
		name = s.name;
		roll = s.roll;
		marks = s.marks;
	}
	
	Student( double marks, String name, double roll ){  //METHOD OVERLOADING ON THE BASIS OF ORDER OF ARGUMENT
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		System.out.println("Marks = "+marks);
	}
	
}
public class Constructors {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.display();
		
		Student s2 = new Student( "Abhay", 2, 100 );
		s2.display();
		
		Student s3 = new Student(s2);
		s3.display();
		
		Student s4 = new Student( 100, "Abhay", 2 );
		s4.display();
		
	}

}
