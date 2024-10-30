import java.lang.Math;

public class Q_15 {

	public static void main(String[] args) {
	
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
	   
       int max = Math.max(a, b);
       int min = Math.min(a, b);
       int result = min+(int)(Math.random()*(max-min+1));
       System.out.println(result);
     
       
	}

}
