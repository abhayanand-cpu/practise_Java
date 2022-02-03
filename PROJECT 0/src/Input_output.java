import java.util.Scanner;
public class Input_output{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int numi;
      double numb;
      System.out.println("ENTER YOUR INTERGER NUMBER");
      numi = sc.nextInt();
      System.out.println("YOUR INTERGER NUMBER IS "+numi);
      System.out.println("ENTER YOUR DECIMAL NUMBER");
      numb = sc.nextDouble();
      System.out.println("YOUR DECIMAL NUMBER IS "+numb);
      sc.close();
   }
}