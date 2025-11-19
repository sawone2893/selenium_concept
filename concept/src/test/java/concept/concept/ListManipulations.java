package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListManipulations {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		
		//Single Selection
		Select select= new Select(driver.findElement(By.id("colors")));
		select.selectByVisibleText("Red");
		select.selectByIndex(1);
		select.selectByValue("green");
		select.deselectAll();
		
		//Multi-Selection
		if(select.isMultiple()) {
			select.selectByVisibleText("Red");
			select.selectByVisibleText("Green");
			select.selectByVisibleText("Blue");
		}
		
		driver.close();
	}

}
