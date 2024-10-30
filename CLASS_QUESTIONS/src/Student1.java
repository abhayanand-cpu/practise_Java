
class Default{
	String name;
	double roll;
	double marks;
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		System.out.println("Marks = "+marks);
	}
	
}
public class Student1 {

	public static void main(String[] args) {

		Default s = new Default();
		s.display();
		
	}

}

