package program.oop_classes_objects;

import java.util.Objects;

public class Point {

	/*
	 * equals() and hashCode() — Point Class Create Point(x, y). Override equals()
	 * so points are equal by coordinates, and hashCode() consistently. Add
	 * duplicates to a HashSet to confirm rejection.
	 * 
	 * CONSTRAINTS & NOTES Follow the contract: if a.equals(b), then a.hashCode() ==
	 * b.hashCode(). Use Objects.equals()/Objects.hash().
	 */

	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Point other = (Point) obj;

        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
