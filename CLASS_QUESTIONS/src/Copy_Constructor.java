import java.util.*;
class Cricketer{
	String name;
	String team;
	int age;
	
	Cricketer ( ){
		Scanner sc = new Scanner(System.in);
		name  = sc.nextLine();
		team = sc.nextLine();
		age = sc.nextInt();
		sc.close();
	}
	
	Cricketer ( String n , String t , int a ){
		name  = n;
		team = t;
		age = a;
	}
	
	Cricketer ( Cricketer ckt ){
		name  = ckt.name;
		team = ckt.team;
		age = ckt.age;
	}
	
	void display() {
		System.out.println("NAME: "+name);
		System.out.println("TEAM: "+team);
		System.out.println("AGE: "+age);
	}
	
}
public class Copy_Constructor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cricketer c = new Cricketer();
		c.display();
		
		Cricketer c1 = new Cricketer("abhay","red",2);
		c1.display();
		
		Cricketer c2 = new Cricketer(c1);
		c2.display();
		
		sc.close();
	}

}


