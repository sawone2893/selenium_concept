package selenium.training.assignment.seven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1_doubleClick {
	
	/*
	 * Assignment 1 -> [Use Actions class]
	 * 
	 * URL ->
	 * https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3
	 * 
	 * Double click on “Copy Text” button.
	 * 
	 * From “Field2”, read the text and print.
	 * 
	 * Print the title of the page.
	 */

	public static void main(String[] args) {
		
		String appUrl="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3";
		int waitTime=5;
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
		
		driver.switchTo().frame("iframeResult");
		
		WebElement copyTextbtn= driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		Actions act= new Actions(driver);
		act.doubleClick(copyTextbtn).perform();
		
		String field2Text=driver.findElement(By.id("field2")).getAttribute("value");
		System.out.println("Field 2 Text: "+field2Text);
		driver.switchTo().defaultContent();
		System.out.println("Page Title: "+driver.getTitle());
		driver.close();

	}

}
