package programs.controlFlow;

public class CollatzSequence {

	public static void printCollatzSequence(int n) {
		int steps = 0;
		System.out.print("Sequence: " + n);
		while (n >1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = 3 * n + 1;
			}
			System.out.print(" -> " + n);
			steps++;
		}
		System.out.println("\nSteps: " + steps);

	}

	public static void main(String[] args) {
		CollatzSequence.printCollatzSequence(27);

	}

}
