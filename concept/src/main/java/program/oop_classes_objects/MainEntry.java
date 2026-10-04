package program.oop_classes_objects;

import java.util.HashSet;
import java.util.Set;

public class MainEntry {

	public static void main(String[] args) {
		/*
		 * Engine engine= new Engine(250,"Petrol"); Car car= new
		 * Car("India","2026",engine); car.startCar();
		 */
		
		Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(30, 40);

        Set<Point> points = new HashSet<>();

        points.add(p1);
        points.add(p2);
        points.add(p3);

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());

        System.out.println("Set size: " + points.size());
        System.out.println("Set: " + points);
	}

}
