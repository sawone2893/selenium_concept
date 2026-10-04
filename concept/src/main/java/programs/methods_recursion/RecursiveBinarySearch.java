package programs.methods_recursion;

public class RecursiveBinarySearch {

	/*
	 * Given a sorted array and a target, implement binary search recursively,
	 * returning the index or -1.
	 * 
	 * EXAMPLE arr = {1,3,5,7,9,11}, target = 7 → 3 CONSTRAINTS & NOTES Track and
	 * print the number of recursive calls to observe O(log n) behavior. Test a
	 * missing target.
	 */

	public static int findNumIndex(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 11 };
		int target = 7;
		System.out.println(RecursiveBinarySearch.findNumIndex(arr, target));

	}

}
