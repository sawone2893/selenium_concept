package programs.variables_datatypes_operators;

public class TypeCastingExplorer {

	public static void main(String[] args) {

		double doubleValue = 9.9999;
		int intValue = (int) doubleValue;
		long longValue = (long) doubleValue;
		float floatValue = (float) doubleValue;

		System.out.println("Original double: " + doubleValue);
		System.out.println("As int: " + intValue);
		System.out.println("As long: " + longValue);
		System.out.println("AS float: " + floatValue);

		System.out.println("========================================");

		doubleValue =  Integer.MAX_VALUE+1;
		intValue = (int) doubleValue;
		longValue = (long) doubleValue;
		floatValue = (float) doubleValue;

		System.out.println("Original double larger than the Integer.MAX_VALUE: " + doubleValue);
		System.out.println("As int: " + intValue);
		System.out.println("As long: " + longValue);
		System.out.println("AS float: " + floatValue);

	}

}
