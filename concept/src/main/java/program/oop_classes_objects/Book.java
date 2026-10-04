package program.oop_classes_objects;

public class Book {

	/*
	 * Basic Class Design — Book : Design a Book class with private title, author,
	 * price. Include a constructor, getters/setters, and a toString().
	 * 
	 * EXAMPLE Book b = new Book("1984", "George Orwell", 15.99); // "1984" by
	 * George Orwell - $15.99 CONSTRAINTS & NOTES The price setter should reject
	 * negative values (IllegalArgumentException).
	 */

	/*
	 * Constructor Overloading & Chaining Give Book three constructors: no-arg (all
	 * defaults), two-arg (title, author), and full three-arg — chained via
	 * this(...).
	 * 
	 * CONSTRAINTS & NOTES Verify each constructor path produces a correctly
	 * initialized object.
	 */

	private String title;
	private String author;
	private double price;

	public Book() {
		this("Unknown", "Unknow", 0.0);
	}

	public Book(String title, String author) {
		this(title, author, 0.0);
	}

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price < 0) {
			throw new IllegalArgumentException("Price must be postive value");
		} else {
			this.price = price;
		}
	}

	public String toString() {
		return this.title + " by " + this.author + " - $" + this.price;
	}

	public static void main(String[] args) {
		Book b = new Book("1984", "George Orwell", 15.99);
		System.out.println(b.toString());
		b.setPrice(-56.2);
		System.out.println(b.toString());

	}
	
	//1261301905

}
