//import java.util.Scanner;
//
//public class Java_datatypes {
//
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       
//       byte a = sc.nextByte();
//       if (a>=-128 && a<=127)
//    	   System.out.print(a+" can be fitted in: \n"+"*byte\n"+"*short\n"+"*int\n"+"*long\n");
//       short b = sc.nextShort();
//       if (b>=-32_768 && b<=+32_767)
//    	   System.out.print(b+" can be fitted in: \n"+"*short\n"+"*int\n"+"*long\n");
//       int c = sc.nextInt();
//       if (c>=-2_147_483_648 && c<=+2_147_483_647)
//    	   System.out.print(c+" can be fitted in: \n"+"*int\n"+"*long\n");
//       long d = sc.nextLong();
//       if (d>=-2_147_483_648 && d<=+2_147_483_647 )
//    	   System.out.print(d+" can be fitted in: \n"+"*int\n"+"*long\n");
//       else
//    	   System.out.printf("%d can't be fitted anywhere. ",a,b,c,d);
//       sc.close();
//    }
//}

// Scanner sc = new Scanner(System.in);
//    int t=sc.nextInt();
//
//    for(int i=0;i<t;i++)
//    {
//
//        try
//        {
//            long x=sc.nextLong();
//            System.out.println(x+" can be fitted in:");
//            if(x>=-128 && x<=127)System.out.println("* byte");
//            //Complete the code
//            if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
//                System.out.println("* short");
//            if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
//                System.out.println("* int");
//            if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
//                System.out.println("* long");
//        }
//        catch(Exception e)
//        {
//            System.out.println(sc.next()+" can't be fitted anywhere.");
//        }
//
//    }
//}