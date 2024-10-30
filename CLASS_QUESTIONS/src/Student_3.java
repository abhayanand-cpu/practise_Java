
class Argument{
	String name;
	double roll;
	double marks;
	
	Argument( String name, double roll, double marks ){  //ARGUMENT CONSTRUCTOR
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
public class Student_3 {

	public static void main(String[] args) {
		
		Argument s1 = new Argument( "Abhay", 3, 100 );
		s1.display();
	
	}

}

