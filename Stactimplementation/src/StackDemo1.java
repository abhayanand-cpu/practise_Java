import java.util.Scanner;
public class StackDemo1 {
	
	public static boolean isFull(int top) {
		return (top == MAX - 1);
	}
	
	public static int push(int S[],int top) {
		Scanner sc=new Scanner(System.in);
		if( isFull( top ))
			System.out.println("Overflow");
		else if( top == -1 ) {
			top = 0;
			System.out.print("Enter the element to push in a stack: ");
			S[top] = sc.nextInt();
		}
		else {
			System.out.print("Enter the element to push in a stack: ");
			S[++top] = sc.nextInt();
		}
		return top;
	}
	
	public static boolean isEmpty(int top) {
		return top == -1;
	}
	
	public static int pop(int S[],int top) {
		if( isEmpty(top) )
			System.out.println("Underflow.");
		else if( top == 0 ) {
			System.out.println("The deleted element is "+S[top]);
			top = -1;
		}
		else {
			System.out.println("The deleted element is "+S[top--]);
		}
		return top;
	}
	
	public static void display(int S[],int top) {
		if( top == -1 )
			System.out.print("Underflow.");
		else {
			for( int i = 0; i <= top; i++ )
				System.out.println(S[i]);
		}
	}
	
	public static void peek( int S[],int top ) {
		if( top == -1 )
			System.out.println("Stack is empty.");
		else
			System.out.println("Peek element is "+S[top]);
	}
	
	public static final int MAX=4;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int stack[]=new int[MAX];
		int top=-1;
		while(true)
		{
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Insertion");
		System.out.println("2: Deletion");
		System.out.println("3: Pop");
		System.out.println("4: Peek");
		System.out.print("ENTER YOUR CHOICE: ");
		int choice=sc.nextInt();
		switch(choice)
		{
 		case 0:
		System.exit(0);
		case 1:
			top = push( stack, top );
			break;
		case 2:
			top = pop( stack, top );
			break;
		case 3:
			display( stack, top );
			break;
		case 4:
			peek( stack ,top );
			break;
		default:
			System.out.println("Invalid choice");
			}
			}
	}

}
