import java.util.ArrayList;
import java.util.Scanner;
class compliment extends completeGraph{
	 ArrayList<String> checkingEdges( ArrayList<String> a ){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> edges = new ArrayList<String>();  //ARRAYLIST FOR STORING EDGES OF A INCOMPLETE GRAPH
		ArrayList<String> Cedges = new ArrayList<String>(); //ARRAYLIST FOR STORING COMPLIMENT EDGES
		
		System.out.print("Enter edges, type \"+\" if you are done with edges: ");
		
			while(true) {
				String s = sc.next();     // TAKING EDGES OF INCOMPLETE GRAPH 
				if( s.equals("+"))
					break; 
				edges.add(s);
			}
		
		for( int i = 0; i < a.size(); i++ ) {
			byte k = 0;
			for( int j = 0; j < edges.size(); j++ ) {   // PROCESS OF FINDING ALL POSSIBLE RESONABLE EDGES OF A GRAPH
				
				if( (a.get(i)).equals(edges.get(j)) ) {
					k++;
					break;
				}
				
			}
			if( k == 0 )
			Cedges.add(a.get(i));
		}
		return Cedges;
	}
}
class completeGraph{
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
	
	void getEdges(){     // METHOD RETURNS EDGES OF A COMPLETE GRAPH
		for( int i = 0; i < n; i++ ) {
			for( int j = 0; j < n; j++ ) {
				if( v[i] != v[j] ) {
					a.add(""+v[i]+v[j]);
					for( int k = a.size()-2; k >= 0; k-- ) {
						String s = ""+v[j]+v[i];
						if( s.equals(a.get(k)) ) 
							a.remove(a.size()-1);
					}
				}
			}
		}
	}
	
	void display() { // DISPLAYING COMPLETE'S GRAPH EDGES
		System.out.println("Your possible edges are:\n"+a);
	}
}
public class Q1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type \"1\" for complete graph or \"2\" for compliment of a graph: ");
		char choose = sc.next().charAt(0);
		
		if( choose == '1' ) {
		completeGraph c1 = new completeGraph();  // for complete graph 
		c1.getData();     // giving vertices of a graph
		c1.getEdges();    // identifying all possible edges
		c1.display();     // displaying edges of a complete graph
		}
		
		else if( choose == '2' ) {
			
		compliment c2 = new compliment();    // for compliment of a graph
		c2.getData();    // giving vertices of a graph
		c2.getEdges();   // identifying all possible edges
		System.out.print("Your compliment of a graph is: \n"+c2.checkingEdges(completeGraph.a));
		
		}     /* displaying complement of a graph by comparing all possible edges of a graph with given edges of
		         incomplete graph */ 
		sc.close();
	}

}