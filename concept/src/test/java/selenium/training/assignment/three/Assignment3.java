package selenium.training.assignment.three;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	/*
	 * Assignment – 3 URL - https://demo.guru99.com/V4/
	 * 
	 * Create a single locator String which can locate both the “LOGIN” and “RESET”
	 * button. Use the above locator string with the help of ndexing technique to
	 * click on RESET button [Do not simply write ->
	 * driver.findElement(By.name(“btnReset”)).click()]
	 */

	public static void main(String[] args) {
		String appUrl="https://demo.guru99.com/V4/";
		int index=2;
		String loginResetbtnXpath="//input[contains(@name,'btn')]["+index+"]";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(loginResetbtnXpath)).click();
		driver.close();

	}

}
