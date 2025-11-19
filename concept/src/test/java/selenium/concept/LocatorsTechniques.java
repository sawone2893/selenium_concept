package selenium.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTechniques {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		// By Id
		driver.findElement(By.id("name")).sendKeys("Shabbir");

		// By Name
		driver.findElement(By.name("start")).click();

		// By ClassName
		driver.findElement(By.className("home-link")).click();

		// By TagName
		List<WebElement> labels = driver.findElements(By.tagName("label"));
		for (WebElement ele : labels) {
			System.out.println(ele.getText());
		}
		// By Link Text
		driver.findElement(By.linkText("Home")).click();
		// By Partial Link Text
		driver.findElement(By.partialLinkText("Hidden Elements"));
		// By CSS
		driver.findElement(By.cssSelector("#email")).sendKeys("Email");
		// By Xpath
		driver.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("8656083686");
		
		driver.close();

	}

}
