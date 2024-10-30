package oneMonthPrep;
import java.util.Scanner;

public class Solution {

    public static int numValidTriangles(int[] arr) {
        int count = 0;
        int n = arr.length;

        // Iterate through the array to consider each triplet of adjacent elements
        for (int i = 0; i < n - 2; i++) {
            int a = arr[i];
            int b = arr[i + 1];
            int c = arr[i + 2];

            // Check if the triplet (a, b, c) satisfies the Triangle Inequality Theorem
            if (a + b > c && a + c > b && b + c > a) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array_length = scan.nextInt();
        int[] arr = new int[array_length];

        for (int j = 0; j < array_length; j++) {
            arr[j] = scan.nextInt();
        }

        int result = numValidTriangles(arr);
        System.out.println(result);
    }
}
