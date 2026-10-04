package programs.methods_recursion;

public class FactorialIterativeRecursive {

	public static int factIterative(int n) {
		int fact = 1;
		if (n == 0) {
			return 1;
		}
		if (n < 0) {
			throw new IllegalArgumentException("n should be positve number");
		}
		while (n > 0) {
			fact *= n;
			n--;
		}
		return fact;
	}

	public static int factRecursive(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (n < 0) {
			throw new IllegalArgumentException("n should be positve number");
		}
		return n * factRecursive(n - 1);
	}

	public static void main(String[] args) {

		System.out.println(FactorialIterativeRecursive.factIterative(5));
		System.out.println(FactorialIterativeRecursive.factRecursive(15));
		
		System.out.println(FactorialIterativeRecursive.factIterative(100000));
		System.out.println(FactorialIterativeRecursive.factRecursive(100000));

	}

}
