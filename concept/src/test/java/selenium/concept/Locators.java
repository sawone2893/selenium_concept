package selenium.concept;

public class Locators {
	
	public static String button(String btnText) {
		return "//button[text()='"+btnText+"']";
	}
	
	public static String link(String linkText) {
		return "//a[text()='"+linkText+"']";
	}
	
	public static String textBox(String txtBoxLabel) {
		return "//label[text()='"+txtBoxLabel+"']/following::input[1]";
	}

}
