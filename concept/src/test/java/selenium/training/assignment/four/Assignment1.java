package selenium.training.assignment.four;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {
	/*
	 * Assignment 1 -> URL - https://the-internet.herokuapp.com/javascript_alerts
	 * Using XPATH text() function, create a XPATH to click on “Click for JS
	 * Prompt”. Use Explicit Wait to get and handle the alert instance. Print the
	 * alert text as given below. Type HCL in the text field and click on OK. If you
	 * see HCL in Result as given below, print Test Passed. Else print fail.
	 */

	public static void main(String[] args) {
		String appUrl = "https://the-internet.herokuapp.com/javascript_alerts";
		String jsPromptBtnXpath = "//button[text()='Click for JS Prompt']";
		String text = "HCL";
		String expectedMsg = "You entered: " + text;
		int waitTimeInSec = 5;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		try {
			driver.findElement(By.xpath(jsPromptBtnXpath)).click();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSec));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.sendKeys(text);
			alert.accept();
		} catch (Exception e) {
			System.out.println("Element isd not visible in " + waitTimeInSec);
			e.printStackTrace();
		}

		String actualMsg = driver.findElement(By.id("result")).getText();
		if (actualMsg.equals(expectedMsg)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}

}
