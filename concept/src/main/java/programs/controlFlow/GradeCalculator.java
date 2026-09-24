package programs.controlFlow;

public class GradeCalculator {
	
	

	public static String getGradeUsingTraditionalSwitch(int score) {
		if(score<0||score>100) {
			return "Invalid Score";
		}
		switch (score / 10) {
		case 9:
		case 10:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}

	public static String getGradeUsingModernSwitch(int score) {
		if(score<0||score>100) {
			return "Invalid Score";
		}
		return switch (score / 10) {
		case 9, 10 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
	}

	public static void main(String[] args) {
		System.out.println("Grade: " + GradeCalculator.getGradeUsingModernSwitch(185));

	}

}
