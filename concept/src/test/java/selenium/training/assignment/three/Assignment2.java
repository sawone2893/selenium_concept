package selenium.training.assignment.three;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	
	/*
	 * Assignment – 2 URL - https://formy-project.herokuapp.com/buttons
	 * 
	 * Create a single common xpath string and use the same to find the number of
	 * buttons present in the page.
	 */

	public static void main(String[] args) {
		String appUrl="https://formy-project.herokuapp.com/buttons";
		String buttonsXpath="//button[@type='button']";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> buttons=driver.findElements(By.xpath(buttonsXpath));
		int buttonsCount=buttons.size();
		System.out.println("Form Elements Count: "+buttonsCount);
		driver.close();

	}

}
