package ArrayBasedQuestion;

import java.util.Arrays;

public class TillN {

	public static void Sort1toN(int[] arr, int size){
		int curr, value, next;
		
		for (int i = 0; i < size; i++){ 
			curr = i;
			value = -1;
		/* swaps to move elements in proper position.*/
			while (curr >= 0 && curr < size && arr[curr] != curr + 1){
				next = arr[curr];
				arr[curr] = value;
				value = next;
				curr = next - 1;
				System.out.println(Arrays.toString(arr));
			}
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {8, 5, 6, 1, 9, 3, 2, 7, 4, 10};
		int size = arr.length;
		Sort1toN(arr, size);
		System.out.println(Arrays.toString(arr));
	}

}
