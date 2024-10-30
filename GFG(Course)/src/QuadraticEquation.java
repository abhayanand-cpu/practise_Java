import java.io.*;
import java.util.*;

class QuadraticEquation{
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while( T --> 0 ){
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			Solution obj = new Solution();
			ArrayList<Integer> ans = obj.quadraticRoots(a, b, c);
			if( ans.size() == 1 && ans.get(0) == -1 )
				System.out.print("Imaginary");
			else
				for( Integer val : ans ) System.out.print(val+" ");
				System.out.println();
		}
	}
}

class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> ab = new ArrayList<Integer>();
        
        double D = Math.pow(b,2) -  4*a*c;
        
        if( D < 0 ){
            ab.add(-1);
        }
        else{
            
            int r1 = (int)(( -b + Math.sqrt(D) )/(2*a));
            int r2 = (int)(( -b - Math.sqrt(D) )/(2*a));
        
            if( r1 > r2 ){
                ab.add(r1);
                ab.add(r2);
            }
            
            else{
                ab.add(r2);
                ab.add(r1);
            }
        }
        return ab;
    }
}
