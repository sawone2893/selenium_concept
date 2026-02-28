package selenium.training.assignment.two;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
	/*
	 * Assignment – 4 URL - https://demo.guru99.com/V4/ Click on hyperlink “here”
	 * which is present under “Steps To Generate Access. In Email field, enter your
	 * email address and click on “Submit”.
	 * 
	 * 
	 */

	public static void main(String args[]) {

		String appUrl = "https://demo.guru99.com/V4/";
		String emailId = "abcd1@gmail.com";
		WebDriver driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("here")).click();
		driver.findElement(By.name("emailid")).sendKeys(emailId);
		driver.findElement(By.name("btnLogin")).click();
		driver.close();

	}

}
