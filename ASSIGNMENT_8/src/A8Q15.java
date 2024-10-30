import java.util.Arrays;
import java.util.Scanner;
public class A8Q15 {
	
	public static int partition(int[] list) { //returns the index where the pivot is located in the new list
		int location = 0;
		int pivot = list[0];
		for(int i = 0; i < list.length; i++ ) {

			if( pivot > list[i] ) {
				location++;
			}

		}
		return location;
	}
	
	public static int[] Newlist(int[] list,int l) {
		int Newlist[] = new int[list.length];
		int j = 1,k = 1;
		Newlist[l] = list[0];
		for( int i = 1; i < list.length; i++ ) { 

			if( list[i] <= Newlist[l] ) {
				Newlist[l-j] = list[i];
				j++;
			}
			else if( list[i] > Newlist[l] ) {
				Newlist[l+k] = list[i];
				k++;
			}
			
		}
		return Newlist;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of desired element: ");
		int n = sc.nextInt();
		
		int list[] = new int[n];
		System.out.print("Enter List: ");
		for( int i = 0; i < n; i++ ) {
			list[i] = sc.nextInt();
		}

		int Newlist[] = Newlist(list,partition(list));
		System.out.println("After the partition, the list is: "+Arrays.toString(Newlist));
		
		sc.close();
	}

}
