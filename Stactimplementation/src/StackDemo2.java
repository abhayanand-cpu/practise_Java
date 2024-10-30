import java.util.Scanner;
public class StackDemo2 {
	
	static int maxSize = 5;
	static int data[] = new int[maxSize];
	static int top = -1;
	
	public static void push() {
		Scanner sc = new Scanner(System.in);
		if( isFull() ) 
			System.out.println("Stack overflow.");
		else 
			data[++top] = sc.nextInt();
	}

	public static void display() {
		if( top == -1 )
			System.out.println("Stack underflow.");
		else {
			for( int i = 0; i <= top; i++ )
				System.out.println(data[i]);
		}
	}
	
	public static void pop() {
		if( isEmpty() )
			System.out.println("UnderFlow.");
		else {
			System.out.println("the deleted element is "+data[top--]);
		}
	}
	
	public static void peek() {
		if( isEmpty() )
			System.out.println("Stack is empty.");
		else {
			System.out.println("Peek element is "+data[top]);	
		}
	}
	
	public static boolean isFull() {
		return maxSize-1 == top;
	}
	
	public static boolean isEmpty() {
		return top == -1;
	}
	
	public static void dynamicpush() {
		
		Scanner sc = new Scanner(System.in);
		
		if( isFull() ) {
			maxSize = 2 * maxSize;
			int temp[] = new int[maxSize];
			for( int i = 0; i < data.length; i++ )
				temp[i] = data[i];
			data = temp;
		}
		data[++top] = sc.nextInt();
	}
	
	public static void main(String[] args) {

		for( int i = 0; i <= 12; i++ ) {
			dynamicpush();
		}
		for( int i = 0; i <= 12; i++ ) {
			pop();
		}
	}

}
