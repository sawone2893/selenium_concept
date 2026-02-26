package selenium.training.assignment.five;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	/*
	 * Assignment 3 -> URL -> https://jqueryui.com/autocomplete/ Type “Java” in the
	 * ‘Tags’ field. Once done, click on the menu item “Download”
	 * 
	 */

	public static void main(String[] args) {
		String appUrl = "https://jqueryui.com/autocomplete/";
		String text = "Java";
		int waitTimeInSec = 5;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTimeInSec));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("tags")).sendKeys(text);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Download")).click();
		System.out.println("DownloadUrl: " + driver.getCurrentUrl());
		driver.close();

	}

}
