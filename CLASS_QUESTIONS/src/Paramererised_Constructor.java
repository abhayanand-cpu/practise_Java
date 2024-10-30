import java.util.*;
class student2{
	String name;
	int roll;
	
	student2(String n, int r){  //formal parameter
		name = n;
		roll = r;
	}
	void Display() {
		System.out.println("Name is "+name);
		System.out.println("Roll is "+roll);
	}
}
public class Paramererised_Constructor {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = sc.next();
		System.out.print("Enter Roll: ");
		int roll = sc.nextInt();
		student2 st = new student2(name,roll);  //Actual parameter
		st.Display();
		sc.close();
	}

}
