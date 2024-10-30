import java.util.Scanner;
class Stud{
	String name;
	int roll;
	double marks;
	
	Stud(){
		name = null;
		roll = 0;
		marks = 0.0;
	}
	
	Stud( String name, int roll, double marks ){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	Stud( Stud s1 ){
		name = s1.name;
		roll = s1.roll;
		marks = s1.marks;
	}
	
	Stud add( Stud s3 ) {
		Stud s4 = new Stud();
		double marks1 = marks + s3.marks;
		s4.marks = marks1;
		return s4;
	}
	
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		System.out.print("Enter roll: ");
		roll = sc.nextInt();
		System.out.print("Enter marks: ");
		marks = sc.nextDouble();
		sc.close();
	}
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		System.out.println("marks = "+marks);
	}
	
}
public class ClassQuestion9 {

	public static void main(String[] args) {
		
		Stud s = new Stud( "Abhay", 03, 100 );
		s.display();
		Stud s1 = new Stud();
		s1.getData();
		s1.display();
		Stud s3 = s.add(s1);
		s3.display();
	}

}
