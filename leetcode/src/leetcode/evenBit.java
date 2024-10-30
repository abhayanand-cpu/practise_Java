package leetcode;

public class evenBit {

	public static void main(String[] args) {
		
		int mask = 0xAAAAAAAA;//10101010101010101010101010101010
		int b = 45;
		int bitmask = (int)(Math.log(mask)/Math.log(2)) + 1;
		int bitb = (int)(Math.log(b)/Math.log(2)) + 1;
		System.out.println(bitmask);
		System.out.println(bitb);
		int maskk = 0x55555555;//01010101010101010101010101010101
		int res = b & maskk;
		System.out.println(res);
		int res2 = b & mask;
		System.out.println(res2);
	}

}
