//import java.util.Scanner;
//class Node{
//	int info;
//	Node next;
//}
//public class QUeue_Demo2 {
//	public static Node insert(Node rear, Node front){
//		Scanner sc = new Scanner(System.in);
//		Node temp = new Node();
//		System.out.print("Enter info: ");
//		temp.info = sc.nextInt();
//		if( temp == null )
//			rear = front = temp;
//		else {
//			rear.next = temp;
//			rear = temp;
//		}
//		return front;
//	}
//	
//	public static Node delete (Node rear, Node front) {
//		if( front == null )
//			System.out.println("Underflow.");
//		else if( front == rear ) {
//			System.out.println("the deleted element is "+front.info);
//			front = rear = null;
//		}
//		else {
//			System.out.println("the deleted element is "+front.info);
//			front = front.next;
//		}
//		return front;
//	}
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		Node rear = null,front = null;
//		
//		while(true)
//		{
//		System.out.println("****MENU****");
//		System.out.println("0:Exit");
//		System.out.println("1:Insert");
//		System.out.println("Enter your choice");
//		int choice=sc.nextInt();
//		switch(choice)
//		{
//		case 0:
//		System.exit(0);
//		case 1:
//			front = insert(rear,front);
//			break;
//		case 2:
//			front = delete(rear,front);
//			break;
//		default:
//			System.out.println("Wrong choice");
//		}
//		}
//	}
//
//}
