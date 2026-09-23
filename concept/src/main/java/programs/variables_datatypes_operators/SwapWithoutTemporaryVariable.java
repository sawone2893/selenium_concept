package programs.variables_datatypes_operators;

public class SwapWithoutTemporaryVariable {

	public static void swapTwoUsingArithmetic(int num1, int num2) {
		System.out.println("Number before Swapping\nNum1: "+num1+", Num2: "+num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Number after Swapping using Arithmetic\nNum1: "+num1+", Num2: "+num2);
	}
	
	public static void swapTwoUsingXOR(int num1, int num2) {
		System.out.println("Number before Swapping\nNum1: "+num1+", Num2: "+num2);
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("Number after Swapping using XOR\nNum1: "+num1+", Num2: "+num2);
	}

	public static void main(String[] args) {
		SwapWithoutTemporaryVariable.swapTwoUsingArithmetic(25, 30);
		SwapWithoutTemporaryVariable.swapTwoUsingXOR(25, 30);

	}

}
