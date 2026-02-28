package selenium.training.assignment.six;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	/*
	 * Assignment 1 ->
	 * 
	 * URL - https://omayo.blogspot.com/ Use the Multi Selection Box list.
	 * 
	 * Use selectByIndex – to select first element of the list at index 0 
	 * Use selectByValue – to select second element of the list 
	 * Use selectByVisibleText – to select third element of the list.
	 * 
	 * Use list method -> getOptions to print all text associated with the list
	 * which is visible on the UI. Output should be “Volvo”, “Swift”, “Hyundai”,
	 * “Audi” 
	 * Use list method -> getAllSelectedOptions to print text of all elements
	 * which are selected. Output should be the one which you have selected using
	 * all 3 selection methods as given above.
	 */

	public static void main(String[] args) {
		String appUrl="https://omayo.blogspot.com/";
		int waitInSeconds=5;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitInSeconds));
		
		Select select= new Select(driver.findElement(By.id("multiselect1")));
		select.selectByIndex(0);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Hyundai");
		
		List<WebElement> options=select.getOptions();
		System.out.println("Available options:-----------------------------");
		for(WebElement e:options) {
			System.out.println(e.getText());
		}
		
		List<WebElement> selctedOptions=select.getAllSelectedOptions();
		System.out.println("Selected options:-----------------------------");
		for(WebElement e:selctedOptions) {
			System.out.println(e.getText());
		}
		
		driver.close();

	}

}
