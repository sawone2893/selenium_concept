package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl2);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.findElement(By.id("tags")).sendKeys("Welcome");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Button")).click();
		driver.close();

	}

}
