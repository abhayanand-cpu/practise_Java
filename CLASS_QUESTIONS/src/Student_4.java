
class CopyC{
	String name;
	double roll;
	double marks;
	
	CopyC( String name, double roll, double marks ){  //ARGUMENT CONSTRUCTOR
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	CopyC( Student s1 ){    //COPY CONSTRUCTOR
		name = s1.name;
		roll = s1.roll;
		marks = s1.marks;
	}
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		System.out.println("Marks = "+marks);
	}
	
}
public class Student_4 {

	public static void main(String[] args) {
		
		Student s1 = new Student( "Abhay", 2, 100 );
		s1.display();
		
		Student s2 = new Student(s1);
		s2.display();
		
	}

}
