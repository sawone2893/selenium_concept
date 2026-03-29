package selenium.training.assignment.seven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3_KeyboardActions {

	/*
	 * Assignment 3 ->
	 * 
	 * URL -> https://text-compare.com/
	 * 
	 * Use actions class to perform below steps
	 * 
	 * Move your mouse and click on the left side text area.
	 * 
	 * Type your name.
	 * 
	 * Press Shift + Tab key to move your control to “Clear All” button
	 * 
	 * Click on “Clear All” which will clear the text area
	 * 
	 * Now press tab key and move your control to first text area again.
	 * 
	 * Type “HCL Tech”
	 * 
	 * Use Control + a to select and Control + c to copy.
	 * 
	 * Press tab to move to right side text area
	 * 
	 * Use Control + v to paste the copied text in right side text area
	 */

	public static void main(String[] args) {

		String appUrl = "https://text-compare.com/";
		int waitTime = 5;

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));


		WebElement leftTextArea = driver.findElement(By.id("inputText1"));
		//WebElement rightTextArea = driver.findElement(By.id("inputText2"));

		Actions act = new Actions(driver);
		//Move your mouse and click on the left side text area
		act.moveToElement(leftTextArea).click().sendKeys("Shabbir").keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).click().perform();
		//Press Shift + Tab key to move your control to “Clear All” button.Click on “Clear All” which will clear the text area
		//act.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).click().perform();
//		//Now press tab key and move your control to first text area again.Type “HCL Tech”
//		act.sendKeys(Keys.TAB).sendKeys("HCL").perform();
//		//Use Control + a to select and Control + c to copy.
//		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
//		//Press tab to move to right side text area
//		act.sendKeys(Keys.TAB).perform();
//		//Use Control + v to paste the copied text in right side text area
//		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		//driver.close();

	}

}
