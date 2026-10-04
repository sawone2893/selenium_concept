package programs.methods_recursion;

import java.util.Arrays;

public class FibonacciWithMemoization {

	/*
	 * Compute the nth Fibonacci number recursively. Implement naively, time it at n
	 * = 40, then optimize with memoization and re-time it.
	 * 
	 * EXAMPLE Input: 10 → Output: 55 CONSTRAINTS & NOTES Document the complexity
	 * difference: naive O(2^n) vs. memoized O(n). 1 1 2 3 5 8 13 21 34 55
	 */

	public static long fibonacciNaive(int n) {

		if (n <= 1) {
			return n;
		}
		return fibonacciNaive(n - 1) + fibonacciNaive(n - 2);
	}

	public static long fibonacciMemoized(int n, long[] memo) {

		if (n <= 1) {
			return n;
		}

		if (memo[n] != -1) {
			return memo[n];
		}

		memo[n] = fibonacciMemoized(n - 1, memo) + fibonacciMemoized(n - 2, memo);

		return memo[n];
	}

	public static void main(String[] args) {
		System.out.println(FibonacciWithMemoization.fibonacciNaive(10));

		int n = 40;

		// -----------------------------
		// Naive
		// -----------------------------

		long startNaive = System.nanoTime();

		long naiveResult = fibonacciNaive(n);

		long endNaive = System.nanoTime();

		long naiveTime = endNaive - startNaive;

		System.out.println("Naive Fibonacci:");
		System.out.println("Result : " + naiveResult);
		System.out.println("Time   : " + naiveTime + " ns");
		System.out.println("Time   : " + (naiveTime / 1_000_000.0) + " ms");

		// -----------------------------
		// Memoized
		// -----------------------------

		long[] memo = new long[n + 1];

		Arrays.fill(memo, -1);

		long startMemo = System.nanoTime();

		long memoResult = fibonacciMemoized(n, memo);

		long endMemo = System.nanoTime();

		long memoTime = endMemo - startMemo;

		System.out.println("\nMemoized Fibonacci:");
		System.out.println("Result : " + memoResult);
		System.out.println("Time   : " + memoTime + " ns");
		System.out.println("Time   : " + (memoTime / 1_000_000.0) + " ms");

	}

}
