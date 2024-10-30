import java.util.Scanner;
class Person{
	
	String name;
	int age;
	
	Person( String name, int age ){
		this.name = name;
		this.age = age;
	}
	
}

class Student1 extends Person{

	String course;
	int rollno;
	int marks;
	
	Student1(String name, int age, String course,int rollno,int marks) {
		super(name, age);
		this.course = course;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("Name of the Student: "+name);
		System.out.println("Age of Student: "+age);
		System.out.println("Course: "+course);
		System.out.println("Student's Roll no: "+rollno);
		System.out.println("Student's Marks: "+marks);
	}
}

class Teacher extends Person{

	String subject_assigned;
	int contact_hour;
	
	Teacher(String name, int age,String subject_assigned, int contact_hour) {
		super(name, age);
		this.subject_assigned = subject_assigned;
		this.contact_hour = contact_hour;
	}
	
	void display() {
		System.out.println("Name of the Teacher: "+name);
		System.out.println("Age of Teacher: "+age);
		System.out.println("Subject assigned: "+subject_assigned);
		System.out.println("Contact hour: "+contact_hour);
	}
}

public class A2Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name of a person: ");
		String name = sc.nextLine();
		System.out.print("Enter age of a person: ");
		int age = sc.nextInt();
		Person p = new Person(name,age);
		
		System.out.print("Weather Person is Student or Teacher \"T\" for teacher \"S\" for Student: ");
		char c = sc.next().charAt(0);
		if( c == 'T' ) {
			sc.nextLine();
			System.out.print("Enter subject_assigned: ");
			String subject_assigned = sc.nextLine();
			System.out.print("Enter Contact hour: ");
			int contact_hour = sc.nextInt();
			Teacher t = new Teacher(name,age,subject_assigned,contact_hour);
			t.display();
		}
		
		else if( c == 'S' ) {
			System.out.print("Enter course name: ");
			sc.nextLine();
			String course = sc.nextLine();
			System.out.print("Enter Roll no: ");
			int rollno = sc.nextInt();
			System.out.print("Enter marks: ");
			int marks = sc.nextInt();
			Student1 s = new Student1(name,age,course,rollno,marks);
			s.display();
		}
	}

}
