package chapter_5.hw;

public class MinMax1 {
	public static void main(String[] args) {
//		int[] nums = new int[10];
		int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
		int min, max;
		
//		nums[0] = 99;
//		nums[1] = -10;
//		nums[2] = 100123;
//		nums[3] = 18;
//		nums[4] = -978;
//		nums[5] = 5623;
//		nums[6] = 463;
//		nums[7] = -9;
//		nums[8] = 287;
//		nums[9] = 49;
		
		min = max = nums[0];

		for (int var : nums) {
			if (var < min) {
			min = var;
			} else if (var > max) {
				max = var;
			}
		}
		System.out.println("max: " + max + " | " + "min: " + min);
	}
}