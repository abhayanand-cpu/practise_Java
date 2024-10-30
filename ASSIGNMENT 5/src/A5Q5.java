
public class A5Q5 {

	public static void main(String[] args) {
		int k=0;
		for(int j=100; j<=1000; j++) {
				
			if (j%5==0 && j%6==0) {
				k++;
			    System.out.print(j+" ");
			if(k%10==0)
			    System.out.println();
			}
				
			    	
		}
	}

}