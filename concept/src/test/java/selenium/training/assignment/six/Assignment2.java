package selenium.training.assignment.six;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	/*
	 * Assignment 2 -> URL - https://testautomationpractice.blogspot.com/ Count the
	 * number of list present in the page.
	 * 
	 */

	public static void main(String[] args) {
		String appUrl = "https://testautomationpractice.blogspot.com/";
		int waitInSeconds = 5;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitInSeconds));
		
		List<WebElement> list = driver.findElements(By.tagName("select"));
		int listCount = list.size();
		System.out.println("List Count: " + listCount);
		
		driver.close();

	}

}
