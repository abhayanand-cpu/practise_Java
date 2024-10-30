import java.util.*;
public class End_of_file {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		while ( sc.hasNext() ) {
			String line = sc.nextLine();
			System.out.printf("%d %s%n",i,line);
			i++;
		}
		
		sc.close();
	}

}
