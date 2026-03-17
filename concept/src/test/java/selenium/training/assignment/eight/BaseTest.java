package selenium.training.assignment.eight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	/*
	 * ULR -> https://www.selenium.dev/downloads/
	 * 
	 * Both the below classes should be created using TestNG.
	 * Create a parent class which will take care of –
	 * 
	 * Driver declaration and Initialization Navigation to the URL Hint - Use
	 * annotation in parent. As Child class will extend parent class, annotation
	 * will work for child class
	 * 
	 */
	
	public WebDriver driver;
	private String appUrl="https://www.selenium.dev/downloads/";
	@BeforeTest
	public void beforeTest() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
