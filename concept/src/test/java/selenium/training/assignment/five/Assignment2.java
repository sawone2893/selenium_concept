package selenium.training.assignment.five;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	/*
	 * Assignment 2 – URL - https://demo.automationtesting.in/Windows.html Click on
	 * “Click” button just below -> Click the button to open multiple windows Switch
	 * your control to the window having title “Index”. Type your mail ID and click
	 * as shown below
	 * 
	 * 
	 * Switch your control to the next window having title “Selenium”. Print the
	 * title of the window.
	 * 
	 * Now traverse back to the parent window. Print the title of the parent window.
	 * 
	 * Finally close all windows.
	 * 
	 */

	public static void main(String[] args) {
		String appUrl = "https://demo.automationtesting.in/Windows.html";
		String clickBtnXpath = "//div[@id='Multiple']/button[contains(@class,'btn-info')]";
		String mailId = "abc@gmail.com";
		int waitTimeInSec = 5;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTimeInSec));
		driver.findElement(By.linkText("Open Seperate Multiple Windows")).click();
		// Switch control to the window having title “Index”.
		driver.findElement(By.xpath(clickBtnXpath)).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String win : allWindows) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			if (title.equalsIgnoreCase("Index")) {
				driver.findElement(By.id("email")).sendKeys(mailId);
				driver.findElement(By.id("enterimg")).click();
				break;
			}
		}
		// Switch control to the next window having title “Selenium”.
		for (String win : allWindows) {
			driver.switchTo().window(win);
			String title = driver.getTitle();
			if (title.equalsIgnoreCase("Selenium")) {
				System.out.println("Next Window title: " + title);
				break;
			}
		}

		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window Title: " + driver.getTitle());
		driver.quit();

	}

}
