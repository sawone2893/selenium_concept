package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Entering text in textbox using javascript.
		WebElement name=driver.findElement(By.id("name"));
		js.executeScript("arguments[0].value='Shabbir';", name);
		//Click a web element
		WebElement ele=driver.findElement(By.className("start"));
		js.executeScript("arguments[0].click();", ele);
		
		//launch a url
		js.executeScript("window.location='"+Config.appUrl2+"'");
		
		//Scroll
		js.executeScript("window.scrollBy(0,500)");
		driver.close();
				



	}

}
