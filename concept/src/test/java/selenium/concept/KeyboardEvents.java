package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvents {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		// Type capital letters.
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("name"))).click().keyDown(Keys.SHIFT).sendKeys("shabbir")
				.perform();

		// Select the text
		actions.moveToElement(driver.findElement(By.id("name"))).click().keyDown(Keys.CONTROL).sendKeys("a").perform();
		driver.close();

	}

}
