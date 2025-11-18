package concept.concept;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
	@Test
	public void test() throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl);
		
		//Using Action class
		Actions action =new Actions(driver);
		//Mouse Hover
		
		action.moveToElement(driver.findElement(By.xpath(Locators.button("Point Me")))).perform();
		driver.findElement(By.xpath(Locators.link("Mobiles"))).click();
		
		//Double Click
		action.doubleClick(driver.findElement(By.xpath(Locators.button("Copy Text")))).perform();
		assertEquals(driver.findElement(By.id("field2")).getAttribute("value"), "Hello World!");
		
		//Drop and Drag
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		
	}

}
