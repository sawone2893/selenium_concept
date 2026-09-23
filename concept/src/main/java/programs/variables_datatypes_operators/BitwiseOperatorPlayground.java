package programs.variables_datatypes_operators;

public class BitwiseOperatorPlayground {

	public static void main(String[] args) {
		System.out.println("========When a and b Positive numbers=======");
		int a = 12;
		int b = 25;
		int result = a & b;
		System.out.println("a & b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = a | b;
		System.out.println("a | b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = a ^ b;
		System.out.println("a ^ b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = ~a;
		System.out.println("~ a = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = a << 2;
		System.out.println("a << 2 = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = b >> 2;
		System.out.println("a >> b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		System.out.println("=========When a and b Negative numbers========");
		a = -12;
		b = -25;
		
		result = a & b;
		System.out.println("a & b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = a | b;
		System.out.println("a | b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = a ^ b;
		System.out.println("a ^ b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = ~a;
		System.out.println("~ a = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = a << 2;
		System.out.println("a << 2 = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

		result = b >> 2;
		System.out.println("a >> b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");
		
		result = b >>> 2;
		System.out.println("a >>> b = " + result + "( binary: " + Integer.toBinaryString(result) + " )");

	}

}
