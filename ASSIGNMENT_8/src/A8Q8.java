//import java.util.Arrays;
//import java.util.Scanner;
//
//class Menu{
//	
//	static Scanner sc = new Scanner(System.in);
//	static int N = sc.nextInt();
//	static int array[] = new int[20];
//	
//	static void ArrayC() {
//		System.out.print("Enter elements: ");
//		for( int i = 0; i < N; i++ ) {
//			array[i] = sc.nextInt();
//		}
//		System.out.println("\nYour array is created successfully....\n");
//	}
//	
//	static void DisplayAE() {
//		System.out.print("\nYour entered array is: ");
//		
//		for( int i = 0; i < N; i++ ) {
//			System.out.print(array[i]+" ");
//		}
//		System.out.println("\n");
//	}
//	
//	static void InsertAE() {
//		int M = N + 1;
//		int []array1 = new int[M];
//		
//		System.out.print("Enter element you wanna insert: ");
//		int element = sc.nextInt();
//		System.out.print("Enter position: ");
//		int pos = sc.nextInt();
//		
//		for( int i = 0 ,j = 0; j < M; ) {
//			if( j != pos ) {
//				array1[j] = array[i];
//				i++; j++;
//			}
//			else {
//				array1[j] = element;
//				j++;
//			}
//		}
//		System.out.println(Arrays.toString(array1));
//	}
//	
//	
//	static void DeleteAE() {
//		int O = N - 1;
//		int []array2 = new int[O]; 
//		System.out.print("Enter position of element to be deleted: ");
//		int pos = sc.nextInt();
//		for( int i = 0,j = 0; j < O; ) {
//			 if( i != pos ) {
//				 array2[j] = array[i];
//				 i++; j++;
//			 }
//			 else {
//				 i++;
//			 }
//		}
//		System.out.println(Arrays.toString(array2));
//	}
//}
//
//public class A8Q8 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char options;
//		int count = 0;
//		do {
//			System.out.println("----------Menu-----------");
//			System.out.print("a. Create an array of N integers\n"
//					+ "b. Display the array elements\n"
//					+ "c. Insert an element at specific position\n"
//					+ "d. Delete an element at a given position\n"
//					+ "e. Exit\nChoose your option: ");
//			
//			options = sc.next().charAt(0);
//			switch( options ) {
//			case 'a': System.out.print("Enter no. of desired element: ");
//					Menu.ArrayC();
//					count++;
//				break;
//			case 'b': if( count != 0 )
//							Menu.DisplayAE();
//					  else
//							System.out.println("\nYou did not gave any array yet!!!!!!!\n");
//				break;
//			case 'c': if( count != 0 )
//							Menu.InsertAE();
//					  else
//							System.out.println("\nYou did not gave any array yet!!!!!!!\n");
//				break;
//			case 'd': if( count != 0 )
//							Menu.DeleteAE();
//					  else
//						  	System.out.println("\nYou did not gave any array yet!!!!!!!\n");
//				break;
//			case 'e':System.out.println("\nterminated..........");
//				break;
//			}
//			
//		}while( options != 'e' );
//			
//		sc.close();
//	}
//
//}

import java.util.Scanner;

class Menu{
	
	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int array[] = new int[20];
	
	static void ArrayC() {
		System.out.print("Enter elements: ");
		for( int i = 0; i < N; i++ ) {
			array[i] = sc.nextInt();
		}
		System.out.println("\nYour array is created successfully....\n");
	}
	
	static void DisplayAE() {
		System.out.print("\nYour desired array is: ");
		
		for( int i = 0; i < N; i++ ) {
			System.out.print(array[i]+" ");
		}
		System.out.println("\n");
	}
	
	static void InsertAE() {
		N = N + 1;
		
		System.out.print("Enter element you wanna insert: ");
		int element = sc.nextInt();
		System.out.print("Enter position: ");
		int pos = sc.nextInt();
		
		for( int i = N; i > pos; i-- ) {
			array[i] = array[i-1];
		}
		array[pos] = element;
		System.out.println("\nYour element is inserted successfully...\n");
	}
	
	
	static void DeleteAE() {
		N = N - 1;
		 
		System.out.print("Enter position of element to be deleted: ");
		int pos = sc.nextInt();
		
		for( int i = pos; i < N; i++ ) {
			array[i] = array[i+1];
		}
		System.out.println("\nYour element is deleted successfully...\n");
	}
}

public class A8Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char options;
		int count = 0;
		do {
			System.out.println("----------Menu-----------");
			System.out.print("a. Create an array of N integers\n"
					+ "b. Display the array elements\n"
					+ "c. Insert an element at specific position\n"
					+ "d. Delete an element at a given position\n"
					+ "e. Exit\nChoose your option: ");
			
			options = sc.next().charAt(0);
			switch( options ) {
			case 'a': System.out.print("Enter no. of desired element: ");
					Menu.ArrayC();
					count++;
				break;
			case 'b': if( count != 0 )
							Menu.DisplayAE();
					  else
							System.out.println("\nYou did not gave any array yet!!!!!!!\n");
				break;
			case 'c': if( count != 0 )
							Menu.InsertAE();
					  else
							System.out.println("\nYou did not gave any array yet!!!!!!!\n");
				break;
			case 'd': if( count != 0 )
							Menu.DeleteAE();
					  else
						  	System.out.println("\nYou did not gave any array yet!!!!!!!\n");
				break;
			case 'e':System.out.println("\nProgram terminated....");
				break;
			}
			
		}while( options != 'e' );
			
		sc.close();
	}
}
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class Menu{
//	
//	static Scanner sc = new Scanner(System.in);
//	static ArrayList<Integer> arr = new ArrayList<Integer>();
//	
//	static void ArrayC( int N ) {
//		System.out.print("Enter elements: ");
//		for( int i = 0; i < N; i++ ) {
//			arr.add(sc.nextInt());
//		}
//		System.out.println("\nYour array is created successfully....\n");
//	}
//	
//	static void DisplayAE() {
//		System.out.print("\nYour desired array is: ");
//		
//		for( int i = 0; i < arr.size(); i++ ) {
//			System.out.print(arr.get(i)+" ");
//		}
//		System.out.println("\n");
//	}
//	
//	static void InsertAE() {
//		
//		System.out.print("Enter element you wanna insert: ");
//		int element = sc.nextInt();
//		System.out.print("Enter position: ");
//		int pos = sc.nextInt();
//		arr.add(pos,element);
//		
//		System.out.println("\nYour element is inserted successfully...\n");
//	}
//	
//	
//	static void DeleteAE() {
//		 
//		System.out.print("Enter position of element to be deleted: ");
//		int pos = sc.nextInt();
//		arr.remove(pos);
//		
//		System.out.println("\nYour element is deleted successfully...\n");
//	}
//}
//
//public class A8Q8 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		char options;
//		int count = 0;
//		do {
//			System.out.println("----------Menu-----------");
//			System.out.print("a. Create an array of N integers\n"
//					+ "b. Display the array elements\n"
//					+ "c. Insert an element at specific position\n"
//					+ "d. Delete an element at a given position\n"
//					+ "e. Exit\nChoose your option: ");
//			
//			options = sc.next().charAt(0);
//			switch( options ) {
//			case 'a': System.out.print("Enter no. of desired element: ");
//					int N = sc.nextInt();
//					Menu.ArrayC(N);
//					count++;
//				break;
//			case 'b': if( count != 0 )
//							Menu.DisplayAE();
//					  else
//							System.out.println("\nYou did not gave any array yet!!!!!!!\n");
//				break;
//			case 'c': if( count != 0 )
//							Menu.InsertAE();
//					  else
//							System.out.println("\nYou did not gave any array yet!!!!!!!\n");
//				break;
//			case 'd': if( count != 0 )
//							Menu.DeleteAE();
//					  else
//						  	System.out.println("\nYou did not gave any array yet!!!!!!!\n");
//				break;
//			case 'e':System.out.println("\nProgram terminated....");
//				break;
//			}
//			
//		}while( options != 'e' );
//			
//		sc.close();
//	}
//
//}