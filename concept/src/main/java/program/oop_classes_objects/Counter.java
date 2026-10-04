package program.oop_classes_objects;

public class Counter {
	/*
	 * Static vs Instance — Object Counter:  Create a Counter class with a static int
	 * count incremented on every instantiation, plus a static getCount().
	 * 
	 * EXAMPLE new Counter(); new Counter(); new Counter(); Counter.getCount(); // 3
	 * CONSTRAINTS & NOTES Explain in a comment why count must be static rather than
	 * an instance field.
	 */

	private static int count;
	
	public Counter() {
		count++;
	}
	public static int getCount() {
		return count;
	}
	public static void main(String[] args) {
		new Counter(); new Counter(); new Counter();new Counter();
		System.out.println(Counter.getCount());

	}

}
