package programs.methods_recursion;

public class VariableArguments {
	/*
	 * Write sum(int... numbers) that sums any number of int arguments, including
	 * zero.
	 * 
	 * EXAMPLE sum(1,2,3,4) → 10 sum() → 0 CONSTRAINTS & NOTES Also write
	 * printAll(String label, Object... items), combining varargs with a regular
	 * parameter.
	 */
	
	public static int sum(int...numbers) {
		int sum=0;
		for(int n:numbers) {
			sum+=n;
		}
		return sum;
	}
	
	public static void printAll(String label, Object... items){
		System.out.println("Label: "+label);
		System.out.println("Items:");
		for(Object item:items){
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		System.out.println("Sum 2 Numbers: "+VariableArguments.sum(1,2));
		System.out.println("Sum 3 Numbers: "+VariableArguments.sum(1,2,5));
		System.out.println("Sum 4 Numbers: "+VariableArguments.sum(1,2,5,6));
		System.out.println("Sum 5 Numbers: "+VariableArguments.sum(1,2,4,2,3));
		System.out.println("Sum 6 Numbers: "+VariableArguments.sum(1,2,2,4,5,9));
		
		VariableArguments.printAll("Fruits","Apple","Orange","Gauva","Kiwi");

	}

}
