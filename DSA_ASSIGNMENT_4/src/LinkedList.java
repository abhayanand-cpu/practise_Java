import java.util.Scanner;
class Node{
	protected int Regdno;
	protected float marks;
	protected Node next;
}
public class LinkedList {
	
	static Scanner sc = new Scanner(System.in);
	static Node q = new Node();
	
	public static void create(Node start) {         // Creation of LinkList
		
		System.out.print("ENTER REGD.NO: ");
		q.Regdno = sc.nextInt();
		System.out.print("ENTER MARKS: ");
		q.marks = sc.nextFloat();
		start = q;
		
		System.out.print("WANT TO CREATE MORE NODE: ");
		char c = sc.next().charAt(0);
		
		while( c == 'y' ) {
			Node p = new Node();
			System.out.print("ENTER REGD.NO: ");
			p.Regdno = sc.nextInt();
			System.out.print("ENTER MARKS: ");
			p.marks = sc.nextFloat();
			q.next = p;
			q = p;
			System.out.print("WANT TO CREATE MORE NODE: ");
			c = sc.next().charAt(0);
		}
	}
	
	public static void display(Node start) {             // Display of LinkList
		Node p = start;
		while( p != null ) {
			System.out.print(p.Regdno+" "+p.marks+" -> ");
			p = p.next;
		}
		System.out.println("null");
	}
	
	public static Node InsBeg(Node start) {                  // Insertion at Beginning
		Node p = new Node();
		System.out.print("ENTER REGD.NO: ");
		p.Regdno = sc.nextInt();
		System.out.print("ENTER MARKS: ");
		p.marks = sc.nextFloat();
		
		p.next = start;
		start = p;
		return start;
	}
	
	public static Node InsEnd(Node start) {                   // Insertion at End.
		Node p = new Node();
		System.out.print("ENTER REGD.NO: ");
		p.Regdno = sc.nextInt();
		System.out.print("ENTER MARKS: ");
		p.marks = sc.nextFloat();
		Node q = start;
		while( q.next != null ) {
			q = q.next;
		}
		q.next = p;
		return start;
	}
	
	public static Node InsAny(Node start) {               // Insert at anyPosition
		
		System.out.print("ENTER POSITION: ");
		int pos = sc.nextInt();
		int c = count(start);
		if( pos <= c + 1 ) {
			if( pos == 1 ) {
				return start = InsBeg(start); 
			}
			else if( pos == c + 1 ) {
				return start = InsEnd(start);
			}
			else {
				Node p = new Node();
				System.out.print("ENTER REGD.NO: ");
				p.Regdno = sc.nextInt();
				System.out.print("ENTER MARKS: ");
				p.marks = sc.nextFloat();
				Node q = start;
				Node r = null;
				while( pos != 2 ) {
					q = q.next;
					pos--;
				}
				r = q.next;
				q.next = p;
				p.next = r;
				return start;
			}
		}
		return start;
	}
	
	public static Node DelBeg(Node start) {                   // Deletion at Beginning
		Node p = start;
		p = p.next;
		start = p;
		return start;
	}
	
	public static Node DelEnd(Node start) {                // Deletion at End
		Node p = start;
		while( p.next.next != null ) {
			p = p.next;
		}
		p.next = null;
		return start;
	}
	
	public static Node DelAny(Node start) {              // Deletion at Any Position
		System.out.print("ENTER Regd. no. in order to delete node: ");
		int reg = sc.nextInt();
		byte n = 1;
		Node q = start;
		while( q != null ) {          // Deletion of Node on the basis of Registration number.
			if( q.Regdno == reg )
				break;
			q = q.next;
			n++;
		}
		int s = count(start);
		if( n <= s ) {
			if( n == 1 ) {
				return start = DelBeg(start);
			}
			else if( n == s ) {
				return start = DelEnd(start);
			}
			else {
				Node p = start;
				while( n != 2 ) {
					p = p.next;
					n--;
				}
				p.next = p.next.next;
				return start;
			}
		}
		else {
			System.out.println("ERROR!! CAN'T FIND THE REGESTRATION NUMBER.");
		}
		return start;
	}
	
	public static void search(Node start) {          // Searching of a node On the basis of Registration number.
															// And updating marks.
		System.out.print("Enter Regestration number in order to search: ");
		int s = sc.nextInt();
		Node p = start;
		while( p != null ) {
			if( s == p.Regdno ) {
				System.out.println("Regestration found!!!");
				System.out.print("Enter updated marks: ");
				p.marks = sc.nextFloat();
				return;
			}
			p = p.next;
		}
		System.out.println("Regestration number not found!!.");
	}
	
	public static void sort(Node start) {     // Sorting of LinkList
		Node p = start;
		while( p.next != null ) {
			Node q = start;
			Node r = new Node();
			while( q.next != null ) {
				if( q.marks < q.next.marks ) {
					r.marks = q.next.marks;
					r.Regdno = q.next.Regdno;
					q.next.marks = q.marks;
					q.next.Regdno = q.Regdno;
					q.marks = r.marks;
					q.Regdno = r.Regdno;
				}
				q = q.next;
			}
			p = p.next;
		}
	}
	
	public static int count(Node start) {        // Counting Number of Nodes.
		Node q = start;
		int c = 0;
		while( q != null ) {
			q = q.next;
			c++;
		}
		return c;
	}
	
	public static Node reverse(Node start) {     // Reversing of LinkList
		Node previous = null;
		Node present = start;
		Node next;
		while( present != null ) {
			next = present.next;
			present.next = previous;
			
			previous = present;
			present = next;
		}
		start = previous;
		return start;
	}
	
	public static void main(String[] args) {
		Node start = q;
		System.out.println("******MENU*******");
		System.out.println("0:Exit");
		System.out.println("1:Creation");
		System.out.println("2:Display");
		System.out.println("3:Insert Any");
		System.out.println("4:Delete Any");
		System.out.println("5:Searching");
		System.out.println("6:Sorting");
		System.out.println("7:Counting");
		System.out.println("8:Reverse");
		while( true ) {
			System.out.println("Enter the choice");
				byte choice = sc.nextByte();
				switch( choice ) {
				case 0:
					System.exit(0);
				case 1:
					create(start);
					break;
				case 2:
					display(start);
					break;
				case 3:
					start = InsAny(start);
					break;
				case 4:
					start = DelAny(start);
					break;
				case 5: 
					search(start);
					break;
				case 6:
					sort(start);
					break;
				case 7:
					System.out.println("Number of nodes are: "+ count(start));
					break;
				case 8:
					start = reverse(start);
					break;
				default:
					System.out.println("Wrong choice");
				}
		}
	}
}
