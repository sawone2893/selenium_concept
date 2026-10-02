package program.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	/*
	 * Given an array nums and target, return the indices of the two numbers that
	 * add up to target. Exactly one solution exists.
	 * 
	 * EXAMPLE nums = {2,7,11,15}, target = 9 → [0, 1] CONSTRAINTS & NOTES:Solve
	 * brute-force O(n²) first, then optimize to O(n) using a HashMap of seen
	 * values.
	 */

	public static int[] getIndicesOfNumsSumsTargetUsingBruteForceApproach(int arr[], int target) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public static int[] getIndicesOfNumsSumsTargetUsingHashMapApproach(int arr[], int target) {
		Map<Integer, Integer> nums = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if (nums.containsKey(complement)) {
				return new int[] { nums.get(complement), i };
			}
			nums.put(arr[i], i);
		}
		return null;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		System.out.println("BruteForceApproach: "+
				Arrays.toString(TwoSumProblem.getIndicesOfNumsSumsTargetUsingBruteForceApproach(nums, target)));
		System.out.println("HashMapApproach: "+
				Arrays.toString(TwoSumProblem.getIndicesOfNumsSumsTargetUsingHashMapApproach(nums, target)));

	}

}
