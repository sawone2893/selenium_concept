package selenium.training.assignment.four;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckWEPresence {

	/*
	 * Assignment 2- URL - https://www.selenium.dev/downloads/ Verify whether the
	 * below 3 WebElements are present or not. If present, pass the test case. Else
	 * fail. Use the code snipper as given below.
	 * 
	 * 3 WebElements corresponding to - .NET/C#, Ruby and Java [as shown below]
	 */

	public static void main(String[] args) {

		String appUrl = "https://www.selenium.dev/downloads/";
		String cardTitle = "//p[contains(@class,'card-title') and text()='#0#']";

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Declare all 3 WebElements here.
		WebElement cardTitleDotNet = driver.findElement(By.xpath(cardTitle.replace("#0#", ".NET/C#")));
		WebElement cardTitleRuby = driver.findElement(By.xpath(cardTitle.replace("#0#", "Ruby")));
		WebElement cardTitleJava = driver.findElement(By.xpath(cardTitle.replace("#0#", "Java")));

		// Call the below function checkElementPresence for all WebElements
		// Apply LOGICAL AND for the 3 result
		// If all 3 are present, print test pass. Else print test fail
		CheckWEPresence presence = new CheckWEPresence();
		if (presence.checkElementPresence(driver, cardTitleDotNet)
				&& presence.checkElementPresence(driver, cardTitleRuby)
				&& presence.checkElementPresence(driver, cardTitleJava)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
		
		driver.close();

	}

// Implement the below function

	public boolean checkElementPresence(WebDriver driver, WebElement element) {
		boolean result = true;
		// DEclare an explicit timer here use the below validation
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Put the below statement in try - catch and set the value of result as false
		// in the catch block
		wait.until(ExpectedConditions.visibilityOf(element));

		return result;
	}

}
