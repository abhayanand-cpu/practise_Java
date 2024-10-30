import java.util.Scanner;

class Node{

	String name;
	Node link;

}

class Node2 {
	
	int age;
	Node2 link;
	
}

class Node3{
	
	Node3 Llink;
	int data;
	Node3 Rlink;
	
}

public class LL {
	
	public static Scanner sc = new Scanner(System.in);
	public static Node start = null;
	public static Node2 start2 = null;
	public static Node3 start3 = null;
	public static Node3 end = null;
	public static Node p = new Node();
	public static Node2 p2 = new Node2();
	public static Node3 p3 = new Node3();
	public static int Size;
	public static int Size3;
	
	public static void Create() {
		System.out.print("Enter name: ");
		p.name = sc.nextLine();
		p.link = null;
		start = p;
		
		System.out.print("Want to create more node y/n: ");
		char c = sc.next().charAt(0);

		while( c == 'y' ) {
			Node q = new Node();
			System.out.print("Enter name: ");
			sc.nextLine();
			q.name = sc.nextLine();
			q.link = null;
			p.link = q;
			p = q;
			System.out.print("Want to create more node y/n: ");
			c = sc.next().charAt(0);
		}
		
	}
	
	public static void Create2() {
		
		System.out.print("Enter marks: ");
		p2.age = sc.nextInt();
		p2.link = null;
		start2 = p2;
		
		System.out.print("Want to create more node y/n: ");
		char c = sc.next().charAt(0);

		while( c == 'y' ) {
			Node2 q2 = new Node2();
			System.out.print("Enter age: ");
			p2.age = sc.nextInt();
			p2.link = q2;
			p2 = q2;
			System.out.print("Want to create more node y/n: ");
			c = sc.next().charAt(0);
		}
		
	}
	
	public static void Create3() {
		System.out.print("Enter data: ");
		p3.data = sc.nextInt();
		p3.Llink = null;
		p3.Rlink = null;
		start3 = p3;
		
		System.out.print("Want to create more node y/n: ");
		char c = sc.next().charAt(0);
		
		while( c == 'y' ) {
			Node3 q = new Node3();
			System.out.print("Enter data: ");
			q.data = sc.nextInt();
			p3.Rlink = q;
			q.Llink = p3;
			p3 = q;
			System.out.print("Want to create more node y/n: ");
			c = sc.next().charAt(0);
			if( c != 'y' )
				end = q;
		}

	}

	public static void display1() {
		if( start == null ) {
			System.out.println("UNDERFLOW CONDITION.");
			return;
		}
		Node p = start;
		while( p != null ) {
			System.out.print(p.name+"---->");
			p = p.link;
		}
		System.out.println("null");
	}
	
	public static void display2() {
		Node2 p = start2;
		
		if( start2 == null ) {
			System.out.println("UNDERFLOW CONDITION.");
			return;
		}
		
		while( p != null ) {
			System.out.print(p.age+"---->");
			p = p.link;
		}
		System.out.println("null");
	}
	
	public static void FDD() {
		if( start3 == null ) {
			System.out.println("Underflow condition.");
			return;
		}
		
		Node3 q = start3;
		
		while( q != null ) {
			System.out.print(q.data+"---->");
			q = q.Rlink;
		}
		System.out.println("null");
	}
	
	public static void BDD() {
		if( end == null ) {
			System.out.println("UNDERFLOW CONDITION.");
			return;
		}
		
		Node3 q = end;
		
		while( q != null ) {
			System.out.print(q.data+"---->");
			q = q.Llink;
		}
		System.out.println("null");
	}
	
	public static void BegInsert() {
		Node q = new Node();
		System.out.print("Enter name: ");
		q.name = sc.nextLine();
		q.link = start;
		start = q;
//		Size++;
	}
	
	public static void EndInsert() {
		Node q = new Node();
		
		System.out.print("Enter name: ");
		q.name = sc.nextLine();
		q.link = null;
		
		if( start == null ) {
			start = q;
			return;
		}
		
		Node r = start;
		while( r.link != null ) {
			r = r.link;
		}
		r.link = q;

	}
	
	public static int count() {
		Node q = start;
		while( q != null ) {
			q = q.link;
			Size++;
		}
		return Size;
	}
	
	public static void sort() {
		Node2 q = start2;
		while( q != null ) {
			Node2 temp = q.link;
			while( temp != null ) {
				if( temp.age > q.age ) {
					int t = temp.age;
					temp.age = q.age;
					q.age = t;
				}
			temp = temp.link;
			}
			q=q.link;
		}
	}
	
	public static void InsertPos() {
		sc.nextLine();
		
		System.out.print("Insert position: ");
		int pos = sc.nextInt();
		sc.nextLine();
		int s = count();
		if( pos <= s + 1 ) {
			if( start == null || pos == 1 ) {
				BegInsert();
				return;
			}
			else if( pos == s + 1 ) {
				EndInsert();
				return;
			}
			else {
				Node q = new Node();
				System.out.print("Enter name: ");
				q.name = sc.nextLine();
				Node r = start;
				Node r2 = null;
				while( pos != 2 ) {
					r = r.link;
					pos--;
				}
				r2 = r.link;
				r.link = q;
				q.link = r2;
			}
		}
	}
	
	public static void InsertBeg() {
		
		Node3 q = new Node3();
		System.out.print("Enter data: ");
		q.data = sc.nextInt();
		sc.nextLine();
		q.Llink = null;
		q.Rlink = start3;
		q = start3;
		
	}
	
	public static void InsertEnd() {
		
		Node3 q = new Node3();
		System.out.print("Enter data: ");
		q.data = sc.nextInt();
		sc.nextLine();
		Node3 r = start3;
		while( r.Rlink != null ) {
			r = r.Rlink;
		}
		r.Rlink = q;
		
	}
	
	public static void InsertPos3() {
		System.out.print("Enter Position: ");
		int pos = sc.nextInt();
		sc.nextLine();
		
		int s = count3();
		if( s <= pos + 1 ) {
			if( pos == 1 ) {
				InsertBeg();
				return;
			}
			else if( pos == s + 1 ) {
				InsertEnd();
				return;
			}
			else {
				Node3 q2 = new Node3();
				System.out.print("Enter data: ");
				q2.data = sc.nextInt();
				sc.nextLine();
				Node3 q = start3;
				Node3 r = null;
				while( pos != 2 ) {
					q = q.Rlink;
					pos--;
				}
				r = q.Rlink;
				q.Rlink = q2;
				q2.Rlink = r;
			}
		}
	}
	
	public static int count3() {
		Node3 q = start3;
		while( q != null ) {
			q = q.Rlink;
			Size3++;
		}
		return Size3;
	}
	
	public static void SearchDLL() {
		System.out.print("Enter number you want to search for: ");
		int n = sc.nextInt();
		Node3 q = start3;
		while( q != null ) {
			if( n == q.data ) {
				System.out.println("Element found!!!");
				return;
			}
			q = q.Rlink;
		}
		System.out.println("Element not found.");
	}
	
	public static void main(String[] args) {
		
//		Create();
//		display();
//		BegInsert();
//		display();
//		EndInsert();
//		display();
//		InsertPos();
//		display();
//		Create2();
//		display2();
//		sort();
//		display2();
		Create3();
		FDD();
//		BDD();
//		SearchDLL();
//		InsertBeg();
//		FDD();
//		InsertEnd();
		InsertPos3();
		FDD();
	}

}
