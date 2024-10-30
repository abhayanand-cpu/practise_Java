import java.util.Scanner; //  2/02/2022    //NO ARGUMENT CONSTURCTOR
class Person{
	
	String name;
	int age;
	double height;
	
	Person(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter height");
		height = sc.nextDouble();
		
	}
	void display() {
		System.out.println("Name of a person is "+name);
		System.out.println("Aeg of a person is "+age);
		System.out.println("height of a person is "+height);
	}
}
public class NonParameterised_Constructor {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.display();
		Person p2 = new Person();
		p2.display();
		
	}
}
