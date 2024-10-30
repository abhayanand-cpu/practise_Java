import java.util.Scanner;
class BinarySearch{
	static int Search( int n[], int s ) {
		int i = 0;
		int j = n.length - 1;
		
		while( i <= j ) {
			int mid = (i + j)/2;
			
			if( n[mid] < s )
				i = mid + 1;
			else if( n[mid] > s )
				j = mid - 1;
			else
				return mid;
		}
		return -1;
	}
}
public class A8Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n[] = new int[10];
		System.out.print("Enter "+n.length+" numbers: ");
		
		for( int i = 0; i < n.length; i++ ) {
			int num = sc.nextInt();
			n[i] = num;
		}
		
		System.out.print("Enter the number you wanna search for: ");
		int s = sc.nextInt();
		int num =  BinarySearch.Search(n,s);
		
		if( num != -1 ) {
			int occur = 0;
			for(int i = 0; i < n.length; i++ ) {
				if( n[i] == n[num] )
					occur++;
			}
			System.out.println(s+" Occur "+occur+" time"+(occur > 1 ? "s." : "."));
		}
		else {
		System.out.println("Number "+s+" is not present in Array.");
		}
		sc.close();
	}

}
