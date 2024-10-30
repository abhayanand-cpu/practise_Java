package leetcode;

import java.util.Stack;

public class Valid_Parentheses {
	
//	public static boolean isValid(String s) {
//		
//		int i = 0;
//		int l = s.length();
//		Stack st = new Stack();
//		
//		while( i < l ) {
//			char c = s.charAt(i);
//			if( c == '{' || c == '(' || c == '[' ) {
//				st.push(c);
//			}
//			else {
//				if( c == '}' && st.peek() == '{' )
//					st.pop();
//				else if( c == ')' && st.peek() == '(' )
//					st.pop();
//				else if( c == ']' && st.peek() == '[' )
//					st.pop();
//				else
//					return false;
//			}
//			i++;
//		}
//		if( st.peek() != ' ')
//			return false;
//		
//        return true;
//    }
//
//	
//	static class Node{
//		
//		char data;
//		Node next;
//		
//		public Node( char data ) {
//			this.data = data;
//			next = null;
//		}
//	}
//	
//	static class Stack{
//		
//		static Node head;
//		
//		public static boolean isEmpty() {
//			return head == null;
//		}
//		
//		public void push( char data ) {
//			Node n = new Node(data);
//			if( isEmpty() ) {
//				head = n;
//				return;
//			}
//			n.next = head;
//			head = n;
//		}
//		
//		public char pop() {
//			
//			if( isEmpty() ) {
//				return ' ';
//			}
//			
//			char top = head.data;
//			head = head.next;
//			return top;
//		}
//		
//		public char peek() {
//			
//			if( isEmpty() ) {
//				return ' ';
//			}
//			
//			return head.data;
//		}
//	}
	
public static boolean isValid(String s) {
		
		int i = 0;
		int l = s.length();
		Stack<Character> st = new Stack<Character>();
		
		while( i < l ) {
			char c = s.charAt(i);
			if( c == '{' || c == '(' || c == '[' ) {
				st.push(c);
			}
			else {
				if( !st.empty() && c == '}' && st.peek() == '{' )
					st.pop();
				else if( !st.empty() && c == ')' && st.peek() == '(' )
					st.pop();
				else if( !st.empty() && c == ']' && st.peek() == '[' )
					st.pop();
				else
					return false;
			}
			i++;
		}
		if( !st.empty() )
			return false;
		
        return true;
    }

	public static void main(String[] args) {
		
//		Stack s = new Stack();
//		s.push('{');
//		s.push('(');
//		s.push(')');
//		s.push('}');
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
//		s.pop();
//		System.out.println(s.peek());
		String s = "}";
		System.out.println(isValid(s));
	}

}
