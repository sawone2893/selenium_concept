package selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Config.appUrl2);
		Actions action= new Actions(driver);
		//Mouse Actions
		//Perform Hover action
		action.moveToElement(driver.findElement(By.linkText("Contribute"))).perform();
		action.moveToElement(driver.findElement(By.linkText("CLA"))).perform();
		action.click().perform();
		String title=driver.getTitle();
		System.out.println(title);
		
		//Perform Right click
		action.contextClick(driver.findElement(By.linkText("Blog"))).perform();
		Thread.sleep(5000);
		
		//Perfom drop and drag
		driver.get(Config.appUrl2);
		driver.findElement(By.linkText("Droppable")).click();
		WebElement srcEle=driver.findElement(By.id("draggable"));
		WebElement targetEle=driver.findElement(By.id("droppable"));
		action.dragAndDrop(srcEle,targetEle).perform();
		Thread.sleep(5000);
		driver.close();

	}

}
