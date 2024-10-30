import java.util.*;
class Student{
	
	String name;
	int roll;
	int marks;
	
	void setData(){
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		roll = sc.nextInt();
		marks = sc.nextInt();
		
	}
	
	void Display(){
		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		System.out.println("Marks = "+marks);
	}
	
}
public class StudentDetails {

	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.setData();
		obj1.Display();
		
		Student obj2 = new Student();
		obj2.setData();
		obj2.Display();
		
		Student obj3 = new Student();
		obj3.setData();
		obj3.Display();
	}

}
