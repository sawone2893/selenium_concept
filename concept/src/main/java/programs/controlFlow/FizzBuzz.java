package programs.controlFlow;

public class FizzBuzz {

	public static void fizzBuzzUsingIfElse(int n) {

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

	public static void fizzBuzzUsingTernary(int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			result = (i % 3 == 0) ? ((i % 5 == 0) ? "FizzBuzz" : "Fizz") : ((i % 5 == 0) ? "Buzz" : String.valueOf(i));
			System.out.println(result);
		}

	}

	public static void fizzBuzzUsingTraditionalSwitch(int n) {
		for (int i = 1; i <= n; i++) {
			switch (i % 15) {
			case 0:
				System.out.println("FizzBuzz");
				break;
			case 3:
			case 6:
			case 9:
			case 12:
				System.out.println("Fizz");
				break;
			case 5:
			case 10:
				System.out.println("Buzz");
				break;
			default:
				System.out.println(i);
			}
		}

	}

	public static void fizzBuzzUsingModernSwitch(int n) {
		for (int i = 1; i <= n; i++) {
			switch (i % 15) {
			case 0 -> System.out.println("FizzBuzz");
			case 3, 6, 9, 12 -> System.out.println("Fizz");
			case 5, 10 -> System.out.println("Buzz");
			default -> System.out.println(i);
			}
		}

	}

	public static void main(String[] args) {
		FizzBuzz.fizzBuzzUsingModernSwitch(100);

	}

}
