import java.util.ArrayList;
import java.util.Scanner;

class Graph{
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
	
	void getEdges(){                              // METHOD RETURNS EDGES OF A COMPLETE GRAPH
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
}

public class ComplementGraph extends Graph{
	
	ArrayList<String> checkingEdges( ArrayList<String> a ){
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> edges = new ArrayList<String>();  //ARRAYLIST FOR STORING EDGES OF A INCOMPLETE GRAPH
		ArrayList<String> Cedges = new ArrayList<String>(); //ARRAYLIST FOR STORING COMPLIMENT EDGES
		
		System.out.print("Enter edges, type exit if you are done with edges: ");
		
			while( true ) {
				String s = sc.next();     // TAKING EDGES OF INCOMPLETE GRAPH 
				if( s.equals("exit") )
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

	public static void main(String[] args) {
		ComplementGraph cg = new ComplementGraph();
		cg.getData();
		cg.getEdges();
		System.out.println("Compliment of desired graph is: "+cg.checkingEdges(Graph.a));
		
	}

}
