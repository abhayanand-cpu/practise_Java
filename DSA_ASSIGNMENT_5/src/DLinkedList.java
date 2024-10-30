//import java.util.Scanner;
//class Node{
//	
//	protected int regd_no;
//	protected float mark;
//	protected Node next;
//	protected Node prev;
//	
//}
//public class DLinkedList {
//	static Scanner sc = new Scanner(System.in);
//	static Node p = new Node();
//	
//	public static Node create(Node start, Node end){
//	
//		System.out.print("Enter Regd.No.: ");
//		p.regd_no = sc.nextInt();
//		System.out.print("Enter Marks: ");
//		p.mark = sc.nextFloat();
//		start = p;
//		end = p;
//		System.out.print("Want to create more node y/n: ");
//		char c = sc.next().charAt(0);
//		while( c == 'y' ) {
//			Node r = new Node();
//			System.out.print("Enter Regd.No.: ");
//			r.regd_no = sc.nextInt();
//			System.out.print("Enter Marks: ");
//			r.mark = sc.nextFloat();
//			p.next = r;
//			r.prev = start;
//			p = r;
//			System.out.print("Want to create more node y/n: ");
//			c = sc.next().charAt(0);
//			if( c != 'y' )
//				end = r.prev;
//		}
//		return end;
//	}
//	
//	public static Node insBeg(Node start, Node end) {
//		Node q = new Node();
//		System.out.print("Enter Regd.No.: ");
//		q.regd_no = sc.nextInt();
//		System.out.print("Enter Marks: ");
//		q.mark = sc.nextFloat();
//		q.next = start;
//		start.prev = q;
//		start = q;
//		return start;
//	}
//	
//	public static Node insEnd(Node start, Node end) {
//		Node q = new Node();
//		System.out.print("Enter Regd.No.: ");
//		q.regd_no = sc.nextInt();
//		System.out.print("Enter Marks: ");
//		q.mark = sc.nextFloat();
//		q.prev = end;
//		end.next = q;
//		end = q;
//		return start;
//	}
//	
//	public static Node insAny(Node start, Node end) {
//		
//		int c = count( start );
//		System.out.print("ENTER POSITION: ");
//		byte pos = sc.nextByte();
//		if( pos <= c + 1 ) {
//			if( pos == 1 )
//				return insBeg( start, end );
//			else if( pos == c + 1 )
//				return insEnd( start, end );
//			else {
//				Node r = start;
//
//				Node q = new Node();
//				System.out.print("Enter Regd.No.: ");
//				q.regd_no = sc.nextInt();
//				System.out.print("Enter Marks: ");
//				q.mark = sc.nextFloat();
//				while( pos != 2 ) {
//					r = r.next;
//					pos--;
//				}
//				q.next = r.next;
//				q.prev = r;
//				r.next = q;
//				q.next.prev = q; 
//			}
//		}
//		return start;
//	}
//	
//	public static Node delBeg( Node start, Node end ) {
//		Node q = start;
//		q.next.prev = null;
//		start = q;
//		return start;
//	}
//	
//	public static Node delEnd( Node start, Node end ) {
//		Node q = end;
//		q.prev.next = null;
//		end = q;
//		return start;
//	}
//	
//	public static Node delAny( Node start, Node end ) {
//		System.out.print("Enter Position to delete node: ");
//		byte k = sc.nextByte();
//		byte c = count( start );
//		if( k <= c ) {
//			if( k == 1 )
//				return delBeg(start,end);
//			else if( k == c )
//				return delEnd(start,end);
//			else {
//				Node q = start;
//				while( k != 2 ) {
//					q = q.next;
//					k--;
//				}
//				q.next = q.next.next;
//				q.next.prev = q;
//			}
//		}
//		return start;
//	}
//	
//	public static void search(Node start) {
//		System.out.print("Enter regd.no to search and update: ");
//		int regd = sc.nextInt();
//		Node q = start;
//		
//		while( regd != q.regd_no ) {
//			q = q.next;
//		}
//		
//		if( regd == q.regd_no ) {
//			System.out.println("Regestration number found!!! ");
//			System.out.print("Enter marks to edit: ");
//			q.mark = sc.nextFloat();
//			return;
//		}
//		System.out.println("ERROR!!! Regestration number not found!!!");
//	}
//	
//	public static void display(Node start, Node end){
//		Node q = start;
//		while( q != null ) {
//			System.out.print(q.regd_no+" "+q.mark+" -> ");
//			q = q.next;
//		}
//		System.out.println("null");
//	}
//	
//	public static int count( Node start ) {
//		Node p1 = start;
//		byte c = 0;
//		while( p1 != null ) {
//			c++;
//			p1 = p1.next;
//		}
//		return c;
//	}
//	
////	/*public static void evenSum( Node start ) {
////		Node q = start;
////		float min = q.mark;
////		while( q != null ) {
////			if( min > q.mark )
////				min = q.mark;
////			q = q.next;
////		}
////		String s = Float.toString(min);
////		char c[] = s.toCharArray();
////		
////		String sum = "";
////		for( int i = 0; i < c.length; i++ ) {
////			if( i % 2 == 0 ) 
////				sum += c[i];
////		}
////		System.out.println(sum);
////	}*/
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Node start = p;
//		Node end = null;
//		
//		while(true){
//			
//		System.out.println("****MENU*****");
//		System.out.println("0: Exit");
//		System.out.println("1: Creation");
//		System.out.println("2: Display");
//		System.out.println("3: Insertion");
//		System.out.println("4: Deletion");
//		System.out.println("5: Searching");
//		System.out.println("Enter your choice");
//		int choice = sc.nextInt();
//		switch(choice){ 
//			case 0:
//				System.exit(0);
//			case 1:
//				end = create(start,end);
//				break;
//			case 2:
//				display(start,end);
//				break;
//			case 3:
//				start = insAny(start,end);
//				break;
//			case 4:
//				start = delAny(start,end);
//				break;
//			case 5:
//				search(start);
//				break;
////			case 6:
////				evenSum( start );
////				break;
//			default:
//				System.out.println("Wrong choice");
//		}
//		}
//		}
//}
//	
//	
//
//
