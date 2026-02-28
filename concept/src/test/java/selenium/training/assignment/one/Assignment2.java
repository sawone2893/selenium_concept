package selenium.training.assignment.one;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	/*
	 * Assignments – 2 -> URL - https://demoqa.com/text-box
	 * 
	 * Navigate to the webpage. Enter your Name, Email Enter your current address
	 * [as given below] it should exactly look like this line by line. HCL
	 * Technology, Sector – 60, Noida - UP
	 * 
	 * [Hint – user “\n” which is the new line character in Java]
	 */

	public static void main(String[] args) {
		String appUrl = "https://demoqa.com/text-box";
		String userName = "shabbir";
		String userEmail = "shab@gmail.com";
		String currentAddress = "HCL Technology,\nSector – 60,\nNoida - UP";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.id("userName")).sendKeys(userName);
		driver.findElement(By.id("userEmail")).sendKeys(userEmail);
		driver.findElement(By.id("currentAddress")).sendKeys(currentAddress);
		driver.close();
	}

}
