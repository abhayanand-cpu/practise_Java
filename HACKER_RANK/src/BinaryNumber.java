
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BinaryNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        byte lastDigit = 0;
        String s = "";
        while( n != 0 ){
            lastDigit = (byte)(n % 2);
            s = lastDigit + s;
            n /= 2;
        }
        char [] arr = s.toCharArray();
        ArrayList<Integer> list = new ArrayList<>();
      
        int occur = 0;
        for( int i = 0; i < arr.length; i++ ) {
        	if( arr[i] == '1' ) {
        		occur++;
        		list.add(occur);
        	}
        	else{
        		occur = 0;
        	}
        }
//      System.out.println(list);
        System.out.println(Collections.max(list));
        sc.close();
    }
}
