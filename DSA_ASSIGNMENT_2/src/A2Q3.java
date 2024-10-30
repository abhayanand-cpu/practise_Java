import java.util.Scanner;

class Student{
	static int c = 0;
	static int d = 0;
	static String sno[] = {"1st","2nd","3rd","4th","5th"}; 
	
	int rollNo;
	String name;
	String course;
	
	void input_Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n-----------------"+sno[c++]+"Student--------------------");
		System.out.print("Enter roll no. of a student: ");
		rollNo = sc.nextInt();
		System.out.print("Enter name of a student: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter name of the course: ");
		course = sc.nextLine();
		
	}
	
	void display_Student() {
		System.out.println("\n-----------------"+sno[d++]+"Student--------------------");
		System.out.println("Roll no.: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
	}
	
}
class Exam extends Student{
	
	int mark1,mark2,mark3;
	
	void input_Marks() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter DSA marks: ");
		mark1 = sc.nextInt();
		System.out.print("Enter IGT marks: ");
		mark2 = sc.nextInt();
		System.out.print("Enter CALCULAS marks: ");
		mark3 = sc.nextInt();
	}
	
	void display_Result() {
		System.out.println("DSA marks: "+mark1);
		System.out.println("IGT marks: "+mark2);
		System.out.println("CALCULAS marks: "+mark3);
	}
	
}
public class A2Q3 {

	public static void main(String[] args) {
		
		Exam E[] = new Exam[5];
		for( int i = 0; i < 5; i++ ) {
			E[i] = new Exam();
			E[i].input_Student();
			E[i].input_Marks();
		}
		
		for( int i = 0; i < 5; i++ ) {
			E[i].display_Student();
			E[i].display_Result();
		}
	}

}
