import java.util.Scanner;
public class QueueDemo1 {
	
	public static final int MAX=3;
	public static int front=-1;
	public static int rear=-1;
	
	public static boolean is_full() {
		if( rear == MAX - 1 )
			return true;
		else
			return false;
	}
	
	public static void insert(int Q[]) {
		Scanner sc = new Scanner(System.in);
		if( is_full() )
			System.out.println("Overflow");
		else if( rear == -1 ) {
			rear = front = 0;
			System.out.print("Enter the element to insert in a queue: ");
			Q[rear] = sc.nextInt();
		}
		else {
			System.out.print("Enter the element to insert in a queue: ");
			Q[++rear] = sc.nextInt();
		}
			
	}
	
	public static boolean is_empty() {
		if( front == -1 )
			return true;
		else
			return false;
	}
	
	public static void delete(int Q[]) {
		if( is_empty() )
			System.out.println("Underflow.");
		else if( front == rear ) {
			System.out.println("The deleted element is "+Q[front]);
			front = rear = -1;
		}
		else {
			System.out.println("The deleted element is "+Q[front++]);
		}
	}
	public static void display(int Q[]) {
		if( front == -1 )
			System.out.println("Underflow.");
		else {
			for( int i = front; i <= rear; i++ )
				System.out.println(Q[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int queue[]=new int[MAX];
		
		while(true)
		{
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Insertion");
		System.out.println("2: Deletion");
		System.out.println("3: Display");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 0:
		System.exit(0);
		case 1: 
			insert(queue);
			break;
		case 2:
			delete(queue);
			break;
		case 3:
			display(queue);
			break;
		default:
			System.out.println("Invalid choice");
		}
		}
	}

}
