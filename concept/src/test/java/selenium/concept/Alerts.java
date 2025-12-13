package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		// Simple Alert
		driver.findElement(By.xpath(Locator.button("Simple Alert"))).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// Confirmation Alert
		driver.findElement(By.xpath(Locator.button("Confirmation Alert"))).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath(Locator.button("Confirmation Alert"))).click();
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath(Locator.button("Confirmation Alert"))).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println(alertText);
		// Prompt Alert
		driver.findElement(By.xpath(Locator.button("Prompt Alert"))).click();
		driver.switchTo().alert().sendKeys("Welcome");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
