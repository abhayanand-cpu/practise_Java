import java.util.Scanner;
class Node{
	int regd;
	String name;
	int roll;
	Node next;
}
public class Student1 {
	static Node p = new Node();
	static Node head = null;
	static Scanner sc = new Scanner(System.in);
	
	public static void Create() {
		System.out.print("Enter regd,name and roll no.: ");
		p.regd = sc.nextInt();
		sc.nextLine();
		p.name = sc.nextLine();
		p.roll = sc.nextInt();
		sc.nextLine();
		head = p;
		
		System.out.print("want to create more y/n: ");
		char c = sc.next().charAt(0);
		while( c == 'y' ) {
			Node q = new Node();
			System.out.print("Enter regd,name and roll no.: ");
			q.regd = sc.nextInt();
			sc.nextLine();
			q.name = sc.nextLine();
			q.roll = sc.nextInt();
			sc.nextLine();
			p.next = q;
			p = q;
			
			System.out.print("want to create more y/n: ");
			c = sc.next().charAt(0);
		}
	}
	
	
	public static void main(String[] args) {
		Create();
		
	}

}
