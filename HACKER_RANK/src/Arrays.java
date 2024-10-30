//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.regex.*;
//
//
//
//public class Arrays {
//    public static void add(int i) throws IOException{
//    	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         List<Integer> arr2 = new ArrayList<>();
//         String[] arrTemp2 = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//         int j;
//         int arrItem2 = 0;
//         for( j = arr2.size(); j <= i; j++) {
//        	 arrItem2 = Integer.parseInt(arrTemp2[j]);
//         }
//         System.out.print(arrItem2);
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        List<Integer> arr = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrTemp[i]);
//            arr.add(arrItem);
//        }
//        bufferedReader.close();
//    }
//}

