package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardActions {
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		Actions action= new Actions(driver);
		
		//Typing name in textbox
		driver.findElement(By.xpath(Locators.textBox("Name:"))).click();
		action.sendKeys("Shabbir").perform();
		
		//Tying name character by character
		driver.findElement(By.xpath(Locators.textBox("Email:"))).click();
		action.keyDown("a")
				.keyUp("a")
				.keyDown("b")
				.keyUp("b")
				.perform();
		
		//Perform key combinations
		action.keyDown(Keys.CONTROL).keyDown("a").keyUp("a").keyUp(Keys.CONTROL).perform();
		
		//Performing Control click
		driver.findElement(By.xpath("//option[]")).click();
		action.keyDown(Keys.CONTROL).click(null).click().keyUp(Keys.CONTROL).perform();
		
		
	}

}
