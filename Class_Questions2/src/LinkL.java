import java.util.*;

class Node1 {
	int info;
	Node1 next;
}

public class LinkL {

	public static Scanner sc = new Scanner(System.in);
	public static Node1 start = null;

	public static void create() {
		Node1 p = new Node1();
		System.out.print("Enter info part: ");
		p.info = sc.nextInt();
		p.next = null;
		start = p;
		System.out.print("Want to create more nodes (Y/N)?: ");
		char ch = sc.next().charAt(0);

		while (ch == 'Y' || ch == 'y') {
			Node1 q = new Node1();
			System.out.print("Enter info part:");
			q.info = sc.nextInt();
			p.next = q;
			p = q;
			System.out.print("Want to create more nodes ? (Y/N) : ");
			ch = sc.next().charAt(0);
		}
	}

	public static void display() {
		Node1 temp = start;
		if (temp == null)
			System.out.println("Underflow condition");
		while (temp != null) {
			System.out.print(temp.info + "----->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static int find2ndMax() {
		Node1 p = start;
		int max = p.info;
		while (p != null) {
			if (p.info >= max)
				max = p.info;
			p = p.next;
		}
		Node1 q = start;
		int max2 = q.info;
		while (q != null) {
			if (q.info >= max2 && q.info < max)
				max2 = q.info;
			q = q.next;
		}
		return max2;
	}

	public static void search(int item) {
		Node1 temp = start;
		while (temp != null) {
			if (temp.info == item)
				System.out.println( "ELEMENT FOUND!!!" );
			temp = temp.next;
		}
	}

	public static void removeDuplicate() {
		Node1 p = start;
		while(p.next != null) {
			Node1 q = p.next;
			while(q.next != null) {
				if (p.info == q.next.info)
					q.next = q.next.next;
				q = q.next;
			}
			p = p.next;
		}
	}
	
	public static void countUnique() {
		
		int unique = 0;
		Node1 p = start;
		while(p.next != null) {
			int count = 0;
			Node1 q = p.next;
			while(q.next != null) {
				if (p.info == q.next.info)
					count++;
				q = q.next;
			}
			p = p.next;
			if(count == 0)
				unique++;
		}
		System.out.println("No is unique elements are " + unique);
	}
	 
	public static void main(String[] args) {
		
		while (true) {
			System.out.println("----------MENU----------");
			System.out.println("0:Exit");
			System.out.println("1:Create List");
			System.out.println("2:Display List");
			System.out.println("3:2nd Largest Element");
			System.out.println("4:Reference of all occurances of an element");
			System.out.println("5:Remove all nodes with duplicate elements");
			System.out.println("6:Count the number of unique elements");
			System.out.print("Enter Choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				create();
				break;
			case 2:
				display();
				break;
			case 3:
				System.out.println(find2ndMax());
				break;
			case 4:
				System.out.print("Enter the element to search: ");
				int item = sc.nextInt();
				search(item);
				break;
			case 5:
				removeDuplicate();
				break;
			case 6:
				countUnique();
				break;
			default:
				System.out.println("Invalid Choice.");
			}
		}
	}
}

