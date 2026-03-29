package selenium.training.assignment.seven;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2_rightClick {

	/*
	 * Assignment 2 ->
	 * 
	 * URL -> http://swisnl.github.io/jQuery-contextMenu/demo.html
	 * 
	 * Use actions class to right click on button “right click me”.
	 * 
	 * From the contextual menu, scroll down and click on “Copy”.
	 * 
	 * Check if alert is present or not. If present, print “Alert” present.
	 * 
	 * Approve the alert.
	 */

	public static void main(String[] args) {

		String appUrl = "http://swisnl.github.io/jQuery-contextMenu/demo.html";
		int waitTime = 5;

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));

		WebElement rightClickMebtn = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);
		act.contextClick(rightClickMebtn).perform();
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());
			alert.accept();
			System.out.println("Alert Present!");
		} catch (Exception e) {
			System.out.println("Element is not visible in " + waitTime);
			e.printStackTrace();
		}
		
		driver.close();
	}

}
