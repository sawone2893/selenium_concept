package programs.controlFlow;

public class PrimeNumberChecker {

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(PrimeNumberChecker.isPrime(17));
		System.out.println(PrimeNumberChecker.isPrime(18));
	}

}
