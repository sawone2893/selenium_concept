package selenium.training.assignment.two;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	/*
	 * Assignment – 2 URL - https://demo.guru99.com/V4/ Count the number of
	 * hyperlinks present in the page. Print the text associated with the hyperlink
	 * if it is not blank.
	 * 
	 */

	public static void main(String args[]) {

		String appUrl = "https://demo.guru99.com/V4/";

		WebDriver driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countLinks = links.size();
		System.out.println("Links Count: " + countLinks);

		for (WebElement link : links) {
			String linkText = link.getText();
			if (linkText != null) {
				System.out.println(linkText);
			}
		}
		driver.close();
	}

}
