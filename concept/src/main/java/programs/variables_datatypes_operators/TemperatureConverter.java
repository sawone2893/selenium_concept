package programs.variables_datatypes_operators;

public class TemperatureConverter {

	private final static double ABSOLUTE_ZERO = -273.15;

	private static double getFahrenheit(double celsius) {
		double farh = (celsius * 9) / 5 + 32;
		return farh;
	}

	private static double getKevin(double celsius) {
		double kelvin = celsius + 273.15;
		return kelvin;
	}

	public static void printTemperatureInFahrenheitAndKelvin(double celsius) {
		if (celsius < ABSOLUTE_ZERO) {
			System.out.println("WARNING: Entered temperature less thn absolute zero!");
		} else {
			System.out.printf("Fahrenheit: %.2f, Kelvin: %.2f", getFahrenheit(celsius), getKevin(celsius));
		}
	}

	public static void main(String[] args) {
		TemperatureConverter.printTemperatureInFahrenheitAndKelvin(37.0);

	}

}
