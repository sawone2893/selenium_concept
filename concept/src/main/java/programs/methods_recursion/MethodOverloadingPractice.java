package programs.methods_recursion;

public class MethodOverloadingPractice {
	/*
	 * Write add() overloaded for (int,int), (double,double), (int,int,int), and
	 * (String,String) — concatenation.
	 * 
	 * CONSTRAINTS & NOTES Demonstrate a case where overload resolution could be
	 * ambiguous (e.g. passing a long) and explain how Java resolves it.
	 */

	public static int add(int a, int b) {
		return a + b;
	}

	public static double add(double a, double b) {
		return a + b;
	}
	
	public static float add(float a, float b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static String add(String a, String b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(MethodOverloadingPractice.add(5, 6));
		System.out.println(MethodOverloadingPractice.add(5.5, 6.87));
		System.out.println(MethodOverloadingPractice.add(5, 6, 8));
		System.out.println(MethodOverloadingPractice.add("Shabbir", "Rayeen"));
		long x = 10L;
		long y = 20L;
		System.out.println(MethodOverloadingPractice.add(x,y));

	}

}
