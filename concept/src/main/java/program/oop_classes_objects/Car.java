package program.oop_classes_objects;

public class Car {

	private String make;
	private String model;
	private Engine engine;

	public Car(String make, String model, Engine engine) {
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	public void startCar() {
		System.out.println(make + " " + model + " is starting...");
		engine.start();
	}

}
