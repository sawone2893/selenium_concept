package concept.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Alerts {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);

		driver.findElement(By.xpath(Locators.button("Simple Alert"))).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath(Locators.button("Confirmation Alert"))).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath(Locators.button("Prompt Alert"))).click();
		driver.switchTo().alert().sendKeys("Welcome");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
