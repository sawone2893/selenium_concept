package selenium.training.assignment.two;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1_5 {
	/*
	 * Assignment – 1 URL - https://demo.guru99.com/test/facebook.html Use CSS
	 * Selector to enter text in “Email or Phone”, “Password” and click on “Login”
	 * button
	 */

	public static void main(String args[]) {

		String appUrl = "https://demo.guru99.com/test/facebook.html";
		String userEmail = "xyz@gmail.com";
		String password = "xyz@gmail.com";
		WebDriver driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.cssSelector("#email")).sendKeys(userEmail);
		driver.findElement(By.cssSelector("#pass")).sendKeys(password);
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.close();
	}

}
