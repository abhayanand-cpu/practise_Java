//import java.io.*;                                                           
//public class Java_datatypes{
//    public static void main(String args[]) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        String s = "";
//        for (int i = 1; i<=a; i++) {
//            try {
//                s = br.readLine();
//            long n = Long.parseLong(s);
//            
//        if ( n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) {
//                System.out.println(n+" can be fitted in:\n* Byte\n* short\n* int\n* long");
//        }
//
//        else if ( n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) { 
//            System.out.println(n+" can be fitted in:\n* short\n* int\n* long");
//        }
//
//        else if ( n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) {
//            System.out.println(n+" can be fitted in:\n* int\n* long");
//        }
//
//        else if ( n>=Long.MIN_VALUE && n<=Long.MAX_VALUE) {
//            System.out.println(n+" can be fitted in:\n* long");
//        }
//            
//            } 
//            catch(Exception e) {
//                System.out.println(s+" can't be fitted anywhere.");
//                
//            } 
//            
//                
//        }
//        br.close();
//    }
//}

import java.util.Scanner;
public class Java_datatypes{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for(int i = 1; i<=s; i++){
            try{
            long n = sc.nextLong();
            if ( n>= Byte.MIN_VALUE && n<=Byte.MAX_VALUE){
                System.out.println(n+" can be fitted in:\n* Byte\n* Short\n* int\n* long");
            }
            else if ( n>= Short.MIN_VALUE && n<=Short.MAX_VALUE){
                System.out.println(n+" can be fitted in:\n* Short\n* int\n* long");
            }
             else if ( n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) {
                System.out.println(n+" can be fitted in:\n* int\n* long");
            }
            else if ( n>=Long.MIN_VALUE && n<=Long.MAX_VALUE) {
                System.out.println(n+" can be fitted in:\n* long");
            }
            } catch(java.util.InputMismatchException e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
//import java.io.*;
//public class Java_datatypes {

//	public static void main(String[] args)throws IOException {
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		int t=Integer.parseInt(br.readLine());
//		while(t-->=1) 
//		{
//			long num=Long.parseLong(br.readLine());;
//			if(num>=-128 && num<=127)
//				{
//				System.out.println(num+" can be fitted in");
//				System.out.println("* byte");
//				System.out.println("* short");
//				System.out.println("* int");
//				System.out.println("* long");
//				}
//			else if(num>=Short.MIN_VALUE && num<=Short.MAX_VALUE)
//				{
//				System.out.println(num+" can be fitted in");
//				System.out.println("* short");
//				System.out.println("* int");
//				System.out.println("* long");
//				}
//			else if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE)
//				{
//				System.out.println(num+" can be fitted in");
//				System.out.println("* int");
//				System.out.println("* long");
//				}
//			else if(num>=Long.MIN_VALUE && num<=Long.MAX_VALUE)
//				{
//				System.out.println(num+" can be fitted in");
//				System.out.println("* long");
//				}
//			else
//				System.out.println(num+" can't be fitted anywhere");}
//	}
//
//}

//import java.io.*;
//
//public class Java_datatypes {
//    public static void main(String[] args) throws IOException{
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine()); // no of test cases
//        String input = "";
//
//        while (N-- > 0) {
//            try {
//
//                input = br.readLine();
//                long number = Long.parseLong(input);
//
//                System.out.println(number + " can be fitted in: ");
//
//                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE)
//                    System.out.println("* byte");
//
//                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE)
//                    System.out.println("* short");
//
//                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE)
//                    System.out.println("* int");
//
//                if (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE)
//                    System.out.println("* long");
//
//            } catch (NumberFormatException e) { // NumberFormatException occurs when the capacity of variable is lesser than
//                                                // entered value.
//                // Eg: storing 2 in a 1 bit variable.
//                System.out.println(input + " can't be fitted anywhere.");
//
//            } //catch (Exception e) {
////                System.out.println(e);
//            //}
//        }
//    }
//}