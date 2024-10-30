import java.util.Scanner;
public class ReverseArray{
    
    static int[] Reversearr( int []arr , short n ){
        int []arr1 = new int[n];
        for( int i = 0; i < n; i++ ){
            arr1[i] = arr[n-i-1];
        }
        return arr1;
    }
    
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        short n = sc.nextShort();
        int [] arr = new int[n];
        
        for( int i = 0; i < n; i++ ){
            arr[i] = sc.nextInt();
        }
        int [] m = Reversearr(arr,n);
        
        for( int i = 0; i < n; i++ ){
            System.out.print(m[i]+" ");
        }
        sc.close();
    }
}
