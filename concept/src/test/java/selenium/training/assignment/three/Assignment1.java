package selenium.training.assignment.three;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	/*
	 * Assignment – 1 URL - https://formy-project.herokuapp.com/form
	 * Create a single common xpath string which will identify the below Web Element
	 * • First name • Last name • Job Title • Date Use the same XPATH string in
	 * driver.findElements to store all 4 Web Elements in a list and print the size
	 */

	public static void main(String[] args) {
		String appUrl="https://formy-project.herokuapp.com/form";
		String formElementsXpath="//input[@class='form-control']";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> formElements=driver.findElements(By.xpath(formElementsXpath));
		int formElementsCount=formElements.size();
		System.out.println("Form Elements Count: "+formElementsCount);
		driver.close();

	}

}
