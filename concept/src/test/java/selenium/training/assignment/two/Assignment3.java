package selenium.training.assignment.two;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	/*
	 * Assignment – 3 URL - https://demo.guru99.com/test/facebook.html Use locator
	 * class name to enter “Emali ID”. Use locator name to enter “Password”. Use
	 * locator ID to click on “Log In” button.
	 * 
	 */

	public static void main(String args[]) {

		String appUrl = "https://demo.guru99.com/test/facebook.html";
		String userEmail = "xyz@gmail.com";
		String password = "xyz@gmail.com";
		WebDriver driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.className("inputtext")).sendKeys(userEmail);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_b")).click();
		driver.close();

	}

}
