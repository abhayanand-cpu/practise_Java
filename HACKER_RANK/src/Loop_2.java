import java.util.Scanner;
class Loop_2{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = 0,v = 0;
            int j = 0;
            while (j<n) {
            s = ((int)(Math.pow(2,j)*b))+v;
            v = s;
            s = a+s;
            j++;
            System.out.printf("%d ",s);
            
            }
            System.out.println();
            
        }
        in.close();
    }
}