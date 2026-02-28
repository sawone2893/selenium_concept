package selenium.training.assignment.one;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	/*
	 * Assignment 1 -> Navigate to URL - https://demo.guru99.com/V4/. Check the
	 * title of the page. If title is “Guru99 Bank Home Page”, print the message
	 * title is correct. Else print “Wrong Title”
	 * 
	 * Hint -> Use Java String comparison method -> equals()
	 */

	public static void main(String[] args) {
		String appUrl="https://demo.guru99.com/V4/";
		String expectedTitle="Guru99 Bank Home Page";
		WebDriver driver= new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Wrong Title");
		}
		driver.close();
	}

}
