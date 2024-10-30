import java.util.ArrayList;
import java.util.Scanner;

public class CompleteGraph1 {
	
	static ArrayList<String> a = new ArrayList<String>(); //ARRAYLIST FOR STORING EDGES OF COMPLETE GRAPH
	Scanner sc = new Scanner(System.in);
	int n;
	char v[];
	
	void getData() {     // METHOD TAKES VERTICES OF A GRAPH
		System.out.print("Enter number of vertices: ");
			n = sc.nextInt();
		System.out.print("Enter vertices: ");
			v = new char[n];
			
		for( int i = 0; i < n; i++ ) {
			v[i] = sc.next().charAt(0);
		}
	}
	
	void getEdges(){                                // METHOD RETURNS EDGES OF A COMPLETE GRAPH
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < n; j++ ) {
				if( v[i] != v[j] ) {
					a.add(""+v[i]+v[j]);
					for( int k = a.size()-2; k >= 0; k-- ) {
						String s = ""+v[j]+v[i];
						if( s.equals(a.get(k)) )   // Using v[i]+v[j] != v[j]+v[i]
							a.remove(a.size()-1);
					}
				}
			}
		}
	}
	
	void display() { // DISPLAYING COMPLETE'S GRAPH EDGES
		System.out.println("Your possible edges are:\n"+a);
	}

	public static void main(String[] args) {
		
		CompleteGraph1 c = new CompleteGraph1(); 
		c.getData();
		c.getEdges();
		c.display();
	}

}

/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CompleteGraph1 {
	
	ArrayList<String> a = new ArrayList<String>(); //ARRAYLIST FOR STORING EDGES OF COMPLETE GRAPH
	Scanner sc = new Scanner(System.in);
	int n;
	char v[];
	int array[][] = new int[n][n];
	void getData() {     // METHOD TAKES VERTICES OF A GRAPH
		System.out.print("Enter number of vertices: ");
			n = sc.nextInt();
		System.out.print("Enter vertices: ");
			v = new char[n];
			
		for( int i = 0; i < n; i++ ) {
			v[i] = sc.next().charAt(0);
		}
	}
	
	void getEdges() {
		for( int i = 0; i < n; i++ ) {
			for( int j = i + 1; j < n; j++ ) {
				a.add(""+v[i]+v[j]);
			}
		}
	}
	
	void display() { // DISPLAYING COMPLETE'S GRAPH EDGES
		System.out.println("Your possible edges are:\n"+a);
		
	}

	void displayInMatrix() {    // METHOD RETURNS EDGES OF A COMPLETE GRAPH
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < n; j++ ) {
				if( v[i] != v[j] ) {
					a.add(""+v[i]+v[j]);
					array[i][j] = 1;
						for( int k = a.size()-2; k >= 0; k-- ) {
							String s = ""+v[j]+v[i];
							if( s.equals(a.get(k)) ) 
								a.remove(a.size()-1);
						}
					}
				}
			}
		}
	public static void main(String[] args) {
		
		CompleteGraph1 c = new CompleteGraph1(); 
		c.getData();
		c.getEdges();
		c.display();
	}

}*/

