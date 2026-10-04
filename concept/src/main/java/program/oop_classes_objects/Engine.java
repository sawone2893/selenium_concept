package program.oop_classes_objects;

public class Engine {

	/*
	 * Composition — Car and Engine Design Engine (horsepower, fuelType, start())
	 * and a Car that has-a Engine field plus make/model. startCar() delegates to
	 * engine.start().
	 * 
	 * CONSTRAINTS & NOTES Explain why composition ("has-a") fits better than
	 * inheritance here — a Car is not a type of Engine.
	 */

	private int horsepower;
	private String fuelType;

	public Engine(int horsepower, String fuelType) {
		this.horsepower = horsepower;
		this.fuelType = fuelType;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void start() {
		System.out.println(horsepower + " HP " + fuelType + " engine started.");
	}

}
