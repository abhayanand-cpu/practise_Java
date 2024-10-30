import java.util.Scanner;
class CircularQueue{
	
	int front = 0;
	int end = 0;
	int size = 0;
	int maxSize = 5;
	int data[] = new int[maxSize];
	
	boolean isFull() {
		return size == data.length;
	}
	
	boolean isEmpty() {
		return size == 0;
	}
	
	public void push() {
		Scanner sc = new Scanner(System.in);
		if( isFull() ) {
			System.out.println("Stack overflow.");
			DynamicCQ();
		}
		else {
			data[end++] = sc.nextInt();
			end = end % data.length;
			size++;
		}
	}
	
	public void pop() {
		if( isEmpty() )
			System.out.println("UnderFlow.");
		else {
			int remove = data[front++];
			System.out.println("Removed data is "+remove);
			front = front % data.length;
			size--;
		}
	}
	
	public void display() {
		if( isEmpty() )
			System.out.println("Stack underflow.");
		else {
			int i = front;
			do {
				System.out.print(data[i]+" ");
				i++;
				i %= data.length;
			}while( i != end );
			System.out.println("END");
		}
	}
	
	public void DynamicCQ() {
		if( isFull() ) {
			int temp[] = new int[2*data.length];
			
			for( int i = 0; i < data.length; i++ ) {
				data[i] = data[(front + i) % data.length];
			}
			front = 0;
			end = data.length;
			data = temp;
		}
	}
}
class Q{
	
	static final int Size = 5;
	int top = -1;
	int data[] = new int[Size];
	
	boolean isFull() {
		return top == data.length - 1;
	}
	
	boolean isEmpty() {
		return top == -1;
	}
	
	public void push() {
		Scanner sc = new Scanner(System.in);
		if( isFull() ) 
			System.out.println("Stack overflow.");
		else 
			data[++top] = sc.nextInt();
	}

	public void display() {
		if( top == -1 )
			System.out.println("Stack underflow.");
		else {
			for( int i = 0; i <= top; i++ )
				System.out.println(data[i]);
		}
	}
	
	public void pop() {
		if( isEmpty() )
			System.out.println("UnderFlow.");
		int remove = data[0];
		for( int i = 1; i <= top; i++ ) {
			data[i-1] = data[i];
		}
		System.out.println("Removed data is "+remove);
		top--;
	}
}

public class Queue {
	
	static final int Size = 5;
	int front = -1;
	int end = -1;
	int data[] = new int[Size];
	
	public void push( int item ) {
		if( isFull() ) {
			System.out.println("Queue Overflow.");
		}
		else if( end == -1 ) {
			front = end = 0;
			data[end] = item;
		}
		else {
			data[++end] = item;
		}
	}
	
	public void pop() {
		if( isEmpty() ) {
			System.out.println("Queue Underflow.");
		}
		else if( front == end ) {
			System.out.println("Your deleted element is "+data[front]);
			front = end = -1;
		}
		else {
			System.out.println("Your deleted element is "+data[front++]);
		}
	}
	
	boolean isFull() {
		return end == data.length - 1;
	}
	
	boolean isEmpty() {
		return end == -1;
	}
	
	public void display() {
		if( front == -1 && end == -1 )
			System.out.println("Underflow.");
	
		for( int i = front; i <= end; i++ ) {
			System.out.print(data[i]+" ");
		}
		System.out.println("END");
	}
	
	public void Dynamicpush( int item ) {
		if( isFull() ) {
			int temp[] = new int[2 * data.length];
			for( int i = 0; i <= end; i++ )
			 	temp[i] = data[i];
			data = temp;
		}
		push( item );
	}
	
	public static void main(String[] args) {
//		Queue q = new Queue();
//		q.push(10);
//		q.push(15);
//		q.push(17);
//		q.push(13);
//		q.push(14);
//		q.pop();
//		q.pop();
//		q.pop();
//		q.pop();
//		q.pop();
//		
//		for( int i = 0; i <= 25; i++ ) {
//			q.Dynamicpush(i);
//		}
//		q.display();
//
//		for( int i = 0; i <= 20; i++ ) {
//			q.pop();
//		}
//		
//		for( int i = 0; i <= 25; i++ ) {
//			q.Dynamicpush(i);
//		}
//		q.display();
//		
//		Q r = new Q();
//		r.push();
//		r.push();
//		r.push();
//		r.push();
//		r.push();
//		r.display();
//		r.pop();
//		r.pop();
//		r.pop();
//		r.display();
		
		CircularQueue cq = new CircularQueue();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.pop();
//		cq.pop();
//		cq.pop();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.pop();
//		cq.pop();
//		cq.display();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.push();
//		cq.display();
//		cq.pop();
//		cq.display();
//		cq.push();
//		cq.display();
		for( int i = 0; i <= 20; i++ ) {
			cq.push();
		}
		cq.display();
		for( int i = 0; i <= 10; i++ ) {
			cq.pop();
		}
		cq.display();
		for( int i = 0; i <= 8; i++ ) {
			cq.push();
		}
		cq.display();
	}
}
