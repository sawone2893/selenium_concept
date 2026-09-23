package programs.variables_datatypes_operators;

public class BMICalculatorWithCategory {
	
	private static double getBMI(double weight,double height) {
		double bmi=weight/(height*height);
		return bmi;
	}
	
	public static void classifyBMIWithCategory(double weight,double height) {
		if(weight>0 && height>0) {
			String category="";
			double bmi=getBMI(weight,height);
			if(bmi>0 && bmi<18.5) {
				category="Underweight";
			}else if(bmi>=18.5 && bmi<=24.9) {
				category="Normal";
			}else if(bmi>=25 && bmi<=29.9) {
				category="Overweight";
			}else {
				category="Obese";
			}
			System.out.printf("BMI = %.1f, Category = %s",bmi,category);
		}else {
		System.out.println("WARNING: BMI can not be calculated for negative weight or height!");
		}
	}

	public static void main(String[] args) {
		BMICalculatorWithCategory.classifyBMIWithCategory(70, 1.75);

	}

}
